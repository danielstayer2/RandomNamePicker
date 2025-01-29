import java.util.Properties;

public class SendEmail {

    public static String buildEmail(String[] recipients, String sender){
        // Local host for server
        String host = "127.0.0.1";

        // Getting system properties
        Properties sysProp = System.getProperties();

        // Setting up mail server
        sysProp.setProperty("mail.smtp.host", host);

    }
}
