package lesson8;
/*Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
Посчитать, сколько раз встречается каждое слово.*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Collections {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("Вадим");
        arr.add("Алексей");
        arr.add("Иван");
        arr.add("Евгений");
        arr.add("Иван");
        arr.add("Юрий");
        arr.add("Вячеслав");
        arr.add("Вячеслав");
        System.out.println("Вся коллекция имен: " + arr);
        System.out.println();

        Set<String> uniqNames = new LinkedHashSet<>(arr);
        System.out.println("Уникальные имена:" + uniqNames);

        HashMap<String, Integer> repeatedNames = new HashMap<>();
        Integer repeatedName=null;
        for(String i:arr){
            repeatedName=repeatedNames.get(i);
            repeatedNames.put(i, repeatedName==null ? 1: repeatedName+1);
        }
        System.out.println("\n"+"Количество повторений"+ repeatedNames);
    }

}
