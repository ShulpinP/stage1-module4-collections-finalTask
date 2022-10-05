package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();
        Comparator<String> stringComparator = new StringLengthSort();
        for (Map.Entry<String, Set<String>> e:projects.entrySet()) {
            for (String str: e.getValue()) {
                if (str.equals(developer)) {
                    result.add(e.getKey());
                }
            }
        }
        Collections.sort(result,stringComparator);
        return result;
    }
}
class StringLengthSort implements Comparator<String>{
    @Override
    public int compare(String str1, String str2) {
        if(str1.length() < str2.length()){
            return 1;
        }else{
            if(str1.length() > str2.length()){
                return -1;
            }else{
                return 0;
            }
        }
    }
}
