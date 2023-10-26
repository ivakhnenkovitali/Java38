package _java38.stand;

import java.io.Serializable;
import java.util.StringJoiner;

public class Child extends Parent implements Serializable {
    int childField;

    @Override
    public String toString() {
        return new StringJoiner(", ", Child.class.getSimpleName() + "[", "]")
                .add("childField=" + childField)
                .add("parentField=" + parentField)
                .toString();
    }

    public Child(int childField) {
        System.out.println("Child constructor");
        this.childField = childField;

    }

}
