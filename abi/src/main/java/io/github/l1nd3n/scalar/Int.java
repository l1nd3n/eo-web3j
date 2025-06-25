package io.github.l1nd3n.scalar;

import io.github.l1nd3n.Type;

import java.util.Objects;

public class Int implements Type {
    private final Integer bits;

    public Int(Integer bits) {
        Objects.requireNonNull(bits);
        if (bits <= 0 || bits > 256 || bits % 8 != 0) {
            throw new IllegalArgumentException(String.format("Invalid int bit size: %d", bits));
        }
        this.bits = bits;
    }

    @Override
    public String asString() {
        return String.format("int%d", bits);
    }
}
