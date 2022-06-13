package lesson2;

import java.util.Scanner;
/*3.     Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
 если число отрицательное, и вернуть false если положительное. Замечание: ноль считаем положительным числом.
*/
public class positiveOrNegativeNumb {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scan=new Scanner(System.in);
        int i=scan.nextInt();
        if(i<0){
            System.out.print(true);
        }
else {
            System.out.print(false);
        }
    }
}
