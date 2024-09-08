import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OccurrenceOfSpecificElement {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,4,32,1,2,3,1,3,2,3,12,12,1));
        int specificNum = 1;
        int count = (int) numbers.stream().filter(n -> n == specificNum).count();
        System.out.println("The number " + specificNum + " occurs " + count + " times.");


    }
}
