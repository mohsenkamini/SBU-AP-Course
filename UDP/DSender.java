import java.net.*;
import java.nio.channels.DatagramChannel;

public class DSender {
    public static void main (String[] args) throws Exception   {
        DatagramSocket ds = new DatagramSocket();
        String str = "mohsen karbalaei amini ";
        InetAddress ip = InetAddress.getByName("localhost");

        DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(),ip,3000);
        ds.send(dp);
        ds.close();
    }
}
