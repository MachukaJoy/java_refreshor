package io.github.machukajoy.lambda;

@FunctionalInterface
public interface Printer {
    String print(String content, String path);
}
