import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try {
            Scanner input = new Scanner(new File("stars.txt"));

            while (input.hasNextLine()){
                String line = input.nextLine();
                String[] parts = line.split("\\t");
                if(parts.length == 4) {
                    String name = parts[0];
                    String constellation = parts[1];
                    double magnitude = Double.parseDouble(parts[2]);
                    double distance = Double.parseDouble(parts[3]);
                    Star star = new Star(name, constellation, magnitude, distance);
                    System.out.println(star.toString());
                }
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.err.println("Could not find stars.txt");
            System.exit(1);
        }
        System.out.println("Done");
    }
}
