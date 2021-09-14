package photohosting.generator;

public class Generator {
    private final byte[] alphabet = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private byte[] pointers = {0, 0, 0, 0, 0};//счетчик битов
    private final int maxLength = alphabet.length;//
    private int changingBit = pointers.length-1;

    public String generate() {
        var sb = new StringBuilder();

        for (byte pointer : pointers) {
            var b = alphabet[pointer];
            if ((int) b > 10) sb.append((char) b);
            else sb.append(b);
        }
        pointers[changingBit] += 1;

        if (pointers[changingBit] == maxLength) {
            pointers[changingBit] = 0;
            pointers[changingBit-1]+=1;
            if (pointers[changingBit-1]==maxLength){
                pointers[changingBit-1]=0;
                pointers[changingBit-2]+=1;
                if (pointers[changingBit-2]==maxLength){
                    pointers[changingBit-2]=0;
                    pointers[changingBit-3]+=1;
                    if (pointers[changingBit-3]==maxLength){
                        pointers[changingBit-3]=0;
                        pointers[changingBit-4]+=1;
                        if (pointers[changingBit-4]==maxLength){
                            System.exit(0);
                        }
                    }
                }
            }
        }
        return sb.toString();
    }

}
