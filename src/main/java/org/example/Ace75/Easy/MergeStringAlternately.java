package org.example.Ace75.Easy;
public class MergeStringAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int commonLength = Math.min(word2.length(), word1.length());
        for(int i = 0; i < commonLength; i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        if(word1.length() > word2.length()){
            sb.append(word1.substring(commonLength));
        }
        else if(word2.length() > word1.length()){
            sb.append(word2.substring(commonLength));
        }
        return sb.toString();
    }
}
