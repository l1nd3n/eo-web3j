package io.github.l1nd3n.st;

import io.github.l1nd3n.Type;

public final class StAddress implements Type {
    private final static Integer DEFAULT_SIZE = 20;

    @Override
    public String view() {
        return "address";
    }

    @Override
    public Integer bytes() {
        return DEFAULT_SIZE;
    }
}
