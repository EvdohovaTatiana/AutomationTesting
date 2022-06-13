package lesson2;

/*5. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
public class prisvoenieVMassive {
    public static void main(String[] args) {
        //int[] arr=new int[10];
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int i;
        int j;
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }
        System.out.println();
        for (j = 0; j < arr.length; j++) {
            if (arr[j]== 1) {
                arr[j] = 0;
            } else if (arr[j]==0) {
                arr[j] = 1;
            }
            System.out.print(arr[j]);
        }
    }
}
