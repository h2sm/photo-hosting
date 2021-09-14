package photohosting;

import photohosting.generator.Generator;

public class Main {
    public static void main(String[] args) {
        var gen = new Generator();
        while (true) gen.generate();
    }
}
