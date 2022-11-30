package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

    public List<Integer> filterEven(List<Integer> numbers) {
        List<Integer> evenNumber = numbers.stream()
                                            .filter(number -> number % 2 == 0)
                                            .collect(Collectors.toList());

        return evenNumber;
    }

    public List<String> filterEndWithS(List<String> words) {
        List<String> wordEndWithS = words.stream()
                                                .filter(word -> word.endsWith("s"))
                                                .collect(Collectors.toList());

        return wordEndWithS;
    }

    public List<Integer> getCommonElements(List<Integer> numbers, List<Integer> anotherNumbers) {
        List<Integer> commonElements = numbers.stream()
                .filter(number -> anotherNumbers.contains(number))
                .collect(Collectors.toList());
        return commonElements;
    }


}
