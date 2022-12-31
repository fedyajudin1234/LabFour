package org.example;

public interface ObjectBuilder{
    String typeName();
    Object create();
    String toString(Object value);
}

