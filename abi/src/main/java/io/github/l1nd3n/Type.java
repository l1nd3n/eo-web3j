package io.github.l1nd3n;

public interface Type {

    String view();
    Integer bytes() throws UncertainSizeException;
}
