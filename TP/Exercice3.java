import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] argv){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the midterm score: ");
        double score = scan.nextDouble();
        scan.close();
        System.out.print("Final Grade: ");
        if (score >= 90){
            System.out.println("A");
        } else if (score >= 80){
            System.out.println("B");
        } else if (score >= 70){
            System.out.println("C");
        } else if (score >= 60){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
