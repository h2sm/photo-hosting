package photohosting.web;

import org.json.JSONObject;
import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Browser {
    public static JSONObject getJson(String pictureID) throws IOException {
        try (InputStream stream = new URL("https://micropic.ru/api/view/" + pictureID).openStream()) {
            BufferedReader rd = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        }

    }
    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) sb.append((char) cp);
        return sb.toString();
    }
}
