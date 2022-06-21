public class Main {
    public static void main(String[] args) {
        int account = 50;

        int pay = 1250;

        int bonus;

        if (pay > 1000) {
            bonus = pay / 100;
        }
        else {
            bonus = 0;
        }

        int balance = account + pay + bonus;

        System.out.println("Ваш баланс: " + balance + " рублей");

    }
}
