import java.io.*;
import java.util.Date;

public class NewFile {
    public static void main(String[] args) throws IOException {
        File file = new File("Vvod/src/main/resources/lib/test3.txt");
       /* String[] str = file.list((dir, name) -> name.endsWith(".txt"));
        for (String s : str){
            System.out.println(s);
        }*/
if(!file.exists()){
    file.createNewFile();
}
     /*   System.out.println(file.length());
        System.out.println(new Date(file.lastModified()));
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());*/
        System.out.println(file.getName());
/*
        FileWriter fileWriter = new FileWriter(file, true);

        fileWriter.write("\nHHHJJJ");
        fileWriter.close();*/

       long start= System.currentTimeMillis();
       try(var i= new FileInputStream(file)){
           int a;
           byte [] b=new byte[4096];
           while((a=i.read(b))!=-1){
               System.out.print(new String(b));
           }
       }
       catch (IOException e){

       }
long finish = System.currentTimeMillis();
        System.out.println();
        System.out.println(finish-start);
    }
}
