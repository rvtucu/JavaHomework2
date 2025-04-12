import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebHelper {
    private static WebHelper instance;
    private String websiteContent;
    private boolean loaded = false;
    private final String TARGET_URL = "https://example.com";

    private WebHelper() {}

    public static WebHelper getInstance() {
        if (instance == null) {
            instance = new WebHelper();
        }
        return instance;
    }

    public String getWebSiteContent() {
        if (!loaded) {
            loadWebsiteContent();
            loaded = true;
        }
        return websiteContent;
    }

    private synchronized void loadWebsiteContent() {
        try {
            URL url = new URL(TARGET_URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder content = new StringBuilder();
            String inputLine;

            while ((inputLine = reader.readLine()) != null) {
                content.append(inputLine);
            }
            reader.close();
            connection.disconnect();

            websiteContent = content.toString();
        } catch (Exception e) {
            websiteContent = "Error loading content: " + e.getMessage();
        }
    }
}