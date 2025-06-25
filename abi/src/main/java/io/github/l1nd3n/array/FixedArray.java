package io.github.l1nd3n.array;

import io.github.l1nd3n.Type;

import java.util.Objects;

public final class FixedArray implements Type {
    private final Integer size;
    private final Type type;

    public FixedArray(Integer size, Type type) {
        this.size = Objects.requireNonNull(size);
        if (this.size <= 0) {
            throw new IllegalArgumentException("Array size must be greater than zero");
        }
        this.type = Objects.requireNonNull(type, "Array element type cannot be null");
    }

    @Override
    public String asString() {
        return String.format("%s[%d]",type.asString(), size);
    }
}
