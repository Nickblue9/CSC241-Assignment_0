import java.util.Scanner;
import java.io.*;

class Sum{
    public static void main (String [] args){
        File f = new File(args[0]);

        int sum = 0;

        try {
            Scanner input = new Scanner(f);
            while (input.hasNextLine()) {
                sum += Integer.parseInt(input.nextLine());
            }
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(sum);
    }
}