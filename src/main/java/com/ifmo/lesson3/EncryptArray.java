package com.ifmo.lesson3;

public class EncryptArray {
    /*
    Напишите реализацию методов encrypt(), используя операцию исключающее ИЛИ (XOR) ^.
    После применения шифрования текст из массива байт должен быть неузнаваемым.
    После повторного применения метода текст должен быть опять оригинальным.
    Если ключ короче текста, то он должен применяться циклически.
    К примеру, текст АБВГДЕЖ, ключ ЮЯ, применение будет следующим:
    АБВГДЕЖ
    ЮЯЮЯЮЯЮ

    Например:
    Оригинал "hello!", ключ 42. После первого применения метода:
    "BOFFE". После второго снова "hello!".

    Оригинал "hello!", ключ "key". После первого применения метода:
    " 	D". После второго снова "hello!"ю
     */
    public static void main(String[] args) {
        String text = "hello!";
        byte key = 42;
        byte[] key2 = "key".getBytes();

        byte[] bytes = text.getBytes();

        // Однобайтовый ключ.
        encrypt(bytes, key);

        System.out.println(new String(bytes)); // Шифрованный текст

        encrypt(bytes, key);

        System.out.println(new String(bytes)); // hello!

        // Многобайтовый ключ.
        encrypt(bytes, key2);

        System.out.println(new String(bytes)); // Шифрованный текст

        encrypt(bytes, key2);

        System.out.println(new String(bytes)); // hello!
    }

    public static void encrypt(byte[] data, byte key) {
        // TODO implement
        for (int i = 0; i < data.length; i++) {
            byte xored = (byte) (data[i] ^ key);
            data[i] = xored;
        }
    }

    public static void encrypt(byte[] data, byte[] key) {
        // TODO implement
        //data.length
        // key.length
        // h ^ k
        // e ^ e
        // l ^ y
        // l ^ k
        // o ^ e
        // ! ^ y
        for (int n = 0; n < (data.length/key.length); n++) {
            for (int k = 0; k < key.length; k++) {
                data[k+n*(key.length)] = (byte) (data[k+n*(key.length)] ^ key[k]);
            }
        }
            }
        }
//Done
