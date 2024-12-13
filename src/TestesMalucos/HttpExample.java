package TestesMalucos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpExample {

    // Method to perform a GET request and measure response time
    public static void sendGetRequest(String url) throws Exception {
        long startTime = System.currentTimeMillis();

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");

        int responseCode = con.getResponseCode();
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("GET Response Code :: " + responseCode);
        System.out.println("Response time in ms :: " + duration);

        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // print result
            System.out.println(response.toString());
        } else {
            System.out.println("GET request not worked");
        }
    }

    public static void main(String[] args) {
        try {
            // Example GET request
            sendGetRequest("https://jsonplaceholder.typicode.com/posts/1");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}