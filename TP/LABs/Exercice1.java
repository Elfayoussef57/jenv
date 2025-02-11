package LABs;
import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entrez un nombre : ");
        int n = scan.nextInt();
        int m = scan.nextInt();
        int l = scan.nextInt();
        scan.close();

        if (n > m && m > l) {
            System.out.println(l + " " + m + " " + n);
        } else if (n > l && l > m) {
            System.out.println(m + " " + l + " " + n);
        } else if (m > n && n > l) {
            System.out.println(l + " " + n + " " + m);
        } else if (m > l && l > n) {
            System.out.println(n + " " + l + " " + m);
        } else if (l > n && n > m) {
            System.out.println(m + " " + n + " " + l);
        } else {
            System.out.println(n + " " + m + " " + l);
        }

    }
}