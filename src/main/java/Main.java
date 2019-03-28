import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try {
            Scanner input = new Scanner(new File("stars.txt"));
            int max = 50;
            Star[] galaxy = new Star[max];
            //n is equal to the amount of stars read into galaxy
            int n = 0;

            while (input.hasNextLine() && n < max){
                String line = input.nextLine();
                String[] parts = line.split("\\t");
                if(parts.length == 4) {
                    //uses constructor call for creating new star objects and sets Star variables to line parts.
                    galaxy[n] = new Star(parts[0], parts[1], Double.parseDouble(parts[2]), Double.parseDouble(parts[3]));
                    n++;
                }
            }
            //sorts items in galaxy using an insertion sort
            //then prints each star in galaxy
            sort(galaxy, n);
            print(galaxy,n);

            input.close();

        } catch (FileNotFoundException e) {
            System.err.println("Could not find stars.txt");
            System.exit(1);
        }
        System.out.println("Done");
    }

    public static void sort(Star[] galaxy, int n) {
        for (int i=1; i<n; i++) {
            Star nextValueToInsert = galaxy[i];
            int j = i-1;

            while (j>=0 && nextValueToInsert.compareTo(galaxy[j]) < 0) {
                galaxy[j+1] = galaxy[j];
                j--;
            }
            galaxy[j+1] = nextValueToInsert;
        }
    }

    public static void print(Star[] galaxy, int n) {
        System.out.printf("---------------- %d Stars ----------------\n", n);
        for(int i=0; i<n; i++) {
            System.out.printf("[%d] %s\n", i, galaxy[i].toString());
        }
    }
}
