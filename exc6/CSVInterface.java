import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.nio.file.Path;

public class CSVInterface {
    public static void main (String[] args) {
        CSVInterface test = new CSVInterface(",");
        try {
            String fileName="./fd.csv";
            String[][] str = test.readCSV(fileName);
            String[] cols = test.getCols(fileName);
            System.out.println( test.countOfRows(fileName));
            for (int i =0; i < str.length ; i++)
            {
                for (int j=0 ; j < str[i].length; j++)
                    System.out.println(str[i][j]);
                System.out.println("");
            }

            for (int i=0 ; i < cols.length ; i++)
                System.out.println(cols[i]);
            
            test.writeCSV(str,"./some.txt",false);
            System.out.println(test.hasCol("mohsen",fileName));
        } catch (CSVErrorException a) {}
    }


    String csvSplitBy;

    public CSVInterface(String csvSplitBy) {
        this.csvSplitBy=csvSplitBy;
    }
    public String[][] readCSV(String fileName) throws CSVErrorException {
        //File input = new File (fileName);
        int i_size = this.countOfRows(fileName);
        String[][] str = new String[i_size][];
        try {
            for (int i=0; i<i_size ;i++)
            {
                String data = Files.readAllLines(Paths.get(fileName)).get(i);
                str[i] = data.split(csvSplitBy);
            }
        } catch(Exception a) {throw new CSVErrorException("") ;}
        return str;
    }

    public boolean writeCSV(String[][] lines, String fileName, boolean append) {
        boolean flag=true;
        FileWriter fw = null; 
        BufferedWriter bw = null; 
        PrintWriter pw = null;   
            try { 
                fw = new FileWriter(fileName, append); 
                bw = new BufferedWriter(fw); 
                pw = new PrintWriter(bw); 
                for (int i=0 ; i<lines.length ; i++)
                {
                    for (int j=0 ; j < lines[i].length-1 ; j++)
                        pw.print(lines[i][j]+csvSplitBy);
                    pw.println(lines[i][lines[i].length-1]);
                }
                pw.flush(); 
                flag=true; } catch (IOException io) {};
                try { 
                        pw.close(); 
                        bw.close(); 
                        fw.close(); 
                } catch (Exception c) {
                        flag=false;
                } 
        return flag;
}


    public String[] getCols(String fileName) throws CSVErrorException {
        String data="";
        try {
            data = Files.readAllLines(Paths.get(fileName)).get(0);
        } catch(Exception a) {throw new CSVErrorException("") ;}
        return data.split(csvSplitBy);
    }

    public boolean hasCol(String col, String fileName) throws CSVErrorException {
        try{
            String[] cols = getCols(fileName);
            for (int i=0 ; i < cols.length ; i++) 
                if (cols[i].equals(col))
                    return true;
        } catch(Exception a) {throw new CSVErrorException("") ;}
        return false;
    }

    public int countOfRows(String fileName) throws CSVErrorException{
        long lines = 0;
        try {
            Path path = Paths.get(fileName);
            lines = Files.lines(path).count();
        } catch (Exception e) { throw new CSVErrorException("") ;}
        return (int)lines;
    }
    public int getSumOfCol(String fileName, String colName) throws ColDoesNotExist, CSVErrorException {
        if (!hasCol(colName, fileName))
            throw new ColDoesNotExist("");
        int result=0;

        try {
        String[][] str = this.readCSV(fileName);
        String[] cols = getCols(fileName);
        int j;
        for (j=0 ; j<cols.length;j++)
            if (cols[j].equals(colName))
                break;
        
            for (int i=1 ; i<str.length; i++)
                result+=Integer.valueOf( str[i][j]);
        }catch (Exception e) { throw new CSVErrorException("") ;}
        return result;
    }
}
class CSVErrorException extends Exception {
    CSVErrorException(String s) {
        super(s);
    }
}
class ColDoesNotExist extends Exception {
    ColDoesNotExist(String s) {
        super(s);
    }
}
