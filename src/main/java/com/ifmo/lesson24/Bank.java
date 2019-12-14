package com.ifmo.lesson24;

import com.ifmo.lesson4.Library;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;

public class Bank {
    private static Map<Long, String> users = new ConcurrentHashMap<Long, String>();
    private static List<Account> accounts = new CopyOnWriteArrayList<>();
    private static BlockingQueue<Transaction> log = new LinkedBlockingDeque<>();
    private static boolean logOn = false;

    private class User {
        private final long id;
        private final String name;

        private User(long id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    private class Account {
        private final long id;
        private final long userId;
        private volatile long amount;

        private Account(long id, long userId, long amount) {
            this.id = id;
            this.userId = userId;
            this.amount = amount;
        }
    }

    private static class Transaction {
        private final BigInteger transactionId;
        private final long fromAccountId;
        private final long toAccountId;
        private final long amount;
        private final boolean success;

        private Transaction(long fromAccountId, long toAccountId, long amount, boolean success) {
            this.success = success;
            this.transactionId = new BigInteger("" + System.currentTimeMillis() + fromAccountId + toAccountId + amount);
            this.fromAccountId = fromAccountId;
            this.toAccountId = toAccountId;
            this.amount = amount;
        }

        @Override
        public String toString() {
            return "Transaction{" +
                    "transactionId=" + transactionId +
                    ", fromAccountId=" + fromAccountId +
                    ", toAccountId=" + toAccountId +
                    ", amount=" + amount +
                    ", success=" + success +
                    '}';
        }
    }

    public static void main(String[] args) {
        // 1. Сгенерируйте пользователей и их аккаунты (все идентификаторы должны быть уникальны).
        // 2. Переводите деньги со случайного аккаунта на случайный в 100 потоках.
        // Другими словами, создайте 100 потоков или пул из 100 потоков, в которых
        // выполните перевод вызовом метода transferMoney().

        Bank bank = new Bank();
        bank.clientGenerate(10);

        Thread logger = new Thread(new Logger());
        logger.start();

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Transfer());
            thread.start();
        }


    }

    // TODO Самая главная часть работы!
    public static synchronized void transferMoney(Account from, Account to, long amount) {
        // 1. Атомарно и потокобезопасно перевести деньги в количестве 'amount' со счёта 'from' на счёт 'to'.
        // 2. Создать объект Transaction, содержащий информацию об операции и отправить в очередь
        // потоку Logger, который проснётся и напечатает её.
        boolean res = false;
        Object monitor = new Object();

        if (from.id == to.id){
            System.out.println("Transaction is not correct!!!");
        }

        else if (from.amount - amount >= 0) {
            to.amount += amount;
            from.amount -= amount;
            res = true;

        boolean logOn = true;
        log.add(new Transaction(from.id, to.id, amount, res));}

    }

    public void clientGenerate(int number) {

        List<String> NAMES = List.of("Petya", "Vasya", "Masha", "Gosha", "Jhon");

        Random rnd = new Random();
        long id = 1;

        for (int i = 0; i < number; i++) {
            users.put(id, NAMES.get(rnd.nextInt(NAMES.size())));
            accounts.add(new Account(id, id, rnd.nextInt(999999)));
//            System.out.println(users);
//            System.out.println(accounts);
            id++;
        }

    }


    public static class Transfer implements Runnable {

        @Override
        public void run() {
            Random rnd = new Random();
            Account from = accounts.get(rnd.nextInt(10));
            Account to = accounts.get(rnd.nextInt(10));
            long amount = rnd.nextInt(999999);
            transferMoney(from, to, amount);
//            notify();

        }
    }


    public static class Logger implements Runnable {

        @Override
        public void run() {
//            boolean logOn = false;
            int cnt = 1;
            while (!Thread.currentThread().isInterrupted()) {
                try {
//                    wait();
//                    if (logOn) {
                        System.out.println("Number - " + cnt);
                        System.out.println(Bank.log.take().toString());
                        cnt++;
//                    }
                } catch (InterruptedException e) {
                    logOn = false;
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
