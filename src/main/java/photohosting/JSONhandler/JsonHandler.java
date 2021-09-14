package photohosting.JSONhandler;

import org.json.JSONObject;

import java.io.FileOutputStream;

public class JsonHandler {
    public static boolean checkJson(JSONObject json) {
        return json.get("status").equals("success");
    }

    public static void downloadPicture(JSONObject json) {
        var str= json.getJSONObject("image").get("full_adress");
        System.out.println(str);

    }
}
