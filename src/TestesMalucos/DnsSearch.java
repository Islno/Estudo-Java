package TestesMalucos;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class DnsSearch {
    public static void main(String[] args) {
        String url = "www.github.com";
        try {
            long startTime = System.currentTimeMillis();
            InetAddress address = InetAddress.getByName(url);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;

            System.out.println("Host name: " + address.getHostName());
            System.out.println("Canonical host name: " + address.getCanonicalHostName());
            System.out.println("IP address: " + address.getHostAddress());
            System.out.println("Response time in ms: " + duration);
        } catch (UnknownHostException e) {
            System.out.println("Could not resolve " + url);
        }
    }
}