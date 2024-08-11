package com.example.bootkart.service;

import java.util.*;
import java.util.stream.Stream;

public class sample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,5,4,3,2));
        Stream<Integer> result = list.stream().filter(n->n%2==0);
        result.forEach(n -> System.out.println(n));
        System.out.println("Next...");
        list.forEach(n->System.out.println(n));
    }
}


