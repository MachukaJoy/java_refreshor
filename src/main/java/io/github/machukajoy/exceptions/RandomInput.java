package io.github.machukajoy.exceptions;

public class RandomInput implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Closing RandomInput");
    }
}