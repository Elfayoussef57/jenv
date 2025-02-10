import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] argv){
        Scanner scan = new Scanner(System.in);

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("Enter a number (1-7) representing a day of the week:");

        int day = scan.nextInt();
        scan.close();
        if(day > 0 && day <= 7){
            System.out.println("Day of the Week: " + days[day - 1]);
        }else{
            System.out.println("Invalid Day");
        }
    }
}
