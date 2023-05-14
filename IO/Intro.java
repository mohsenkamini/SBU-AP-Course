import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class Intro {
    public static void main (String[] args) throws IOException {
        File file1 = new File ("./some.txt");
        //File file2 = new File ("./some1.txt");
        //File file3 = new File ("./d/d/some1.txt");
        //File file4 = new File ("./ap/s/some1.txt");
        //System.out.println(file1.exists());
        //file2.createNewFile();
        //file3.mkdir();
        //file4.mkdirs();
        //System.out.println(file1.delete());
        //file2.isFile();
        //file2.isDirectory();
        //File file5 = new File ("/tmp/");
        //String[] fileNames = file5.list();
        //File[] files = file5.listFiles();
        //for (int i=0 ; i < fileNames.length ; i++)
        //{
        //    System.out.println(fileNames[i]);
        //    System.out.println(files[i]);
        //    System.out.println(new Date (files[i].lastModified()));
        //    
        //}
        //PrintWriter writer = new PrintWriter(file1);
        //writer.print("Mohsen K Amini ");
        //writer.print((int)98242128 + " ");
        //writer.print((float)20+ " ");
        //writer.print(true+ " ");
        //writer.flush();

        //Scanner input = new Scanner(file1);
        //while (input.hasNext()) {               //EOF of file is -1
        //    String firstName = input.next();
        //    String middleName = input.next();
        //    String lastName = input.next();
        //    int stuNo = input.nextInt();
        //    float stuAv = input.nextFloat();
        //    Boolean flag = input.nextBoolean();
        //    System.out.println(firstName+middleName+lastName+stuNo+stuAv+flag);
        //}
        ////FileWriter fWr = new FileWriter("./some.txt");
        //fWr.write("my name is folan");
        //fWr.close();
        
        //FileReader fRe = new FileReader("/home/mohsen/Pictures/LUT_view.png");
        //int i;
        //while ((i = fRe.read()) != -1)
        //    System.out.print(i);
        
        RandomAccessFile file = new RandomAccessFile("./some.txt", "rw");

        System.out.println(file.getFilePointer());
        file.seek(200);
        int aByte = file.read();
        System.out.println((char)(aByte));
        System.out.println(file.getFilePointer());
        file.append("ehem".getBytes());
        file.close();


    }
}