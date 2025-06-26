package io.github.l1nd3n.st;

import io.github.l1nd3n.Type;
import io.github.l1nd3n.UncertainSizeException;

public class StFixedArray implements Type {
    private final Type type;
    private final Integer size;

    public StFixedArray(Type type, Integer size) {
        this.type = type;
        this.size = size;
    }

    @Override
    public String view() {
        return String.format("%s[%d]",type.view(), size);
    }

    @Override
    public Integer bytes() throws UncertainSizeException {
        return type.bytes() * size;
    }
}
