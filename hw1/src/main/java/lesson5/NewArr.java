package lesson5;

public class NewArr<T> {
    private T[] arr;

    NewArr(T... arr){
        this.arr=arr;
    }
    public T[] getArr(){
        return arr;
    }
    public void showTypes(){
        System.out.println("Тип массива:" +arr.getClass().getName());
    }
    public void firstArr(){
        System.out.println("Исходный массив:");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    public void ChangeElInArr(){
        T firstEl=arr[0];
        T lastEl=arr[3];
        arr[0]=lastEl;
        arr[3]=firstEl;

        System.out.println("Массив после перестановки элементов местами:");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"  ");}
        System.out.println();
    }
}
