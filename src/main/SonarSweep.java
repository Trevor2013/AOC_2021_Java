package main;

// Class implements sweep method.
public class SonarSweep {

    public static int sweep(int[] d)
    {
        int count = 0;
        int last = d[0];
        for (int i = 1; i < d.length; i++) {
            if (d[i] > last) {
                count += 1;
            }
            last = d[i];
        }
        return count;
    }

}
