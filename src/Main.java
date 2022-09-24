import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        double amountOfSavings = 15000;
        DecimalFormat dF = new DecimalFormat("#.###");
        for (int i = 1; amountOfSavings < 12_000_000; i++) {
            amountOfSavings = amountOfSavings * 0.07 + amountOfSavings;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + dF.format(amountOfSavings) + " рублей");
        }
        System.out.println("Задание №2");
        double savings = 15000;
        DecimalFormat f = new DecimalFormat("#.###");
        for (int k = 1; savings < 12_000_000; k++) {
            savings = savings * 0.07 + savings;
            if (k % 6 == 0) {
                System.out.println("Месяц " + k + ", сумма накоплений равна " + dF.format(savings) + " рублей");
            }
        }
        System.out.println("Задание №3");
        double totalSavings = 15000;
        DecimalFormat fD = new DecimalFormat("#.###");
        for (int d = 1; d <= 108; d++) {
            totalSavings = totalSavings * 0.07 + totalSavings;
            if (d % 6 == 0) {
                System.out.println("Месяц " + d + ", сумма накоплений равна " + dF.format(totalSavings) + " рублей");
            }
        }
        System.out.println("Задание №4");
        int friday = 7;
        for (int day = 1; day <= 31; day++) {
            if (day == friday || ((day - friday) % 7) == 0) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
            }
        }
    }
}