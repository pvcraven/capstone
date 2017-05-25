import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Test02 {
    private static int n = 10000000;

    private static void link_list_add_test() {
        LinkedList<Integer> list = new LinkedList<Integer>();

        for(int i=0; i < n; i++) {
            list.add(0);
        }
    }

    private static void array_add_test() {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i < n; i++) {
            list.add(0);
        }
    }

    private static void stack_add_test() {
        Stack<Integer> stack = new Stack<Integer>();

        for(int i=0; i < n; i++) {
            stack.add(0);
        }
    }
    public static void main(String [] args) {
        System.out.println("Warming up...");
        for(int test=0; test < 20; test++) {
            array_add_test();
        }

        double total_duration = 0.0;
        System.out.println("Starting array_add_test test...");
        for(int test=0; test < 20; test++) {
            long startTime = System.nanoTime();
            array_add_test();
            long endTime = System.nanoTime();
            double duration = (endTime - startTime) / 1000000000.;
            total_duration += duration;
            System.out.println(String.format("array_add_test test took %f seconds.", duration));
        }
        System.out.println(String.format("Total array_add_test took %f seconds.", total_duration));

        total_duration = 0.0;
        System.out.println("Starting link_list_add_test test...");
        for(int test=0; test < 20; test++) {
            long startTime = System.nanoTime();
            link_list_add_test();
            long endTime = System.nanoTime();
            double duration = (endTime - startTime) / 1000000000.;
            total_duration += duration;
            System.out.println(String.format("link_list_add_test test took %f seconds.", duration));
        }
        System.out.println(String.format("Total link_list_add_test took %f seconds.", total_duration));

        total_duration = 0.0;
        System.out.println("Starting stack_add_test test...");
        for(int test=0; test < 20; test++) {
            long startTime = System.nanoTime();
            stack_add_test();
            long endTime = System.nanoTime();
            double duration = (endTime - startTime) / 1000000000.;
            total_duration += duration;
            System.out.println(String.format("stack_add_test test took %f seconds.", duration));
        }
        System.out.println(String.format("Total stack_add_test took %f seconds.", total_duration));

    }
}
