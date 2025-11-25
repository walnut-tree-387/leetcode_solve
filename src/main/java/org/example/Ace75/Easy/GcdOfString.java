package org.example.Ace75.Easy;

import java.util.ArrayList;
import java.util.List;

public class GcdOfString {
    public String gcdOfStrings(String str1, String str2) {
        if(str1.length() < str2.length()){
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }
        String ans = "";
        StringBuilder temp;
        List<Integer> divisors = findAllDivisors(str2.length());

        for(Integer divisor : divisors){
            temp =  new StringBuilder(str2.substring(0, divisor));
            if(isValidGcd(str1, temp.toString()) && isValidGcd(str2, temp.toString())){
                ans = temp.toString();
                break;
            }
        }
        return ans;
    }
    public List<Integer> findAllDivisors(Integer length){
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(length); i++) {
            if(length % i == 0){
                if(i == length / i)divisors.add(i);
                else {
                    divisors.add(length/ i);
                    divisors.add(i);
                }
            }
        }
        return divisors.stream().sorted((a, b) -> b - a).toList();
    }
    public boolean isValidGcd(String str2, String str1) {
        if(str2.length() % str1.length() != 0)return false;
        String temp = "";
        for(int i = 0; i < str2.length(); i += str1.length()) {
            if(i + str1.length() > str2.length()) break;
            temp = str2.substring(i, i + str1.length());
            if(!temp.equals(str1)) return false;
        }
        return true;
    }
}