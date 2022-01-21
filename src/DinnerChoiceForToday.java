public class DinnerChoiceForToday {
        public static void main(String[] args) {
            int money = 15;
            if (money > 500) {
                System.out.println("Buy a pizza");
            } else if (money < 100) {
                System.out.printf("Buy Doshirak");
            } else {
                System.out.println("Borrow some more");
            }
        }
    }
