package LABs;
import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] argv){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the start of the range: ");
        int start = scan.nextInt();
        System.out.println("Enter the end of the range: ");
        int end = scan.nextInt();
        scan.close();

        System.out.print("Prime numbers between 10 and 30: ");
        for (int i = start; i <= end; i++){
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0){
                System.out.print(i + " ");
            }
        }
    }
}
