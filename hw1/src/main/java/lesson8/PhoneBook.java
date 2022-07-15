package lesson8;
/*Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи,
а с помощью метода get() искать номер телефона по фамилии.
Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
 тогда при запросе такой фамилии должны выводиться все телефоны.
Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
взаимодействие с пользователем через консоль и т.д). Консоль использовать только для вывода
результатов проверки телефонного справочника.*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    HashMap<String, HashSet<Integer>> phoneBook1;
    PhoneBook() {
        this.phoneBook1 = new HashMap<>();
    }
    public void add(String name, Integer number) {
        HashSet<Integer> phonebook = phoneBook1.getOrDefault(name, new HashSet<>());
        phonebook.add(number);
        phoneBook1.put(name, phonebook);
    }

    public void get(String name) {
        System.out.println("контакт " + name +", номер телефона: " +phoneBook1.getOrDefault(name, new HashSet<>()));
    }
}
