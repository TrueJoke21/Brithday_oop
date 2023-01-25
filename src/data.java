import java.util.Scanner;
public class data {
    {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = scan.nextInt();

            if (num == 11 || num == 12 || num == 13) {
                System.out.println(num + "th");
            } else {
                int lastDigit = num % 10;
                String suffix = "";
                switch (lastDigit) {
                    case 1:
                        suffix = "st";
                        break;
                    case 2:
                        suffix = "nd";
                        break;
                    case 3:
                        suffix = "rd";
                        break;
                    default:
                        suffix = "th";
                        break;
                }
                System.out.println(num + suffix);
            }
        }
    }
