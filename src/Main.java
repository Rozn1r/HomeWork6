//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1: числа от 1 до 10");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Задача 2
        System.out.println("Задача 2: числа от 10 до 1");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Задача 3
        System.out.println("Задача 3: четные числа от 0 до 17");
        for (int i = 0; i <= 17; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Задача 4
        System.out.println("Задача 4: числа от 10 до -10");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Задача 5
        System.out.println("Задача 5: високосные годы с 1904 до 2096");
        for (int year = 1904; year <= 2096; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " год является високосным");
            }
        }
        System.out.println();

        // Задача 6
        System.out.println("Задача 6: последовательность чисел");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Задача 7
        System.out.println("Задача 7: последовательность чисел");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Задача 8
        System.out.println("Задача 8: накопления без процентов");
        int monthlySavings = 29000;
        int totalSavings = 0;

        for (int month = 1; month <= 12; month++) {
            totalSavings += monthlySavings;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSavings + " рублей");
        }
        System.out.println();

        // Задача 9
        System.out.println("Задача 9: накопления с процентами");
        double savingsWithInterest = 0;
        double monthlyDeposit = 29000;
        double annualRate = 0.12;
        double monthlyRate = annualRate / 12;

        for (int month = 1; month <= 12; month++) {
            savingsWithInterest = (savingsWithInterest + monthlyDeposit) * (1 + monthlyRate);
            System.out.println("Месяц " + month + ", сумма накоплений равна " + String.format("%.2f", savingsWithInterest) + " рублей");
        }
        System.out.println();

        // Задача 10
        System.out.println("Задача 10: таблица умножения на 2");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (2 * i));
        }
    }
}