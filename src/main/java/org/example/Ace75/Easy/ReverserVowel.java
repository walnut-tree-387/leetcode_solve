package org.example.Ace75.Easy;

public class ReverserVowel {
    char[] rightOrder = new char[300009];
    int cnt = 0;
    public String reverseVowels(String s) {
        for(int i = s.length() - 1; i >= 0; i--){
            if(isVowel(s.charAt(i))){
                rightOrder[cnt] = s.charAt(i);
                cnt++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0, j = 0; i < s.length(); i++){
            if(isVowel(s.charAt(i))){
                sb.append(rightOrder[j]);
                j++;
            }
            else sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public boolean isVowel(char c) {
        return c ==  'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
