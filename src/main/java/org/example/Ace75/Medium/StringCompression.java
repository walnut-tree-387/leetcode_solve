package org.example.Ace75.Medium;

public class StringCompression {
    // Expected output - Modify the existing array with result string and return result string length
    public int compress(char[] chars) {
        int length = 0;
        StringBuilder rs = new StringBuilder();
        char current = chars[0];
        int tempLength = 1;
        for (int i = 1; i < chars.length; i++) {
            if(current == chars[i]) tempLength++;
            else{
                String grpString = getDigitCount(tempLength);
                if(grpString.equals("1")){
                    grpString = "" + current;
                }
                else grpString = current + grpString;
                rs.append(grpString);
                length += grpString.length();
                current = chars[i];
                tempLength = 1;
            }
        }
        String grpString = getDigitCount(tempLength);
        if(grpString.equals("1")){
            grpString = "" + current;
        }
        else grpString = current + grpString;
        rs.append(grpString);
        length = length + grpString.length();
        int srtIdx = 0;
        for(char c : rs.toString().toCharArray()){
            chars[srtIdx] = c;
            srtIdx++;
        }
        return length;
    }
    public String getDigitCount(int num) {
        StringBuilder sb = new StringBuilder();
        for(int i = num; i > 0;){
            sb.append((char) ('0' + i % 10));
            i = i / 10;
        }
        return sb.reverse().toString();
    }
}
