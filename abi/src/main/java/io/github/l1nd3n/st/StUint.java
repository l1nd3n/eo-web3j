package io.github.l1nd3n.st;

import io.github.l1nd3n.Type;

import java.util.Objects;

public final class StUint implements Type {
    private final Integer bits;

    public StUint(Integer bits) {
        this.bits = bits;
    }

    @Override
    public String view() {
        if (bits <= 0 || bits > 256 || bits % 8 != 0) {
            throw new IllegalStateException(String.format("Invalid uint bit size: %d", bits));
        }
        return String.format("uint%d", bits);
    }
}
