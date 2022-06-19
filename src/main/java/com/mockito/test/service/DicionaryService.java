package com.mockito.test.service;

import java.util.HashMap;
import java.util.Map;

public class DicionaryService {

    private Map<String, String> wordsMap;

    public DicionaryService(){
        wordsMap = new HashMap<>();
    }
    public void add(String word, String meaning){
        wordsMap.put(word, meaning);
    }
    public String getMeaning(String word){
        return wordsMap.get(word);
    }
}
