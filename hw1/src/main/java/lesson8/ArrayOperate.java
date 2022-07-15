package lesson8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayOperate {

    public static List<String> fillArr(List<String> array) {
        array.add("Апельсин");
        array.add("Мандарин");
        array.add("Лимон");
        array.add("Лайм");
        array.add("Грейпфрут");
        array.add("Помело");
        array.add("Цитрон");
        array.add("Кумкват");
        array.add("Мандарин");
        array.add("Лайм");
        array.add("Мандарин");
        return array;
    }


    public static List<String> fillArrFromFile(List<String> array, String fileName) throws IOException {
        StringBuffer buffer = new StringBuffer();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        while (reader.ready()) {
            buffer.append(reader.readLine() + "\n");
        }
        if (buffer.length() > 0) {
            String[] tempArr = buffer.toString().split(" ");
            for (String temp : tempArr) {
                array.add(temp);
            }
        }
        return array;
    }

    public static void uniqueData(List<String> array) {
        Set<String> tempArray = new LinkedHashSet<>();
        for (String arr : array) {
            String a = arr;
            tempArray.add(a);
            System.out.println(a);
        }

        for (String temp : tempArray) {
            int count = 0;
            for (String arr : array) {
                String a = arr;
                if (temp.equals(a))
                    count++;
            }
            if (count < 2)
                System.out.println(temp + " - слово повторяется " + count + " раз");
            else {
                System.out.println(temp + " - слово повторяется " + count + " раза");
            }
            System.out.println();
        }
        System.out.println("Массив уникальных слов " + tempArray);
    }
}
