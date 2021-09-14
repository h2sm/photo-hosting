package photohosting;

import photohosting.JSONhandler.JsonHanlder;
import photohosting.generator.Generator;
import photohosting.web.Browser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        var gen = new Generator();
        while (true){
            try {
                var imgCode = gen.generate();
                System.out.println("Trying " + imgCode + "...");
                var json = Browser.getJson(imgCode);
                if (JsonHanlder.checkJson(json)){
                    System.out.println("Downloadable picture found: " + imgCode);
                    JsonHanlder.downloadPicture(json);
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
