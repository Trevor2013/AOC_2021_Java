package main;

public class Main {

    public static void main(String[] args) {
        int[] depths = new int[]{10, 20, 30, 20, 40, 30, 50, 100, 80, 90};
        int count;
        count = SonarSweep.sweep(depths);
        System.out.println(count);
    }
}
