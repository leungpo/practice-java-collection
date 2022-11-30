package com.thoughtworks.collection;

import java.util.List;

public class StreamReduce {

    public int getLastOdd(List<Integer> numbers) {

        return numbers.stream().reduce( (lastOdd, number) -> number % 2 == 1? number: lastOdd).get();
    }

    public String getLongest(List<String> words) {
        return words.stream().reduce((longest ,word) -> longest.length() > word.length()? longest: word).get();
    }

    public int getTotalLength(List<String> words) {
        return words.stream().reduce(0,(accumlator, word) -> accumlator + word.length(),Integer::sum);
    }
}
