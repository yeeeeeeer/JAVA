package main.java.com.ohgiraffers.section03.map.run;

import java.util.*;

public class Application01 {
    public static <Iterator> void main(String[] args) {

        /*
         * Map 인터페이스의 특징
         * Collection 인터페이스와는 다른 저장 방식을 가진다.
         * 키와 값을 하나의 쌍으로 저장하는 방식을 사용한다.
         *
         * 키(Key)란?
         * 값을 찾기 위한 이름 역할을 하는 객체를 의미한다.
         * 1. 요소의 저장 순서를 유지 X
         * 2. 키는 중복을 허용 X,  키가 다르면 중복되는 값 저장 O
         *
         * HashMap, HashTable, TreeMap 등의 대표적인 클래스가 있다.
         * HashMap 이 가장 많이 사용. HashTable 은 jdk 1.0 부터 제공되며
         * HashMap 과 동일하게 작동된다. 하위호환을 위해 남겨놓았기 때문에
         * 가급적이면 HashMap을 사용하는 것이 좋다.
         * */

        /*
         * HashMap
         * jdk 1.2 부터 제공되는 클래스로 해쉬 알고리즘을 사용하여 검색 속도가 매우 빠르다.
         * */

        HashMap hmap = new HashMap();    // 여러 자료형 넣기 가능

        hmap.put("one", new Date());
        hmap.put(12, "red apple");
        hmap.put(33, 123);

        System.out.println(hmap);

        hmap.put(12, "yellow");     // (12, "red apple") 과 중복되면 뒤에껄로 덮어씌워짐 -> 키 중복 X
        System.out.println(hmap);

        hmap.put(11, "yellow banana");
        hmap.put(9, "yellow banana");    // 값은 중복 가능
        System.out.println(hmap);

        // get(Key) <- key 로 값 불러오기
        System.out.println(hmap.get(9));

        // 키로 값 삭제
        hmap.remove(9);
        System.out.println(hmap);

        // 요소 사이즈 확인
        System.out.println(hmap.size());

        // <타입> 지정
        HashMap<String, String> hmap2 = new HashMap<>();

        hmap2.put("one", "java 8");
        hmap2.put("two", "oracle");
        hmap2.put("three", "jdbc");
        hmap2.put("four", "html5");
        hmap2.put("five", "css 3");
        System.out.println(hmap2);

        // iterator (반복문 사용 못할때 사용하는 용어)
        java.util.Iterator<String> keyIter = hmap2.keySet().iterator();

        while (keyIter.hasNext()) {
            String key = keyIter.next();
            String value = hmap2.get(key);
            System.out.println(key + "=" + value);
        }

        // value 객체들만 values() 메소드로 Collection 으로 만듦.
        Collection<String> values = hmap2.values();

        // 받은 내용물 반복문으로 확인해보기
        // 1. Iterator()
        java.util.Iterator<String> valueIter = values.iterator();
        while (valueIter.hasNext()) {
            System.out.println(valueIter.next());
        }

        // 2. 배열로 처리
        Object[] valueArr = values.toArray();
        for (int i = 0; i < valueArr.length; i++) {
            System.out.println(i + "=" + valueArr[i]);
        }

        // 3. Map 의 내부 클래스인 EntrySet 이용
        // Entry 는 키와값 한쌍으로 묶은 것
        Set<Map.Entry<String, String>> set = hmap2.entrySet();
        java.util.Iterator<Map.Entry<String,String>> entryIterator = set.iterator();
        while(entryIterator.hasNext()) {
            Map.Entry<String,String> entry = entryIterator.next();
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

    }
}
