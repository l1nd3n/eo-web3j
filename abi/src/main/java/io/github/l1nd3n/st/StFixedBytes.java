package io.github.l1nd3n.st;

import io.github.l1nd3n.Type;

public class StFixedBytes implements Type {
    private final Integer bytes;

    public StFixedBytes(Integer bytes) {
        this.bytes = bytes;
    }

    @Override
    public String view() {
        if (bytes <= 0 || bytes > 32) {
            throw new IllegalStateException(String.format("Invalid bytes size: %d", bytes));
        }
        return String.format("bytes%d", bytes);
    }
}
