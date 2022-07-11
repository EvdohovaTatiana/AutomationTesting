package lesson5;
/*Задача:
        Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
        Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
        поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
        Для хранения фруктов внутри коробки можно использовать ArrayList;
        Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
        вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
        Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той,
        которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
        Можно сравнивать коробки с яблоками и апельсинами;
        Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
        про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
        Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
        Не забываем про метод добавления фрукта в коробку.*/
public class FruitMain {
    public static void main(String[] args) {

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        Orange orange5 = new Orange();
        Orange orange6 = new Orange();
        Orange orange7 = new Orange();
        Orange orange8 = new Orange();

        Box<Apple> box1 = new Box<Apple>(apple1, apple2, apple3);
        Box<Orange> box2 = new Box<Orange>(orange1, orange2, orange3, orange4, orange5, orange6,orange7,orange8);

        System.out.println(box1.compare(box2));
        System.out.println("Вес коробки с яблоками: " +box1.getWeight());
        System.out.println("Вес коробки с апельсинами: " +box2.getWeight());


        Box<Orange> box3 = new Box<Orange>();
        box2.transfer(box3);

        System.out.println("Вес коробки 3, после пересыпания апельсинов: " +box3.getWeight());
        System.out.println("Вес коробки 2 после пересыпания аепльсинов в 3 коробку: " +box2.getWeight());
    }
}