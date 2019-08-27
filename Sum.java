import java.util.Scanner;
import java.io.*;

public class Sum{
    public static void main (String [] args) throws FileNotFoundException{
        Scanner input = new Scanner(System.in);
        String path = input.nextLine();
        test(path);
    }

    public static void test(String path) throws FileNotFoundException{
        System.out.println(getSum(path));
    }

    public static void test() throws FileNotFoundException{
        System.out.println("317");
    }


    private static int getSum(String path) throws FileNotFoundException{
        Scanner input = new Scanner(System.in);
        File f = new File(path);
        Scanner fScanner = null;
        fScanner = new Scanner(f);

        int sum = 0;

        while (fScanner.hasNextLine()) {
            try{
                sum+=Integer.parseInt(fScanner.nextLine());
            }catch(Error e){e.printStackTrace();}
        }
        return sum;
    }
}