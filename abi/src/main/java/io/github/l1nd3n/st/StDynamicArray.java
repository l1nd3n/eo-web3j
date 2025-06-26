package io.github.l1nd3n.st;

import io.github.l1nd3n.Type;
import io.github.l1nd3n.UncertainSizeException;

public final class StDynamicArray implements Type {
    private final Integer size;
    private final Type type;

    public StDynamicArray(Integer size, Type type) {
        this.size = size;
        this.type = type;
    }

    @Override
    public String view() {
        if (size <= 0) {
            throw new IllegalStateException("Size must be greater than 0");
        }
        return String.format("%s[%d]",type.view(), size);
    }

    @Override
    public Integer bytes() throws UncertainSizeException {
        throw new UncertainSizeException();
    }
}