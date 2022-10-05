package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Set<Integer> lengthList = new HashSet<>();
        Set<String> words = new HashSet<>();
        Map <Integer, Set<String>> result = new HashMap<>();
        for (Map.Entry<String,Integer> e:sourceMap.entrySet()) {
            lengthList.add(e.getKey().length());
        }
        for (int i:lengthList) {
            words.clear();
            for (Map.Entry<String,Integer> e:sourceMap.entrySet()) {
                if (e.getKey().length() == i) {
                    words.add(e.getKey());
                }
            }
            Set<String> over = new HashSet<>();
            over.addAll(words);
            result.put(i,over);



        }
        return result;
    }
}
