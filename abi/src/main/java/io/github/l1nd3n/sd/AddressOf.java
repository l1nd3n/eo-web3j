package io.github.l1nd3n.sd;

import io.github.l1nd3n.Data;
import io.github.l1nd3n.Type;
import io.github.l1nd3n.st.StAddress;

public final class AddressOf implements Data<String> {
    private final Type type = new StAddress();
    private final String value;

    public AddressOf(String value) {
        this.value = value;
    }

    @Override
    public Type type() {
        return type;
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public String presentation() {
        return "";
    }

    @Override
    public String encoded() {
        return "";
    }
}
