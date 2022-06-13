package lesson2;
/*7. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;*/
public class umnogitChisla {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int i;
        for (i = 0; i < 12; i++) {
            if(arr[i] < 6){
                arr[i] = arr[i] * 2;
                System.out.print(arr[i] + " "); }
            else{
                System.out.print(arr[i] + " "); }
            }
        }
    }
