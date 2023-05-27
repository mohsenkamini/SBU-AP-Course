import java.io.File;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FileFilter;

public class LyricsRepository {
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public static void main (String[] args) {
        LyricsRepository lr = new LyricsRepository("./secrets","./l_out/");
        lr.run();
    }
    public FileFilter fileFilter = new FileFilter() {
        @Override
        public boolean accept(File pathname) {
            if (pathname.getName().endsWith(".txt")) {
                return true;
            }
            return false;
        }
    };

    String source,destination;

    public LyricsRepository(String source, String destination) {
        this.source=source;
        this.destination=destination;
    }

    public void setFileFilter(FileFilter fileFilter) {
        this.fileFilter=fileFilter;
    }

    public void run() {
        String data="";
        String[] tmp;
        try {
            File sourceFile = new File (this.source);
            File destinationFile = new File (this.destination);
            File artistDir;
            File albumDir;
            File dst;
            destinationFile.mkdirs();

            File[] files = sourceFile.listFiles(this.fileFilter);
            
            for (int i=0 ; i < files.length ; i++)
            {
                data = Files.readAllLines(Paths.get(files[i].getAbsolutePath())).get(0);
                tmp=data.split(" - ");
                //artistDir =new File (destinationFile+"/"+tmp[0]);
                
                //System.out.println(artistDir.getAbsolutePath());
                //System.out.println(tmp[0]);
                
                switch(tmp.length) {
                    case 3:
                        artistDir =new File (destinationFile+"/"+tmp[0]);
                        albumDir =new File (artistDir+"/"+tmp[1]);
                        albumDir.mkdirs();
                        dst= new File(albumDir+"/"+tmp[2]+".txt");
                        // FileUtils.copyFile(files[i].getAbsolutePath(), dst);
                        // System.out.println(files[i].getAbsolutePath());
                        System.out.println(dst.getAbsolutePath());
                        copyFileUsingStream(files[i], dst);
                        break;
                    case 2:
                        artistDir =new File (destinationFile+"/"+tmp[0]);
                        albumDir =new File (artistDir+"/"+"(Single)");
                        albumDir.mkdirs();
                        dst= new File(albumDir+"/"+tmp[1]+".txt");
                        // FileUtils.copyFile(files[i].getAbsolutePath(), dst);
                        copyFileUsingStream(files[i], dst);
                        break;
                    default:
                        break;
                }
            }
                //System.out.println(files[i].getAbsolutePath());
            
        }catch(Exception a) {};
    }
}
