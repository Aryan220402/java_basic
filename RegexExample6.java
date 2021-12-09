import java.util.regex.*;
public class RegexExample6 
{
    public static void main(String args[])
    {
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","2haRAD"));
        System.out.println(Pattern.matches("[0-9]{10}","9876543211"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","kkvarun32"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","JA2UK2"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","arun$2"));
    }
}
