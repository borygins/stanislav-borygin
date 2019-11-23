package com.ifmo.lesson16.sockettest;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket ssocket = new ServerSocket(12345);

        while (true) {
            // Ждём входящие подключения
            Socket socket = ssocket.accept();

            // Создаём сериализующие/десериализующие потоки
            ObjectOutputStream objOut = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream objIn = new ObjectInputStream(socket.getInputStream());

            // Ждём и читаем сообщение от клиента.
            Object request = objIn.readObject();

            // Обрабатываем команду
            if (request instanceof Echo) {
                objOut.writeObject(request);
            }
            else {
                System.out.println("Unknown command: " + request);
            }


            socket.close();
        }
    }
}
