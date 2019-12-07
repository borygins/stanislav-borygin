package com.ifmo.lesson24;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Bank {
    private static Map<Long, String> users = new ConcurrentHashMap<Long, String>();
    private static List<Account> accounts = new CopyOnWriteArrayList<>();

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
        private long amount;

        private Account(long id, long userId, long amount) {
            this.id = id;
            this.userId = userId;
            this.amount = amount;
        }
    }

    private class Transaction {
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

        List<String> NAMES = List.of("Petya", "Vasya", "Masha", "Gosha", "Jhon");

        Random rnd = new Random();
        for (int i = 0; i < 100; i++) {

            users.put(rnd.nextLong(), NAMES.get(rnd.nextInt(NAMES.size())));
        }

        for (long i = 0; i < 100; i++) {
            accounts.add(rnd.nextLong(), i, rnd.nextLong());
        }
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(new Transfer());
            thread.start();
        }
        Thread logger = new Thread(new Logger());
        logger.start();
    }

    // TODO Самая главная часть работы!
    public void transferMoney(Account from, Account to, long amount) {
        // 1. Атомарно и потокобезопасно перевести деньги в количестве 'amount' со счёта 'from' на счёт 'to'.
        // 2. Создать объект Transaction, содержащий информацию об операции и отправить в очередь
        // потоку Logger, который проснётся и напечатает её.


    }

    public static class Transfer extends Thread {

        @Override
        public void run() {
            while (!isInterrupted()) {
                synchronized (Bank.accounts) {
                    try {
                        transferMoney(accounts);
                    }
                }
            }

        }
    }

    public static class Logger implements Runnable {

        @Override
        public void run() {

        }
    }
}
