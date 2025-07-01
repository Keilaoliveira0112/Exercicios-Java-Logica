package condicionais.exercicios;
import java.util.*;
public class LeituraAteEOF {


    public class Solutions {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int lineNumber = 1 ;

            while(sc.hasNext()) {
                String line = sc.nextLine();
                System.out.println(lineNumber + " " + line);
                lineNumber++;
            }
            sc.close();
        }
    }
}
