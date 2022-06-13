package lesson2;
/*8. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
то есть [0][0], [1][1], [2][2], …, [n][n];*/
public class dvymernyMassiv {
    public static void main(String[] args) {
        int[][]arr=new int[3][3];
        int i;
        int j;
        for(i=0;i<arr.length;i++){
            System.out.println();
            for(j=0;j<arr.length;j++){
                if(i==j){
                    arr[i][j]=1;
                    System.out.print(arr[i][j]);}
                else {
                    arr[i][j] = 0;
                    System.out.print(arr[i][j]);
                }
        }

    }}}
