/*Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
Конструктор класса должен заполнять эти поля при создании объекта.
Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
Создать массив из 5 сотрудников.
С помощью цикла вывести информацию только о сотрудниках старше 40 лет.*/
package lesson3;
public class Employee {
    public String name;
    public String position;
    public String email;
    public String phoneNumber;
    public int salary;
    public int age;

    public Employee(String name, String position, String email, String phoneNumber, int salary,int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
        public int getAge() {
            return age;
    }
    public String toString(){
        return(name+ "\n-" +position+ "\n-" +email+ "\n-" +phoneNumber+ "\n-" +salary+ "\n-" +age);
    }
    public static void main(String[] args) {
        Employee[] emplAr=new Employee[5];
        emplAr[0]=new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 1000, 50);
        emplAr[1]=new Employee("Evdohov Slava", "Developre", "evdohov@mailbox.com", "892312325", 3000, 33);
        emplAr[2]=new Employee("Evdohova Tatiana", "Engineer", "evdohova@mailbox.com", "892312326", 2000, 31);
        emplAr[3]=new Employee("Kos Max", "PM", "komax@mailbox.com", "892312328", 2000, 42);
        emplAr[4]=new Employee("Kim Mary", "Analist", "kimm@mailbox.com", "892312329", 2500, 32);
        for (Employee employee : emplAr)
            if (employee.getAge()>40)
                System.out.println(employee);
    }
}
