import java.io.File;

public class Main {
    public static void main(String[] args) {
        File output = new File("./l_out");
        output.mkdirs();
        LyricsRepository lr = new LyricsRepository("./secrets", output.getPath());
        lr.run();
    }
}
