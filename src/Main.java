import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int savings = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            i++;
            total = total + total/100;
            total = total + savings;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Задание №2");
        int v = 0;
        while (v < 10) {
            v++;
            System.out.print(v);
        }
        System.out.println();
        for (int k = 10; k >=1; k--) {
            System.out.print(k);
        }
        System.out.println();
        System.out.println("Задание №3");
        int totalPopulation = 12_000_000;
        int birthRate = totalPopulation / 1000 * 17;
        int mortality = totalPopulation / 1000 * 8;
        for (int y = 0; y <= 10; y++) {
            totalPopulation = totalPopulation + birthRate - mortality;
            System.out.println("Год " + y + ", численность населения составляет " + totalPopulation);
        }
    }

}