import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class ServiceCommunicator {
    private HttpURLConnection conn;
    //TODO modify oracle doc code to have try catch like alvinalexander code or project 5 code:https://github.com/ladybando/Project5/blob/main/src/ServiceCommunicator.java
  /*
   https://docs.oracle.com/javase/tutorial/jdbc/basics/connecting.html and project 5 code:https://github.com/ladybando/Project5/blob/main/src/ServiceCommunicator.java
*/
        /*
     Constructor - supply the target URL and try to make the connection
     */
    public ServiceCommunicator(String serviceURL) {
        try {
            URL url = new URL(serviceURL);
            URLConnection urlConnection = url.openConnection();
            conn = (HttpURLConnection) urlConnection;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
 get() - read the reply from the webserver specifed in the constructor.
        returns a string that captured the output from that service.
 */
    public String get() {
        StringBuilder urlString = new StringBuilder();
        String current;

        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            while ((current = in.readLine()) != null) {
                urlString.append(current);
            }
        } catch (IOException iox) {
            System.err.println("**Error in get().  Cannot read from URL");
        }
        return urlString.toString();
    }
    /*
     main method used just to test this class in isolation.  You will learn more about testing in another course
     */
/*    public static void main(String[] argv) {
        System.out.println(new ServiceCommunicator("http://www.google.com/").get());
    }*/

}
