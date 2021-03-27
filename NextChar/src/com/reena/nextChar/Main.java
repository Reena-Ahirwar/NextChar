package com.reena.nextChar;

public class Main {

    //123 abcd *3
    //123 zzZZ *3



    public static String nextChar(String str){
        if(str.isEmpty() || str == null){
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if( (ch >= 'a' &&  ch <= 'z') || (ch >= 'A' && ch  <= 'Z')){
                if( ch == 'z'){
                    stringBuilder.append('a');
                } else if (ch == 'Z'){
                    stringBuilder.append('A');
                } else {
                    stringBuilder.append(++ch);
                }
            } else {
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(nextChar("123 zzZZ *3"));
    }
}
