package ExCours;
public class Exemple {
   //number of elements in the array
    public static final int N = 10;
    //list of elments
    int[] array = new int[N];

    //Constructor
    public Exemple(int n){
        for(int i = 0; i < n; i++){
            this.array[i] = i;
        }
    }

    //Method to list the elements of the array
    public static void show(int[] array){
        for(int i: array){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    //Method to insert an element x to the array in the position pos
    public static void insert(int x, int pos, int[] array){
        for(int i=0; i<array.length; i++){
            if(i == pos){
                array[i] =x;
            }
        }
    }

    //Methode to sort the elements of the array
    public static void sort(int[]array){
        int tmp;
        for(int i = 0; i<array.length-1;i++){
            if(array[i] > array[i+1]){
                tmp = array[i];
                array[i] = array[i+1];
                array[i+1] = tmp;
            }
        }

    }
    //Main method
    public static void main(String[] argv){
        Exemple exemple = new Exemple(N);
        show(exemple.array);

        insert(5, 3, exemple.array);
        show(exemple.array);
        sort(exemple.array);
        show(exemple.array);
    }

}
