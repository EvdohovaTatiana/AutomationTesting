package lesson4;

public class Plate {
    public int food;

    public Plate(int food) {//конструктор
        this.food = food;
    }
    public void decreaseFood(int appetite) {
        if (food > appetite) {//ф-я уменьшения еды в тарелки
            food -= appetite;
            boolean fullness=true;
            //{ System.out.println("кот поел и его сытость ="+fullness); }
        } else {
            boolean fullness=false;{
                System.out.println("Колическтво еды в тарелке меньше аппетита кота и его сытость="+fullness);
        }}
    }
    public void increaseFood(int plus) {//ф-я пополнения тарелки
        food += plus;
    }
    public void info() {//ф-я, показывающая количество оставшейся еды в тарелке
        System.out.println("Всего еды: " + food);
    }
}
