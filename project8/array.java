package project8;

public class array {

    public static void aray(String[] arr) {

        System.out.println(arr[2]);
        arr[2] = "hitesh";

    }

    public static void main(String[] args) {
        String[] arr = { "ichigo", "aurahime", "rukia", "aizen", "uryu", "zaraki", "hitsugaya" };
        aray(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // int[] marks = { 10, 20, 30, 40, 50 };

        // System.out.println(marks[2]);
        // System.out.println(marks[1]);
        // System.out.println(marks[0]);

        // marks[4] = 1000;
        // System.out.println(marks[4]);

        // System.out.println(marks.length);

        // for (int i = 0; i < marks.length; i++) {
        // System.out.println(marks[i]);
        // }

    }
}
