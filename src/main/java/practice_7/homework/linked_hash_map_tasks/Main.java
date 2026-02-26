package practice_7.homework.linked_hash_map_tasks;

import java.util.LinkedHashMap;

public class Main {
//    Задача 2:
//    Реализуйте телефонную книгу с LinkedHashMap. Добавьте и найдите контакт.

    static LinkedHashMap<String, String> phoneBook = new LinkedHashMap<>();

    public static void addContactToPhoneBook(String name, String number) {
        phoneBook.put(name, number);
    }

    public static void getContact(String name) {
        if (phoneBook.containsKey(name)) {
            System.out.println("Phone of contact: " + phoneBook.get(name));
        } else System.out.println("Contact is missing");
    }


    public static void main(String[] args) {

        addContactToPhoneBook("Alex", "+4654231285");
        addContactToPhoneBook("Tom", "+465425678468285");
        addContactToPhoneBook("Maria", "+465447836831285");
        addContactToPhoneBook("John", "+46542314338285");


        getContact("Tom");
    }
}
