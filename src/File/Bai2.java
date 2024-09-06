package File;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Bai2 {
    //ham de chuan hoa ten
    public static String chuanHoaTen(String name){
        String []s = name.toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String x : s){
            sb.append(Character.toUpperCase(x.charAt(0))).append(x.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }
    //ham tra ve ten
    public static String getName(String name){
        String []s = name.toLowerCase().split("\\s+");
        return s[s.length - 1];
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        try{
            Scanner sc = new Scanner(new File("Name.txt"));
            FileWriter w = new FileWriter("Convert.txt");
            while(sc.hasNext()){
                String name = chuanHoaTen(sc.nextLine());
                list.add(name);
            }
            list.sort(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return getName(o1).compareTo(getName(o2));
                }
            });
            for(String x : list){
                w.write(x + "\n");
            }
            sc.close();
            w.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
