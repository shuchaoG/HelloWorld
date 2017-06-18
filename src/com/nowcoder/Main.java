package com.nowcoder;

import java.util.*;


/**
 * Created by Administrator on 2017/6/17.
 */
public class Main {

    public static void print(int index,Object obj){
        System.out.println(String.format("{%d},%s",index,obj.toString()));
    }


    public static void main(String[] arges){
        System.out.println("hello coder");
        String str="hello coder";
        for (char c:str.toCharArray()){
           print(1,c);
        }
        String str1="hello";
        str1.substring(0,str.indexOf('o'));

        List<String> strlist=new ArrayList<String>();
        for(int i=0;i<4;i++)
            strlist.add(String.valueOf(i*i));
        print(2,strlist);

        Collections.sort(strlist);
        Collections.sort(strlist, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        print(3,strlist);
    }
}
