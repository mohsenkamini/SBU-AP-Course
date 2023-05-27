import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPBaseClient_2 {
    public static void main (String [] args)     {
        Scanner sc = new Scanner(System.in);
        DatagramSocket ds = new DatagramSocket();

        InetAddress ip = InetAddress.getLocalHost();
        byte buf[] = null;

        while (true) {
            String inp = sc.nextLine();

            buf = inp.getBytes();

            DatagramPacket OpSend = new DatagramPacket(buf, buf.length,ip,1234); 

            ds.send(OpSend);

            if (inp.equals("bye"))
                break;
        }
    }
}
