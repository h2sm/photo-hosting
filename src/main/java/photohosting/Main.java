package photohosting;

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
                if (json.get("status").equals("success")){
                    System.out.println("Status is - " + json.get("status"));;
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
