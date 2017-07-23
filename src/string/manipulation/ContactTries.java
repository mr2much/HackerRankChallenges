package string.manipulation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactTries {

    public static void main(String[] args) {
        String names = "";

        names += "Anubis\n";
        names += "loAn\n";
        names += "Ana";

        String sub = "\\b(An)\\b";
        Pattern pattern = Pattern.compile(sub);
        Matcher matcher = pattern.matcher(names);

        System.out.println("Grupos: " + matcher.groupCount());

        int count = 0;
        while(matcher.find()) {
            count++;
        }
        System.out.println("Se encontraron: " + count);
        System.out.print(names);

        System.out.println(names.split("An").length - 1);
        System.out.println(pattern.split("^[" + sub + "]").length);
    }
}
