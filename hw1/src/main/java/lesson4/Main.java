package lesson4;

import java.util.InputMismatchException;
import java.util.Scanner;
/*Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
3. У каждого животного есть ограничения на действия (бег: кот 200 м, собака 500 м; плавание: кот не умеет плавать, собака 10 м).
Расширить задачу про котов и тарелки с едой, выполнив следующие пункты:
 Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
 Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
4. * Добавить подсчет созданных котов, собак и животных.
5. Расширить задачу про котов и тарелки с едой, выполнив следующие пункты:
 Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
 Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
Cоздать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
6. Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.
7. Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах, времени их работы и стоимости.
*/
public class Main {
    public static void main(String[] args){
       /* Cat cat1 = new Cat(200, 0);
        Dog dog1 = new Dog(500, 10);

        System.out.println("Кошка может пробежать: " + cat1.getDistanceRun() +
                " м. \nСобака может пробежать: " + dog1.getDistanceRun() + " м.");

        System.out.println("Введите дистанцию для бега:");

        Scanner scanner=new Scanner(System.in);
        int distance = scanner.nextInt();

        System.out.println("Кошка пытается выполнить run(" + distance + "). Результат: " + cat1.run(distance));
        System.out.println("Собака пытается выполнить run(" + distance + "). Результат: " + dog1.run(distance));
        System.out.println("\n****************\n");

        System.out.println("Кошка может проплыть: " + cat1.getDistanceSwim() +
                " м. \nСобака может проплыть: " + dog1.getDistanceSwim() + " м.");

        System.out.println("Введите дистанцию для плавания:");
        distance = scanner.nextInt();

        System.out.println("Кошка пытается выполнить swim(" + distance + "). Результат: " + cat1.swim(distance));
        System.out.println("Собака пытается выполнить swim(" + distance + "). Результат: " + dog1.swim(distance));
*/
        Scanner sc = new Scanner(System.in);
        int action;
            Cat[] allCats = new Cat[4];
            allCats[0] = new Cat("Барсик", 10, false);
            allCats[1] = new Cat("Умка", 15, false);
            allCats[2] = new Cat("Борис", 5, false);
            allCats[3] = new Cat("Черри", 25, false);

            Plate plate = new Plate(50);
            plate.info();
            for (int i = 0; i < allCats.length; i++) {
                if (allCats[i].fullness == false && plate.food>allCats[i].appetite){
                    allCats[i].eat(plate);
                    allCats[i].fullness = true;
                    plate.decreaseFood(allCats[i].appetite);
                    System.out.println("Кот " + allCats[i].name + " покушал " +allCats[i].appetite+ " еды"+" и его сытость ="+allCats[i].fullness);
                    //plate.info();
                } else {
                    allCats[i].fullness = false;
                    System.out.println("Кот " + allCats[i].name + " не поел! Аппетит кота:"+allCats[i].appetite+"" +
                            " а еды в тарелке осталось мешьше и его сытость ="+allCats[i].fullness );
                }
            }
            plate.info();
            System.out.println("Сколько грамм корма добавить в миску?");
            action = sc.nextInt();
            plate.increaseFood(action);
            plate.info();
    }}
