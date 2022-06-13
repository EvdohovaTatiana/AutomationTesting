package lesson2;
/* * Написать метод, который определяет, является ли год високосным, и возвращает boolean(високосный - true, не високосный
* - false). Каждый 4-й год является високосным,кроме каждого 100-го, при этом каждый 400-й – високосный.*/
public class visokosnyOrNot {
    public static void main(String[] args) {
        int god=2020;
        double ost = god % 4 ;
        if(ost==0){
            System.out.println(god + "-это високосный год");
        }
else {
            System.out.println(god + "-это НЕ високосный год");
        }
    }
}


