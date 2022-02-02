package de.neuefische.methoden;

public class Main {
    public static void main(String[] args) {
        System.out.println(containsFancyAndgt20("sehr fancy"));
        System.out.println(containsFancyAndgt20("nun ist die fancy Ausgabe true"));
    }

    private static boolean containsFancyAndgt20(String s) {
        return s.contains("fancy") && s.length() > 20;
    }
}
