package photohosting.JSONhandler;

import org.json.JSONObject;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonHandler {
    public static boolean checkJson(JSONObject json) {
        return json.get("status").equals("success");
    }

    public static void downloadPicture(JSONObject json) throws IOException {
        var internetAddress= (String) json.getJSONObject("image").get("full_adress");
        var name = (String) json.getJSONObject("image").get("id");
        System.out.println(internetAddress);
        try(InputStream in = new URL(internetAddress).openStream()){
            Files.copy(in, Paths.get("/mnt/DA9ACF429ACF19C1/testing/"+name+".jpg"));
        }

    }
}
