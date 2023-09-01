package com.acorn.study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main01 {

    public static void main(String[] args) {
        List<String> objStrList = new ArrayList<String>();
        objStrList.add("str1");
        objStrList.add("str2");
        for (int i = 0; i < objStrList.size(); i++) {
            System.out.println(objStrList.get(i));
        }

        Map<String, String> objStrMap = new HashMap<String, String>();
        objStrMap.put("서울", "홍길동");
        objStrMap.put("대전", "허균");
        System.out.println(objStrMap.get("서울"));

        List<Map<Integer, String>> objStrList2 = new ArrayList<Map<Integer, String>>();
        Map<Integer, String> objStrMap2 = new HashMap<Integer, String>();
        Map<Integer, String> objStrMap3 = new HashMap<Integer, String>();
        objStrMap2.put(1, "홍길동");
        objStrMap2.put(2, "홍길동2");
        objStrMap2.put(3, "홍길동3");
        objStrMap3.put(1, "허균");
        objStrMap3.put(2, "허균2");
        objStrMap3.put(3, "허균3");
        objStrList2.add(objStrMap2);
        objStrList2.add(objStrMap3);

        for (int i = 0; i < objStrList2.size(); i++) {
            Map<Integer, String> tempHash = objStrList2.get(i);
            for (int j = 1; j <= tempHash.size(); j++) {
                System.out.println(tempHash.get(j));
            }
        }
    }
}
