package com.jf.algorithms.string;

import com.jf.utils.CheckUtils;

public final class ReverseWords {

    public static String reverse(String input, Character separator) {
        CheckUtils.isNull(input, "input");
        CheckUtils.isNull(separator, "separator");
        char[] result = new char[input.length()];
        int current=0;
        int start=input.length()-1;
        int end=input.length()-1;
        for(int i = input.length()-1; i >= 0; i--) {
            if(input.charAt(i)==separator){
                for(int x=start;x<=end;x++){
                    result[current]=input.charAt(x);
                    current++;
                }
                result[current]=separator;
                current++;
                start=i-1;
                end=i-1;
            }
            else {
                start=i;
            }
        }
        for(int x=start;x<=end;x++){
            result[current]=input.charAt(x);
            current++;
        }
        return new String(result);
    }
}
