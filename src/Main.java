public class Main {
    public static void main(String[] args) {

        int initialBalance = 250;
        int depositedAmount = 1500;
        int bonus = depositedAmount / 100;
        if (depositedAmount > 1000) {
            System.out.println("Бонус равен");
            System.out.println(bonus);
            int finalBalance = initialBalance + depositedAmount + bonus;
            System.out.println("Итоговый баланс равен");
            System.out.println(finalBalance);
        } else {
            System.out.println("Бонус не начислен, внесенная сумма меньше 1000");
        }
    }
}