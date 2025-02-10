import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] argv){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integers one by one (enter a non-integer to finish): ");
        int sum = 0;
        while(scan.hasNextInt()){
            int x = scan.nextInt();
            if(x%2==0){
                sum += x;
            }
        }
        scan.close();
        System.out.println("Sum of Even numbers: "+sum);
    }    
    //Exercice 5 == Exercice 6
}
