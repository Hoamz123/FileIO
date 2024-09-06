package File;

import java.io.File;

public class CreateFile {
    //Cach tao file
    public static void main(String[] args) {
        try{
            File myFile = new File("input.txt");
            if(myFile.createNewFile()){
                System.out.println("File Created");
            }
            else{
                System.out.println("File already exists");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
