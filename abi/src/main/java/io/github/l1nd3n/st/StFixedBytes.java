package io.github.l1nd3n.st;

import io.github.l1nd3n.Type;

public class StFixedBytes implements Type {
    private final Integer bytes;

    public StFixedBytes(Integer bytes) {
        this.bytes = bytes;
    }

    @Override
    public String view() {
        sizeCheck();
        return String.format("bytes%d", bytes);
    }

    @Override
    public Integer bytes() {
        return bytes;
    }

    private void sizeCheck() {
        if (bytes <= 0 || bytes > 32) {
            throw new IllegalStateException(String.format("Invalid bytes size: %d", bytes));
        }
    }
}
