package io.github.l1nd3n.st;

import io.github.l1nd3n.Type;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StTuple implements Type {
    private final List<Type> fields;

    public StTuple(List<Type> fields) {
        this.fields = Collections.unmodifiableList(new LinkedList<>(fields));
        this.fields.forEach(Objects::requireNonNull);
    }

    @Override
    public String type() {
        if (this.fields.isEmpty()) {
            throw new IllegalStateException("Tuple must have at least one field");
        }
        return String.format(
                "(%s)",
                fields.stream().map(Type::type).collect(Collectors.joining(","))
        );
    }
}
