import java.util.regex.Pattern;

public class RegexQuantifier {
    public static void main(String[] args) {
        System.out.println("---?quantifier---");
        System.out.println(Pattern.matches("[amn]?", "abcd"));
        System.out.println(Pattern.matches("[amn]?", "a"));
        System.out.println(Pattern.matches("[amn]?", "aman"));
        System.out.println(Pattern.matches("[amn]?", "am"));
        System.out.println(Pattern.matches("[amn]?", "azt"));

        System.out.println("---+quantifier---");
        System.out.println(Pattern.matches("[amn]+", "abcd"));
        System.out.println(Pattern.matches("[amn]+", "a"));
        System.out.println(Pattern.matches("[amn]+", "aman"));
        System.out.println(Pattern.matches("[amn]+", "am"));
        System.out.println(Pattern.matches("[amn]+", "azt"));

        System.out.println("---*quantifier---");
        System.out.println(Pattern.matches("[amn]*", "abcd"));
        System.out.println(Pattern.matches("[amn]*", "a"));
        System.out.println(Pattern.matches("[amn]*", "aman"));
        System.out.println(Pattern.matches("[amn]*", "am"));
        System.out.println(Pattern.matches("[amn]*", "azt"));
    }
}
