import java.util.Scanner;

public class Trexugol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        String monthString;
        String seasonString;

        switch (a) {
            case 1:  monthString = "Январь";
                break;
            case 2:  monthString = "Февраль";
                break;
            case 3:  monthString = "Март";
                break;
            case 4:  monthString = "Апрель";
                break;
            case 5:  monthString = "Май";
                break;
            case 6:  monthString = "Июнь";
                break;
            case 7:  monthString = "Июль";
                break;
            case 8:  monthString = "Август";
                break;
            case 9:  monthString = "Сентябрь";
                break;
            case 10: monthString = "Октябрь";
                break;
            case 11: monthString = "Ноябрь";
                break;
            case 12: monthString = "Декабрь";
                break;
            default: monthString = "Не знаем такого";
                break;
        }
        switch (b) {
            case 12:
            case 1:
            case 2: monthString = "Зима";
                break;
            case 3:
            case 4:
            case 5:  monthString = "Весна";
            break;

            case 6:
            case 7:
            case 8:  monthString = "Лето";
                break;

            case 9:
            case 10:
            case 11: monthString = "Осень";
                break;
            default: monthString = "Не знаем такого";
                break;
        }
    }
}