package lesson6;

/*Напишите метод, на вход которого подается двумерный строковый массив размером 4х4.
 При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
 Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
  должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException
 и вывести результат расчета.
*/
public class ArraywithExceprions {
    public static void main(String[] args) {
        String[][] arr = new String[][]{
                {"1", "2", "3", "4"},
                {"4", "3", "2", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        try {
            System.out.println("Сумма всех элементов массива равна " + checkArr(arr) + ".\n");
        } catch (MyExceptions e) {
            e.getMessage();
        }

        try {
            System.out.println("Сумма всех элементов массива равна " + checkArr(arr) + ".\n");
        } catch (MyExceptions e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Сумма всех элементов массива равна " + checkArr(arr) + ".\n");
        } catch (MyExceptions e) {
            System.out.println(e.getMessage());
        }
    }

    public static int checkArr(String[][] arr) throws ArraySizeException, ArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new ArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new ArraySizeException();
            }
            for (int j = 0; j < arr.length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException(i,j);
                }
            }
        }
        return count;
    }
}
