import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class gen {

    Random rand = new Random();
    String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String lowerA = "abcdefghijklmnopqrstuvwxyz";
    String numbers = "0123456789";
    String specialChars = "!@#$%^&*";
    StringBuilder sb = new StringBuilder();

    String alphaPass = alpha + lowerA + numbers + specialChars;

    int SIZE = 14;



    public String randChars() {
        for(int i = 0; i < SIZE; i++) {
            int index = rand.nextInt(alphaPass.length());
            char randomChar = alphaPass.charAt(index);
            sb.append(randomChar);
        }
        String password = sb.toString();
        return password;
    }

    public void writeFile(String password) throws IOException {
        BufferedWriter writer = new BufferedWriter
                (new FileWriter("pass.csv"));
        writer.write(password);

        writer.close();
    }




}
