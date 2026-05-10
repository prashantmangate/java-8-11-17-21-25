package com.java21.feature.collection;

import java.util.ArrayList;
import java.util.List;

public class SequencedCollections {
    public static void main(String [] args){
        List<String> lst = new ArrayList<>(List.of("A","B","C"));
        lst.addFirst("Alphabets:-");
        lst.addLast("D");
        lst.addLast("E");
        System.out.println(lst.getFirst());
        System.out.println(lst.getLast());

    }
}
