package io.github.l1nd3n.signature;

import io.github.l1nd3n.Type;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public final class Signature implements Type {
    private final String name;
    private final List<Type> arguments;

    public Signature(String name, List<Type> arguments) {
        this.name = Objects.requireNonNull(name);
        if (this.name.isEmpty()) {
            throw new IllegalArgumentException("Function name cannot be empty string");
        }
        this.arguments = Collections.unmodifiableList(new LinkedList<>(arguments));
    }

    public String asString() {
        return String.format(
                "%s(%s)",
                name,
                arguments.stream().map(Type::asString).collect(Collectors.joining(","))
        );
    }
}
