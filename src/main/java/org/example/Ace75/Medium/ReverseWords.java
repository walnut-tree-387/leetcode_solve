package org.example.Ace75.Medium;

import java.util.Arrays;

public class ReverseWords {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");  // Trim out empty spaces, only words remains.
        StringBuilder sb = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--) {
           sb.append(words[i]);
           if(i > 0)sb.append(" ");
        }
        return sb.toString();
    }
}
