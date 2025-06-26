package io.github.l1nd3n.sf;

import io.github.l1nd3n.Function;
import io.github.l1nd3n.Type;
import org.cactoos.list.Immutable;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class SfFunction implements Function {
    private final String name;
    private final List<Type> inputs;
    private final List<Type> outputs;

    public SfFunction(String name, List<Type> inputs, List<Type> outputs) {
        this.name = name;
        this.inputs = inputs;
        this.outputs = outputs;
    }

    @Override
    public List<Type> inputs() {
        return new Immutable<Type>(inputs);
    }

    @Override
    public List<Type> outputs() {
        return new Immutable<Type>(outputs);
    }

    @Override
    public String signature() {
        nameCheck();
        return String.format("%s(%s)", name, listing(inputs));
    }

    @Override
    public String presentation() {
        if (outputs.isEmpty()) {
            return signature();
        }
        return String.format("%s returns(%s)", signature(), listing(outputs));
    }

    private String listing(List<Type> types) {
        return types.stream().map(Type::view).collect(Collectors.joining(","));
    }

    private void nameCheck() {
        if (this.name.isEmpty()) {
            throw new IllegalStateException("Function name cannot be empty string");
        }
    }
}
