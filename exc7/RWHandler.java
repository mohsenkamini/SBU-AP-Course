import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.Semaphore;
import java.util.function.Consumer;
import java.util.List;
import java.util.Arrays;

public class RWHandler {
    String filePath;
    public RWHandler(String filePath) {
        this.filePath=filePath;
    }
    public static void main (String [] args) {
        List<String> list = Arrays.asList("a", "mb", "abc");
        Consumer<String> consumer = (String x) -> System.out.println(x.charAt(0));
        consumer.accept("rg0");
        forEach(list, consumer);
    }
    static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
    
    public void write(Consumer<FileOutputStream> writeHandler) {
        semaphore = new Semaphore(1);
        File file = new File(this.filePath);
        FileOutputStream input = new FileOutputStream(file);

        if (semaphore.tryAcquire())
        {
            try {
              writeHandler.accept(input);
              semaphore.release();
            } finally {
                input.close();
            }
        }
        else {
            
        }
    }

    /*public void read(Consumer<FileInputStream> readHandler) {

    }
    */
}
