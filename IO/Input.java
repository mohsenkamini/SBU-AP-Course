import java.io.*;
public class Input {
    public static void main(String[] args) throws IOException{
        byte[] array = new byte[256];
        InputStream input = new FileInputStream("/home/mohsen/Downloads/12_Pointers.pdf");
        InputStream input1 = new FileInputStream("./some.txt");
        InputStream input2 = new FileInputStream("./some1.txt");
        
        Reader reader = new FileReader("./some.txt");
        Writer writer = new FileWriter("./some1.txt",true);     // will append when write is called
        int data= reader.read();
        System.out.println((char)(data+2));
        
        writer.write((char)(data+2));
        writer.close();
        SequenceInputStream sis =new  SequenceInputStream(input1,input2);
        int i;
        //while ((i = (int)sis.read()) !=1 )          // this does not end
        //{
        //    System.out.print((char)i);
        //}
        //int data = input.read(array) ;
//
        //while((int)data != -1)
        //{
        //    for (int i=0 ; i < data ; i++) 
        //        System.out.print(" "+array[i]);
        //    System.out.println("");
        //    System.out.println("");
        //    data=input.read(array);
        //}
        //OutputStream output = new FileOutputStream("./pdf.pdf");
        //while((int)data != -1) {
        //    data = input.read(array) ;
        //    output.write(data);
        //}
        //output.close();
    }
}
