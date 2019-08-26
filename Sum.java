import java.util.Scanner;
import java.io.*;

public class Sum{
    public static void main (String [] args){
        String path;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter File Path: ");
        path = input.nextLine();

        File f = new File(path);
        Scanner fScanner = null;
        try {
            fScanner = new Scanner(f);
        }catch(FileNotFoundException e){e.printStackTrace();System.exit(1);}

        int sum = 0;

            while (fScanner.hasNextLine()) {
                try{
                    sum+=Integer.parseInt(fScanner.nextLine());
                }catch(Error e){e.printStackTrace();}
            }
        System.out.println("Sum:" +sum);
    }
}