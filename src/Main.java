//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        {
            System.out.println("Задача 1.");
        }
        for (int number = 1; number <= 10; number++) {
            System.out.println("Целое число " + number + ".");
        }

        {
            System.out.println("Задача 2.");
        }
        for (int numberTwo = 10; numberTwo >= 1; numberTwo--) {
            System.out.println("Целое число " + numberTwo + ".");
        }
        {
            System.out.println("Задача 3.");
        }
        for (int evenNumber = 0; evenNumber <= 17; evenNumber = evenNumber + 2) {
            System.out.println("Четные числа " + evenNumber + ".");
        }
        {
            System.out.println("Задача 4.");
        }
        for (int allNumber = 10; allNumber >= -10; allNumber--) {
            System.out.println("Простое число " + allNumber + ".");
        }
        {
            System.out.println("Задача 5.");
        }
        for (int leapYear = 1904; leapYear <= 2096; leapYear = leapYear + 4) {
            System.out.println(leapYear + " год является високосным.");
        }
        {
            System.out.println("Задача 6.");
        }
        for (int i = 0; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        {
            System.out.println("Задача 7."
            );
        }
        for (int y = 1; y <= 512; y = y * 2) {
            System.out.println(y);
        }
        {
            System.out.println("Задача 8.");
        }
        int savings = 29000;
        int total = 0;
        for (int month = 1; month <= 12; month++) {
            total = total + savings;


            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей.");
        }
        {
            System.out.println("Задача 9");
        }
        int bank = 29000;
        int total1 = 0;
        for (int month1 = 1; month1 <= 12; month1++) {
            total1 = total1 + bank / 100;
            total1 = total1 + bank;

            System.out.println("Месяц " + month1 + " сумма накоплений равна " + total1 + " рублей.");
        }
        {
            System.out.println("Задача 10.");
        }
        for (int r = 1; r <= 10; r++) {
            int main = 2 * r;
            System.out.println("2 * " + r + "=" + main);
        }

    }
}