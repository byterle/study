package chapter13;

public class Replacing {
    static String s = "Then, when you have found the shrubbery, you must cut down the mightiest tree in the forest... with... a herring!";
    public static void main(String[] args) {
        System.out.println(s.replaceAll("f\\w+", "located"));
        System.out.println(s.replaceAll("shrubbery|tree|herring", "banana"));
    }
}
