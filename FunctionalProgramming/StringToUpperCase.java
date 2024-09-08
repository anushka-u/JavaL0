import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToUpperCase {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>(Arrays.asList("hello", "world","whisper","snitch","sulks"));
        names = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(names);
    }
}
