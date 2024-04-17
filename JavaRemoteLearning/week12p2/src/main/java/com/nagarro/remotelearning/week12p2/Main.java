package com.nagarro.remotelearning.week12p2;

import com.nagarro.remotelearning.week12p2.util.StreamZipper;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 3, 5, 7);
        Stream<Integer> stream2 = Stream.of(2, 4, 6);

        Stream<Integer> zippedStream = StreamZipper.zip(stream1, stream2);
        zippedStream.forEach(System.out::println);
    }
}

