import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupStringsByFirstCharacter {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList("hello","world","cherry","sexy","dustbin"));
        String str = list.stream().collect(Collectors.groupingBy(s->s.charAt(0))).toString();
        System.out.println(str);

    }
}
