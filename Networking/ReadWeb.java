package URL;

import java.net.*;
import java.io.*;

public class ReadWeb {
    public static void main (String[] args) throws Exception {
        URL url1 = new URL("https://github.com/mohsenkamini");
        URLConnection urlconn = url1.openConnection();
        InputStream stream = urlconn.getInputStream();
        int i;
        while ((i=stream.read())!= -1) {
            System.out.print((char)i);
        }
    }
}