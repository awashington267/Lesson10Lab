package independentcopy.writer;

import java.util.ArrayList;
import java.util.List;

public class ListWriter implements Writer {

    @Override
    public void writeln(String line) {
        List<String> list = new ArrayList<>();
        list.add(line);
        System.out.println("Here is your list below.");
        System.out.println(list);
    }
}
