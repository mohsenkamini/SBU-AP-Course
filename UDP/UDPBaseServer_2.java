import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPBaseServer_2 {
    public static void main (String [] args)     {
        DatagramSocket ds = new DatagramSocket();

        byte receive[] = new byte[65535];
        DatagramPacket OpReceive = null;

        while (true) {
            OpReceive = new DatagramPacket(receive, receive.length);

            ds.receive(OpReceive);

            System.out.println("Client:- "+ data(receive));

            if (data(receive).toString().equals("bye"))
            {
                System.out.println("client sent bye ....Exiting");
                break;
            }
        }
        receive = new byte[65535];
    }
}
