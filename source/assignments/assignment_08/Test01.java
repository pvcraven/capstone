import java.util.LinkedList;

public class Test01 {
    private static int n = 10000000;

    private static void link_list_add_test() {
        LinkedList<Integer> list = new LinkedList<Integer>();

        for(int i=0; i < n; i++) {
            list.add(0, 0);
        }
    }

    public static void main(String [] args) {
        System.out.println("Starting test...");

        double total_duration = 0.0;
        for(int test=0; test < 20; test++) {
            long startTime = System.nanoTime();
            link_list_add_test();
            long endTime = System.nanoTime();
            double duration = (endTime - startTime) / 1000000000.;
            total_duration += duration;
            System.out.println(String.format("Test took %f seconds.", duration));
        }
        System.out.println(String.format("Total test took %f seconds.", total_duration));

    }
}
