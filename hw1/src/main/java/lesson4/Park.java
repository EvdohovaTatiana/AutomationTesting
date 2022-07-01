package lesson4;
/*7. Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах,
времени их работы и стоимости.
 */
public class Park {
    private String name;
    private Atraction[] atractArr;
    private String workingTime;
    private int price;

    private class Atraction {
        public String atractionName;
        public String attractionWorkingTime;
        public int atractionPrice;

        private Atraction() {
            super();
            atractionName = "";
            attractionWorkingTime = "";
            atractionPrice = 0;
        }

        public Atraction(String atractionName, String attractionWorkingTime, int atractionPrice) {
            this.atractionName = atractionName;
            this.attractionWorkingTime = attractionWorkingTime;
            this.atractionPrice = atractionPrice;
        }

        public String getAtractionName() {
            return this.atractionName;
        }

        public String getAttractionWorkingTime() {
            return this.attractionWorkingTime;
        }

        public int getAtractionPrice() {
            return this.atractionPrice;
        }
    }

    public Park() {
        super();
        this.name = "";
        this.price = 0;
    }

    public Park(String name) {
        this.name = name;
    }

    public void getInfo() {
        Atraction[] allAtractions=new Atraction[5];
        allAtractions[0] =new Atraction("Летающая терелка", "с 9:00 до 19:00", 10);
        allAtractions[1]= new Atraction("Центрифуга", "с 9:00 до 19:00", 15);
        allAtractions[2]= new Atraction("Колесо обозрения", "с 9:00 до 19:00", 6);
        allAtractions[3]= new Atraction("Велелые горки", "с 9:00 до 19:00", 5);
        allAtractions[4]= new Atraction("Чашечки", "с 9:00 до 15:00", 6);
        Park park1=new Park("Касеопея");
        System.out.println("Парк атракционов:  "+ park1.name);
        for(int i=0; i<allAtractions.length; i++){
            //System.out.println("Информация об имеющихся в парке атракционах:");
            System.out.println("Название:" + allAtractions[i].atractionName);
            System.out.println("Режим работы:"+ allAtractions[i].attractionWorkingTime);
            System.out.println("Цена билета:"+allAtractions[i].atractionPrice);
            System.out.println("------------------------------------------");


        }

    }

}

