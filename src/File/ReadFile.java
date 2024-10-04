package File;

import java.io.File;

import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("output.txt"));
            while(sc.hasNext()){
                try{
                    int x = Integer.parseInt(sc.next());
                    System.out.print(x + " ");
                }catch(Exception e){
                    continue;
                }
            }
            sc.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
