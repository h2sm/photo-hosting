package photohosting.generator;

public class Generator {
    //используются строчные и прописные буквы вместе с цифрами от 0 до 9.
    //итого - 26+26+10 = 62 варианта на одном месте
    private byte[] alphabet = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private byte[] counter = {0,0,0,0,0};//счетчик битов

    public String generate() {
        int currentBit = 4;
        int length = alphabet.length;
        for (byte b : counter){
            var string = new StringBuilder();
            string.append(alphabet[b]);
            System.out.println(string);
            counter[currentBit]+=1;
        }

        return "";
    }

}
