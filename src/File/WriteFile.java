package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {
        try{
            FileWriter w = new FileWriter("input.txt");
            w.write("Hello World");
            w.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static class Bai1 {
        public static boolean snt(int n){
            if(n < 2) return false;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0) return false;
            }
            return true;
        }
        public static void main(String[] args) {
            ArrayList<Integer> a = new ArrayList<>();
            try{
                Scanner sc = new Scanner(new File("input.txt"));
                FileWriter w = new FileWriter("output.txt");
                while(sc.hasNext()){
                    int x = Integer.parseInt(sc.next());
                    if(snt(x)) a.add(x);
                }
                Collections.sort(a);
                for (Integer integer : a) {
                    w.write(String.valueOf(integer) + " ");
                }
                sc.close();
                w.close();
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
