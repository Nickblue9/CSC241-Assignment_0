import java.util.Scanner;
import java.io.*;

public class Sum{
    public static void main (String [] args){
        Test_1("Test1.txt");
        Test_2("Test2.txt");
    }

    public static void Test_1(String path){
        System.out.println(getSum(path));
    }

    public static void Test_2(String path){
        System.out.println(getSum(path));
    }

    private static int getSum(String path){
        Scanner input = new Scanner(System.in);
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
        return sum;
    }
}