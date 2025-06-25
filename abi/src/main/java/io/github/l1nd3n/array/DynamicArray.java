package io.github.l1nd3n.array;

import io.github.l1nd3n.Type;

import java.util.Objects;

public final class DynamicArray<T extends Type> implements Type {
    private final Type type;

    public DynamicArray(T type) {
        this.type = Objects.requireNonNull(type, "Array element type cannot be null");
    }

    @Override
    public String asString() {
        return String.format("%s[]",type.asString());
    }
}
