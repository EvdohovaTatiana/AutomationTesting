package lesson8;

public class PhoneBookMain {
    public static void main(String[] args) {
        PhoneBook phoneBook=new PhoneBook();
        phoneBook.add("Иванов", 12378900);
        phoneBook.add("Петров", 18180188);
        phoneBook.add("Сидоров", 98653208);
        phoneBook.add("Козлов", 55443300);
        phoneBook.add("Иванов", 98765432);
        phoneBook.add("Евдохов", 3957261);
        phoneBook.add("Евдохова", 7992400);
        phoneBook.add("Костецкая", 5258148);
        phoneBook.add("Нарыжняк", 5319604);
        phoneBook.add("Бобер", 7315612);
        phoneBook.add("Петров", 12378901);
        phoneBook.add("Иванов", 12378902);

        phoneBook.get("Бобер");
    }
}
