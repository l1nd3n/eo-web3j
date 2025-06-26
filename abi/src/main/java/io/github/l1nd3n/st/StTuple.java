package io.github.l1nd3n.st;

import io.github.l1nd3n.Type;
import io.github.l1nd3n.UncertainSizeException;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StTuple implements Type {
    private final List<Type> fields;

    public StTuple(List<Type> fields) {
        this.fields = fields;
    }

    @Override
    public String view() {
        if (this.fields.isEmpty()) {
            throw new IllegalStateException("Tuple must have at least one field");
        }
        return String.format(
                "(%s)",
                fields.stream().map(Type::view).collect(Collectors.joining(","))
        );
    }

    @Override
    public Integer bytes() throws UncertainSizeException {
        Integer bytes = 0;
        for (Type field : fields) {
            bytes += field.bytes();
        }
        return bytes;
    }
}
