package _java38.standard_compose;

import java.io.Serializable;
import java.util.StringJoiner;

public class StandardCat implements Serializable {

    static final long serialVersionUID = 1L;

    static String staticField = "Static";
    final String name;
     StandardBox box;

    @Override
    public String toString() {
        return new StringJoiner(", ", StandardCat.class.getSimpleName() + "[", "]")
                .add("static='" + staticField + "'")
                .add("box=" + box)
                .toString();
    }

    public StandardCat(String name, StandardBox box) {
        this.name = name;
        this.box = box;

    }
}
///••• • •−• −•−− •−•− •−•• −−•• •− −•−• −•−− •−•− ••• −•− •−•• •− −•• •− −• •− −−• •− •− −••• •−−−−• • −•− − •− −−•• ••• − •− − −•−− −−−• −• −•−− −− •−−• •− •−•• •−•− −−
