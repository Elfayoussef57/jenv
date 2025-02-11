package ExCours;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        int[] arr = new int[40];
        Random rand = new Random();

        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(100);
        }

        for(int j : arr){
            System.out.println(j);
        }

    }
}