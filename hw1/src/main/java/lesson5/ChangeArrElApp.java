package lesson5;
//Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
public class ChangeArrElApp {
    public static void main(String[] args) {
        NewArr<Integer> arr1=new NewArr <Integer>(1,2,3,4);
        NewArr<String> arr2=new NewArr <String>("One","Two","Three","Four");

        arr1.firstArr();
        arr1.showTypes();
        arr1.ChangeElInArr();

        arr2.firstArr();
        arr2.showTypes();
        arr2.ChangeElInArr();
    }
}
