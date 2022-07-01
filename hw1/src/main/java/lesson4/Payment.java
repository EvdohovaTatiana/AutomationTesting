package lesson4;

import java.io.IOException;
import java.util.Scanner;

//Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.
public class Payment {
    private String name; //название покупки
    private Product[] prodArray; //перечень товаров
    private int price; //стоимость покупки

    private class Product{ //внутренний класс
        private String prodName;// название товара
        private int prodPrice; //стоимость товара

        private Product(){ //конструктор по умолчанию
            super ();
            prodName = "";
            prodPrice = 0;
        }
        public Product(String prodName, int prodPrice){ //конструктор с параметрами
            this.prodName=prodName;
            this.prodPrice=prodPrice;
        }
        public String getProdName(){
            return this.prodName; //метод внутреннего класса
        }
        public double getProdPrice(){
            return this.prodPrice; //метод внутреннего класса
        }
    }
    public Payment(){ //конструктор по умолчанию
        super();
        this.name = "";
        this.price = 0;
    }
    public Payment(String name){ //конструктор с параметрами
        super();
        this.name=name;
    }
    public void setPayment(){
        this.price=0;
        System.out.println("Введите количество товаров к покупке");
        Scanner items=new Scanner(System.in);
        int byuing=items.nextInt();
        prodArray=new Product[byuing];
        for(int i=0; i<prodArray.length; i++){
            System.out.println("Товар" + (i+1)+ ":");
            System.out.println("Введите наименование:");
            String item_name=items.next();
            System.out.println("Введите цену товара:");
            int item_price =items.nextInt();
            prodArray[i]=new Product(item_name, item_price);
            this.price+=prodArray[i].prodPrice;
        }
    }
    public void PrintCheck(){
        System.out.println("=====================");
        System.out.println("       ЧЕК  ");
        if(this.prodArray.length>0){
            for(int j=0; j<this.prodArray.length; j++){
                System.out.print(j + 1+" ");
                System.out.print(prodArray[j].prodName+"     ");
                System.out.println(prodArray[j].prodPrice+"     ");
            }
            System.out.println("-------------------");
            System.out.println("Общая стоимость покупки:");
            System.out.println(this.price);
            System.out.println();
            System.out.println("=====================");
        }
        else{
            System.out.println("Покупатель ничего не купил");
        }
    }
}





