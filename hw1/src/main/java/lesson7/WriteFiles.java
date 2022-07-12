package lesson7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*Реализовать сохранение данных в csv файл;
        Реализовать загрузку данных из csv файла. Файл читается целиком.
        Структура csv файла:
        Строка заголовок с набором столбцов. Набор строк с целочисленными значениями
        * Разделитель между столбцами - символ точка с запятой (;)
        Value 1;Value 2;Value 3
        100;200;123
        300;400;500
        Для хранения данных использовать класс вида:
public class AppData {
    private String[] header;
    private int[][] data;
    Если выполняется save(AppData data), то старые данные в файле полностью перезаписываются*/
public class WriteFiles {

    public static void main(String args[]) throws IOException {
        //File file = new File("C:\\Users\\anduser\\IdeaProjects\\AutomationTesting\\hw1\\target\\\\HW7.csv");
        //file.createNewFile();
        try (PrintWriter writer = new PrintWriter(new File("HW7.csv")))
        {
            StringBuilder sb = new StringBuilder();

            sb.append("Value1");
            sb.append(';');
            sb.append("Value2");
            sb.append(';');
            sb.append("Value3");
            sb.append('\n');

            sb.append("100");
            sb.append(';');
            sb.append("200");
            sb.append(';');
            sb.append("123");
            sb.append('\n');

            sb.append("300");
            sb.append(';');
            sb.append("400");
            sb.append(';');
            sb.append("500");
            sb.append('\n');

            writer.write(sb.toString());
            writer.flush();
            writer.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        WriteFiles test =  new WriteFiles();
        test.readCSVFile();
    }

    public void readCSVFile(){
        List<List<String>> records = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("HW7.csv"));) {
            while (scanner.hasNextLine()) {
                records.add(getRecordFromLine(scanner.nextLine()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(records.toString());
    }
    private List<String> getRecordFromLine(String line) {
        List<String> values = new ArrayList<String>();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter("/n");
            while (rowScanner.hasNext()) {
                values.add(rowScanner.next());
            }
        }
        return values;
    }
}

