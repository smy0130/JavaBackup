package com.acorn.study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main01 {

    public static void main(String[] args) {
        // 일반변수 : 데이터타입 변수 = 값
        // 특수변수 : 데이터타입[] 배열명 = new 데이터타입[사이즈]
        //   요소1, 요소2, 요소3.... 요소N
        // 배열명[위치값]
        // 배열명의 문제점 : 저장할 수 있는 데이터 타입이 한 가지 -> 다형성
        //               배열의 사이즈가 고정 -> List, HashMap
        // 리스트: public interface List<E>
        // public class ArrayList<E> implements List: 동적배열
        // E: 객체만
        // String sValue; ArrayList<String> -> 0
        // int, double: ArrayList<int> -> X -> ArrayList<Integer>: Wrapper 클래스
        List<String> objStrList = new ArrayList<String>();
        // System.out.println(objStrList.size());
        objStrList.add("str1");
        // System.out.println(objStrList.size());
        objStrList.add("str2");
        for (int i = 0; i < objStrList.size(); i++) {
            System.out.println(objStrList.get(i));
        }
        // 맵 : public interface Map<K, V>
        // public class HashMap<K,V> implements Map<K,V>
        Map<String, String> objStrMap = new HashMap<String, String>();
        System.out.println(objStrMap.size());

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
        for(int i = 0; i < objStrList2.size(); i++) {
        	for(int j = 1; j <= objStrList2.get(i).size(); j++) {
        		System.out.println(objStrList2.get(i).get(j));
        	}
        }

    }
}
