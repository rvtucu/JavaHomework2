import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Config {
    private static Config instance;
    private String color;
    private int weight;
    private boolean loaded = false;

    private Config() {}

    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    public String getColor() {
        loadIfNeeded();
        return color;
    }

    public int getWeight() {
        loadIfNeeded();
        return weight;
    }

    private synchronized void loadIfNeeded() {
        if (!loaded) {
            loadConfig();
            loaded = true;
        }
    }

    private void loadConfig() {
        try {
            String content = new String(Files.readAllBytes(Paths.get("config.json")));

            int colorKeyIndex = content.indexOf("\"color\"");
            if (colorKeyIndex != -1) {
                int colorColonIndex = content.indexOf(':', colorKeyIndex);
                int colorValueStart = content.indexOf('"', colorColonIndex) + 1;
                int colorValueEnd = content.indexOf('"', colorValueStart);
                if (colorValueEnd != -1) {
                    color = content.substring(colorValueStart, colorValueEnd);
                }
            }

            int weightKeyIndex = content.indexOf("\"weight\"");
            if (weightKeyIndex != -1) {
                int weightColonIndex = content.indexOf(':', weightKeyIndex);
                int weightValueEnd = content.indexOf(',', weightColonIndex);
                if (weightValueEnd == -1) {
                    weightValueEnd = content.indexOf('}', weightColonIndex);
                }
                String weightStr = content.substring(weightColonIndex + 1, weightValueEnd).trim();
                weight = Integer.parseInt(weightStr);
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Eroare: " + e.getMessage());
        }
    }
}