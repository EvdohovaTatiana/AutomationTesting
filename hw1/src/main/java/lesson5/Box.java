package lesson5;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private ArrayList<T> arrList;

    public Box(T...arrList){
        this.arrList=new ArrayList<T>(Arrays.asList(arrList));
    }
    public void add(T...arrList){
        this.arrList.addAll(Arrays.asList(arrList));
    }
    public void remove(T... arrList) {
        for (T arr : arrList) this.arrList.remove(arr);
    }
    public ArrayList<T> getArrList() {
        return new ArrayList<T>(arrList);
    }
    public void clear() {
        arrList.clear();
    }
    public float getWeight() {
        if (arrList.size() == 0) return 0;
        float weight = 0;
        for (T arr: arrList)
            weight += arr.getWeight();
        return weight;
    }
    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }
    public void transfer(Box<? super T> box) {
        box.arrList.addAll(this.arrList);
        clear();
    }

}