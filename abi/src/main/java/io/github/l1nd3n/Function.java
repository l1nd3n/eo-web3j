package io.github.l1nd3n;

import java.util.List;

public interface Function {

    List<Type> inputs();

    List<Type> outputs();

    String signature();

    String presentation();
}
