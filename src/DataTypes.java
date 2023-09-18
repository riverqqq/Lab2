import java.util.Arrays;
import java.util.List;

public class DataTypes {
    // TODO TASK 1: fix this code so that it passes the test in DataTypesTest.java
    public static long sum(List<Integer> numbers) {

        long s = 0;
        // below is a "foreach" loop which iterates through numbers
        for (int x : numbers) {
            s += x;
        }
        return s;
    }

    public static void main(String[] args) {

        System.out.println(sum(Arrays.asList(1, 2, 3, 4, 10000)));
    }
}
