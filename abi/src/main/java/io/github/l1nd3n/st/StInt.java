package io.github.l1nd3n.st;

import io.github.l1nd3n.Type;

public class StInt implements Type {
    private final Integer bits;

    public StInt(Integer bits) {
        this.bits = bits;
    }

    @Override
    public String view() {
        sizeCheck();
        return String.format("int%d", bits);
    }

    @Override
    public Integer bytes() {
        sizeCheck();
        return bits / Byte.SIZE;
    }

    private void sizeCheck() {
        if (bits <= 0 || bits > 256 || bits % 8 != 0) {
            throw new IllegalStateException(String.format("Invalid int bit size: %d", bits));
        }
    }
}
