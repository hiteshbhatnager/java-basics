package project9;

public class string {
    public static void main(String[] args) {
        String anime = "bleach";
        System.out.println(anime);

        String charachter = new String("Ichigo");
        System.out.println(charachter);

        System.out.println(charachter.charAt(0));
        System.out.println(charachter.charAt(2));
        System.out.println(charachter.indexOf("c"));
        System.out.println(charachter.toLowerCase());
        System.out.println(charachter.toUpperCase());

        String wifu = new String("ichigo wife is orihime");
        System.out.println(wifu.contains("orihime"));

        System.out.println(wifu.startsWith("ichigo"));
        System.out.println(wifu.endsWith("orihime"));
    }
}
