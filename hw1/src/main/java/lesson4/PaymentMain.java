package lesson4;
public class PaymentMain {
        public static void main(String [] args) {
                Payment pay1 = new Payment("Первая покупка");
                pay1.setPayment();
                Payment pay2 = new Payment("Вторая покупка");
                pay2.setPayment();
                pay1.PrintCheck();
                pay2.PrintCheck();
            }
        }
