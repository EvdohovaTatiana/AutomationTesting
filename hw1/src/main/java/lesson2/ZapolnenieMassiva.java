package lesson2;
/*6. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;*/
public class ZapolnenieMassiva {
    public static void main(String[] args) {
        int[]arr=new int[100];
        int i;
        for(i=0;i<100;i++){
            arr[i]=i+1;
            System.out.print(arr[i]+" ");
        }

    }
}
