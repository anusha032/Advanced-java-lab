package lab2;

public class StringPerformanceTest {
    public static void main(String[] args) {

        int iterations = 10000;

        // 1. StringBuffer Test
        StringBuffer sbuffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            sbuffer.append("AIET");
        }

        long endTimeBuffer = System.nanoTime();
        long timeBuffer = endTimeBuffer - startTimeBuffer;

        System.out.println("StringBuffer Time: " + timeBuffer + " ns");

        // 2. StringBuilder Test
        StringBuilder sbuilder = new StringBuilder();
        long startTimeBuilder = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            sbuilder.append("AIET");
        }

        long endTimeBuilder = System.nanoTime();
        long timeBuilder = endTimeBuilder - startTimeBuilder;

        System.out.println("StringBuilder Time: " + timeBuilder + " ns");

        // 3. Comparison Result
        if (timeBuffer > timeBuilder) {
            System.out.println("\nStringBuilder is faster than StringBuffer.");
        } else if (timeBuffer < timeBuilder) {
            System.out.println("\nStringBuffer is faster than StringBuilder.");
        } else {
            System.out.println("\nBoth have similar performance.");
        }
    }
}