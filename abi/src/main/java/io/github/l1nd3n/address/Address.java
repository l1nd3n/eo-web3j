package io.github.l1nd3n.address;

import io.github.l1nd3n.Type;

public abstract class Address implements Type {

    @Override
    public String asString() {
        return "address";
    }
}
