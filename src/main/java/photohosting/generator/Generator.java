package photohosting.generator;

public class Generator {
    //используются строчные и прописные буквы вместе с цифрами от 0 до 9.
    //итого - 26+26+10 = 62 варианта на одном месте
    private final byte[] alphabet = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private byte[] pointers = {0, 0, 0, 0, 0};//счетчик битов
    private int length = alphabet.length;
    private int changingBit = 4;

    public String generate() {
        var sb = new StringBuilder();

        for (byte pointer : pointers) {
            var b = alphabet[pointer];
            if ((int) b > 10) sb.append((char) b);
            else sb.append(b);
        }
        pointers[changingBit] += 1;//добавляем еденичку к изменившемуся биту


        return sb.toString();
    }

}
