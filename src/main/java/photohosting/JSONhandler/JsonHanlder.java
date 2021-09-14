package photohosting.JSONhandler;

import org.json.JSONObject;

public class JsonHanlder {
    public static boolean checkJson(JSONObject json){
        return json.get("status").equals("success");
    }
    public static void downloadPicture(JSONObject jsonObject){

    }
}
