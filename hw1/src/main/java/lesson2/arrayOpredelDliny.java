package lesson2;
/*9. * Написать метод, принимающий на вход два аргумента: len и initialValue,
и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;*/
public class arrayOpredelDliny {
    public static void main(String[] args) {
        int len=5;
        int initialValue=1;
        int[] arr = new int[len];
        int i;
        for(i=0;i<arr.length;i++){
            arr[i]=initialValue;
            System.out.print(arr[i]+"  ");
        }
    }
}
