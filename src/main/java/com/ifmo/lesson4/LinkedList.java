package com.ifmo.lesson4;

/**
 * Односвязный список, где каждый предыдущий
 * элемент харнит ссылку на следующий. Список
 * оканчивается ссылкой со значением {@code null}.
 */
public class LinkedList {
    /** Ссылка на первый элемент списка. */
    private Item head;

    /**
     * Добавляет значение в конец списка.
     *
     * @param val Значение, которое будет добавлено.
     */
    public void add(Object val) {
        // TODO implement
        if (head == null){
            head = new Item(val);
        }
        else {
            Item item = head;
            while (true) {
                if (item.next == null) {
                    item.next = new Item(val);
                    return;
                }
                item = item.next;
            }
        }
    }

    public static void main(String[] args) {
       LinkedList list = new LinkedList();
        list.add("Элемент1");
        list.add("Элемент2");
        list.add("Элемент3");
       // System.out.println(list.get(2));
    }
    /**
     * Извлекает значение из списка по индексу.
     *
     * @param i Индекс значения в списке.
     * @return Значение, которое находится по индексу
     * или {@code null}, если не найдено.
     */
    public Object get(int i) {
        // TODO implement
        if (head == null)
            return null;

        for (int j = 0; ;j++){
            if (j == i) {
                return i;
            }
            else
                return null;
        }
    }

    /**
     * Удаляет значение по индексу и возвращает
     * удаленный элемент.
     *
     * @param i Индекс, по которому будет удален элемент.
     * @return Удаленное значение или {@code null}, если не найдено.
     */
    public Object remove(int i) {
        // TODO implement

        return null;
    }
}
