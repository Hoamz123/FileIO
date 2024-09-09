package File;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("input.txt"));
            String line = sc.nextLine();
            System.out.println(line);
            int n = Integer.parseInt(sc.nextLine());
            System.out.println(n);
            String s = sc.nextLine();
            System.out.println(s);
            sc.close();
        }catch (IOException e){
            System.out.println(e.getMessage());//pull da update
        }

    }
}
