package io.github.l1nd3n.st;

import io.github.l1nd3n.Type;
import io.github.l1nd3n.UncertainSizeException;

public class StDynamicBytes implements Type {

    @Override
    public String view() {
        return "bytes";
    }

    @Override
    public Integer bytes() throws UncertainSizeException {
        throw new UncertainSizeException();
    }
}
