import java.util.Scanner;

public class Input {

    String getStr() {
        System.out.println("Input a string:");
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        console.close();
        return str;
    }

    String trimStr() {
        String strTr = getStr();
        strTr = strTr.trim();
        return strTr;
    }
}
