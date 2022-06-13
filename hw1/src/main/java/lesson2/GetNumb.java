package lesson2;

import java.util.Scanner;
/*Написать метод, принимающий на вход два целых числа и проверяющий,
что их сумма лежит в пределах от 10 до 20 (включительно),
если да – вернуть true, в противном случае – false.*/
public class GetNumb {
    public static void main(String[] args) {
        System.out.println("Введите любое целое число: ");
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        System.out.println("Введите любое целое число: ");
        int b=scan.nextInt();
        int c =a+b;
        if(c>=10 && c<=20){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }

}
