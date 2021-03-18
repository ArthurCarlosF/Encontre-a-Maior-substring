import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class maiorSubstring {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String min = null, max=null,palavra1, palavra2; //declare suas variaveis aqui
        while (( palavra1 =in.readLine()) != null) { // complete seu código
                palavra2 = in.readLine();

            if (palavra1.length()>palavra2.length()) {
                min=palavra2;
                max=palavra1;
            } else {
                min=palavra1;
                max=palavra2;
            }
            int minLength = min.length();
            int maxS = minLength;
            boolean f = true;
            while (maxS > 0 && f) { //altere as variaveis, se achar necessario
                int diff = minLength - maxS;
                for (int i = 0; i <=diff;i++ ) { //complete o laco de repeticao
                    if (max.contains(min.substring(i, i + maxS))) {
                        f = false;
                        maxS++;
                        break;
                    }
                }
                maxS--;
            }
            System.out.println(maxS);
        }
        out.close();
    }

}