package lesson6;

public class ArrayDataException extends MyExceptions {
    ArrayDataException(int row, int column){
        super(String.format("Ошибка данных в ячейке [%d, %d]\n", row, column));
}
}
