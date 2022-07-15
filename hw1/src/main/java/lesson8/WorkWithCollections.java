package lesson8;
/*Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
Посчитать, сколько раз встречается каждое слово.
Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи,
а с помощью метода get() искать номер телефона по фамилии.
Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
 тогда при запросе такой фамилии должны выводиться все телефоны.
Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
взаимодействие с пользователем через консоль и т.д). Консоль использовать только для вывода
результатов проверки телефонного справочника.*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorkWithCollections {
    static final String FileName1="C:\\Users\\anduser\\IdeaProjects\\AutomationTesting\\hw1\\target\\HW8.txt";
    static final String FileName2="HW8.txt";


    public static void main(String[] args) {
        /*try {
        File file=new File("C:\Users\anduser\IdeaProjects\AutomationTesting\hw1\target\HW8.txt");
        file.createNewFile();
        }catch (Exception e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }*/
        List<String> list = new ArrayList<String>();
        list=ArrayOperate.fillArr(list);
        System.out.println(list+ "\n");
        ArrayOperate.uniqueData(list);
        list.clear();

        try {
            list=ArrayOperate.fillArrFromFile(list, FileName2);
        }
        catch (IOException e){
            e.printStackTrace();
            System.out.println("Ошибка при чтении "+FileName2);
        }

        try {
            list=ArrayOperate.fillArrFromFile(list, FileName1);
        }
        catch (IOException e){
            e.printStackTrace();
            System.out.println("Ошибка при чтении "+FileName1);
        }
        }
    }


