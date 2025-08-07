package com.multi.object.collection;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ArrayListDemo1 extends AbsttactListDemo implements List {

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return List.of();
    }

    @Override
    public Object[] toArray(IntFunction generator) {
        return super.toArray(generator);
    }

    @Override
    public boolean removeIf(Predicate filter) {
        return super.removeIf(filter);
    }

    @Override
    public Stream stream() {
        return super.stream();
    }

    @Override
    public Stream parallelStream() {
        return super.parallelStream();
    }

    @Override
    public void forEach(Consumer action) {
        super.forEach(action);
    }
}
