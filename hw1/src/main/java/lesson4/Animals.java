/*1. Создать классы Собака и Кот с наследованием от класса Животное.
        2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
        5. Расширить задачу про котов и тарелки с едой, выполнив следующие пункты:
        Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (
        например, в миске 10 еды, а кот пытается покушать 15-20).
        Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
        Если коту удалось покушать (хватило еды), сытость = true.
        Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт
        Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
        Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
        6. Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.
        7. Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах,
        времени их работы и стоимости.*/
package lesson4;

public class Animals implements AnimalInterface {
    public int DistanceRun,DistanceSwim;//задаем переменные
    public String name;
    public int  appetite;
    public boolean fullness;

    public Animals() {
    }

    public Animals(int DistanceRun, int DistanceSwim){ //конструктор
        this.DistanceRun=DistanceRun;
        this.DistanceSwim=DistanceSwim;
        //this.appetite=appetite;
    }
    //public Animals(String name, int appetite, boolean fullness){ //конструктор

    //}
    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }

    public boolean run(int value) {
        return DistanceRun >= value;
    }//ф-я возвращающая булеан значение
    public boolean swim(int value) { return DistanceSwim >= value;}

    int getDistanceRun(){
        return DistanceRun;
    }//геттер для получения значения дистанции бега
    int getDistanceSwim(){
        return DistanceSwim;
    }//геттер для получения дистанции заплыва


}




