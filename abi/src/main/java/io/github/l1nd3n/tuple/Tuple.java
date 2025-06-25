package io.github.l1nd3n.tuple;

import io.github.l1nd3n.Type;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Tuple implements Type {
    private final List<Type> fields;

    public Tuple(List<Type> fields) {
        this.fields = Collections.unmodifiableList(new LinkedList<>(fields));
        if (this.fields.isEmpty()) {
            throw new IllegalStateException("Tuple must have at least one field");
        }
        this.fields.forEach(Objects::requireNonNull);
    }

    @Override
    public String asString() {
        return String.format(
                "(%s)",
                fields.stream().map(Type::asString).collect(Collectors.joining(","))
        );
    }
}
