public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int yearOfFlight = 79;
        for (int d = yearOfFlight; d <= 2122; d++) {
            if (d == yearOfFlight || ((d - yearOfFlight) % 79 == 0)) {
                if (d > 1822) System.out.println(d);
            }
        }

        System.out.println("Задание №2");
        int digit = 2;
        for (int i = 1; i <=10; i++) {
            System.out.println(digit + "*" + i + "=" + (digit * i));
        }
    }
}