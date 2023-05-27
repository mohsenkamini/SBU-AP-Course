package URL;
import java.net.*;

public class URLDemo {
    public class static void main (String[] args) {
        try {
            URL url=new URL("https://www.google.com/search?q=test&oq=test&aqs=chrome..69i57j69i59j0i271l2j69i61j69i60l2.980j0j7&sourceid=chrome&ie=UTF-8");
            System.out.println("protocol: " + url.getProtocol() );
            System.out.println("host name: " + url.getHost() );
            System.out.println("port number: " + url.getPort() );
            System.out.println("default port number: " + url.getDefaultPort() );
            System.out.println("query string: " + url.getQuery() );
            System.out.println("path: " + url.getPath() );
            System.out.println("file: " + url.getFile() );

        } catch (Exception a) {System.out.println(a);}
    }
}
