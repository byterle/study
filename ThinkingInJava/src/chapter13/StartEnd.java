package chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartEnd {
    public static String input =
            "As long as there is injustice, whenever a\n" +
            "Targathian baby cries out, wherever a distress\n" +
            "signal sounds among the stars ... We'll be there.\n" +
            "This fine ship, and this fine crew ...\n" +
            "Never give up! Never surrender!";
    private static class Display {
        private boolean regexPrinted = false;
        private String regex;
        Display(String regex) {
            this.regex = regex;
        }
        void display(String message) {
            if (!regexPrinted) {
                System.out.println(regex);
                regexPrinted = true;
            }
            System.out.println(message);
        }
    }
    static void examine(String s, String regex) {
        Display d = new Display(regex);
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find()) {
            d.display("find() '" + m.group() + "' start = " + m.start() + " end = " + m.end());
        }
        if (m.lookingAt())
            d.display("lookingAt() start = " + m.start() + " end = " + m.end());
        else System.out.println("lookingAt() false");
        if (m.matches())
            d.display("matches() start = " + m.start() + " end = " + m.end());
        else System.out.println("matches false");
    }

    public static void main(String[] args) {
        for (String in : input.split("\n")) {
            System.out.println("input : " + in);
            for (String regex : new String[] {"\\w*ere\\w*", "\\w*ever", "T\\w+", "Never.*?!"})
                examine(in, regex);
        }
    }
}
