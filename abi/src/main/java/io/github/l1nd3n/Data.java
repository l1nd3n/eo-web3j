package io.github.l1nd3n;

public interface Data<T> {
    Type type();
    T value();
    String presentation();
    String encoded();
}
