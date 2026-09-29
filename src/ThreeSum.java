import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import edu.princeton.cs.algs4.In;


public class ThreeSum {

    // Count triples that sum to 0 (brute force O(n^3))
    public static int count(int[] a) {

        int count = 0;
        for (int x = 0; x < a.length; x++) {
            for (int y = x+1; y < a.length; y++) {
                for (int z = y+1; z < a.length; z++) {
                    if (a[x]+a[y]+a[z]==0) {
                        count++;
                    }
                }
            }
        }
        //TODO: Finish THreeSum

        return count;
    }

    public static void main(String[] args) throws IOException {
        In in = new In(args[0]);
        int[] a = in.readAllInts();


        // Time only the count() call
        Stopwatch timer = new Stopwatch();
        int count = count(a);
        double time = timer.elapsedTime();

        System.out.printf("Count = %d  time = %.3f seconds%n", count, time);
    }
}
