import java.util.Scanner;
public class Main {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        Birthday myBirthday = new Birthday(9, 1, 1993);
        String birthData = myBirthday.getBirthdayData();
        System.out.println(birthData);



        // You was born in 5th of December in 1998
        // Season is WINTER
        // Year of Tiger
        // Goroskop - Strelec


    }

}