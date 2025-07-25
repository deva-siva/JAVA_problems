package deva.java;

import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int max=0;
        for(int i=0;i<s.length();i++){
            String sub="";
            for(int j=i;j<s.length();j++){
                sub+=s.charAt(j);
                if(palin(sub))
                max=Math.max(max,sub.length());
            }
        }
        System.out.print(max);
    }
    public static boolean palin(String s){
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
        if(s.equals(res))
        return true;
        return false;
    }
}