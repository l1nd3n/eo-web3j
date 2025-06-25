package io.github.l1nd3n.array;

import io.github.l1nd3n.Type;

import java.util.Objects;

public final class DynamicArray implements Type {
    private final Type type;

    public DynamicArray(Type type) {
        this.type = Objects.requireNonNull(type, "Array element type cannot be null");
    }

    @Override
    public String asString() {
        return String.format("%s[]",type.asString());
    }
}
