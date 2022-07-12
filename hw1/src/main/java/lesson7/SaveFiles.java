package lesson7;
import java.io.*;
import java.util.Arrays;

public class SaveFiles {
    public static void main(String[] args) throws IOException {
        //записываем данные в файл
        //создаем сам файл
        try {
            File file = new File("C:\\Users\\anduser\\IdeaProjects\\AutomationTesting\\hw1\\target\\\\text.txt");
            //file.createNewFile();
            //BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
            //String txtWrite=writer.write();
            //читаем файл
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String text = reader.readLine();
            while (text != null) {
                System.out.println(text);
                text = reader.readLine();
            }
        } catch(Exception e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        } finally {
        {
            System.out.println("блок файнали");
    }}}}

