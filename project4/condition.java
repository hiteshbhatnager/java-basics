public class condition {
    public static void main(String[] args) {
        int age = 19;
        boolean school = true;

        if (age <= 18 && school) {
            System.out.println("you are not adult");
        } else if (age >= 18 && school) {
            System.out.println("you are adult");
        }

        String anime = "bleach";

        switch (anime) {
            case "bleach":
                System.out.println("you are goat");

            case "af":
                System.out.println("no dout goat");

            default:
                break;
        }
    }
}