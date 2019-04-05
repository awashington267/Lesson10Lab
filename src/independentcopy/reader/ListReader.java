package independentcopy.reader;

import java.util.ArrayList;
import java.util.List;

public class ListReader implements Reader {

    @Override
    public String readln() {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("I'm");
        list.add("writing");
        list.add("things");
        list.add("for");
        list.add("you.");
        return String.valueOf(list);
    }
}
