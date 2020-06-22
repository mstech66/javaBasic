package com.company;

import java.util.*;

class DS {
    public static void main(String[] args) {
        System.out.println("Enter String ~ ");
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        String lowercased = inputStr.toLowerCase().trim();
        String[] words = lowercased.split("[^a-zA-Z]+");
        String[] ignoreWords = {"ah", "need", "yeah", "the", "a", "or", "an", "it", "and", "but", "is", "are", "of", "on", "to", "was", "were", "in", "that", "i", "your", "his", "their", "her", "you", "me", "all"};
        List<String> commonWords = Arrays.asList(ignoreWords);
        HashMap<String, Integer> wordsMap = new HashMap<>();
        for (String word : words) {
            if (wordsMap.containsKey(word) && !commonWords.contains(word)) {
                wordsMap.put(word, wordsMap.get(word) + 1);
            } else {
                if (!commonWords.contains(word))
                    wordsMap.put(word, 0);
            }
        }
        System.out.println("Hashmap is ~ " + wordsMap);
        int maxLength = 0;
        String maxKey = "";

        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (maxLength < entry.getValue()) {
                maxLength = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        System.out.println("Key with max occurrence is " + maxKey + " with score of " + maxLength);
    }
}