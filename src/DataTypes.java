import java.util.Arrays;
import java.util.List;

public class DataTypes {
    // TODO TASK 1: fix this code so that it passes the test in DataTypesTest.java
    public static long sum(List<Integer> numbers) {
        Jonathan Calver
        long s = 0;
        // below is a "foreach" loop which iterates through numbers
        for (int x : numbers) {
            s += x;
        }
        return s;
    }

    public static void main(String[] args) {

        Integer a = 1;
        System.out.println(a);

    }
}
