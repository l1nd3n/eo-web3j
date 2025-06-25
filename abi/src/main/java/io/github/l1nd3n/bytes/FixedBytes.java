package io.github.l1nd3n.bytes;

import io.github.l1nd3n.Type;

import java.util.Objects;

public class FixedBytes implements Type {
    private final Integer bytes;

    public FixedBytes(Integer bytes) {
        Objects.requireNonNull(bytes);
        if (bytes <= 0 || bytes > 32) {
            throw new IllegalArgumentException(String.format("Invalid bytes size: %d", bytes));
        }
        this.bytes = bytes;
    }

    @Override
    public String asString() {
        return String.format("bytes%d", bytes);
    }
}
