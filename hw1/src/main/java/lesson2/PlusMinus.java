package lesson2;

import java.util.Scanner;
/*Написать метод, которому в качестве параметра передается целое число,
метод должен напечатать в консоль, положительное ли число передали или отрицательное.
Замечание: ноль считаем положительным числом.*/
public class PlusMinus {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 4; i++) {
            System.out.println("Введите любое целое число: ");
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            if (a >= 0) {
                System.out.println("Вы передали положительное число");
            } else {
                System.out.println("Вы передали отрицательное число");
            }
        }
    }
}
