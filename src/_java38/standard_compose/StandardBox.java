package _java38.standard_compose;

import java.util.List;
import java.util.StringJoiner;

public class StandardBox {
    List<String> strings;

    public StandardBox(List<String> strings) {
        this.strings = strings;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", StandardBox.class.getSimpleName() + "[", "]")
                .add("strings=" + strings)
                .toString();
    }
}
