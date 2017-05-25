import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Test04 {
    public static int n = 100000;

    public static void link_list_access_test() {
        LinkedList<Integer> list = new LinkedList<Integer>();

        for(int i=0; i < n; i++) {
            list.add(0, 0);
        }

        long startTime = System.nanoTime();
        for(int i = 0; i < n; i++) {
            int x = list.get(i);
        }
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000000.;
        System.out.println(String.format("link_list_access_test test took %f seconds.", duration));
    }

    public static void array_access_test() {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i < n; i++) {
            list.add(0,0);
        }
        long startTime = System.nanoTime();
        for(int i = 0; i < n; i++) {
            int x = list.get(i);
        }
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000000.;
        System.out.println(String.format("array_add_test test took %f seconds.", duration));
    }

    public static void stack_access_test() {
        Stack<Integer> stack = new Stack<Integer>();

        for(int i=0; i < n; i++) {
            stack.add(0, 0);
        }
        long startTime = System.nanoTime();
        for(int i = 0; i < n; i++) {
            int x = stack.get(i);
        }
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000000.;
        System.out.println(String.format("stack_access_test test took %f seconds.", duration));
    }

    public static void main(String [] args) {
        link_list_access_test();
        link_list_access_test();
        array_access_test();
        stack_access_test();
    }
}
