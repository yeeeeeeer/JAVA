package main.java.com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application01 {
    public static void main(String[] args) {

        /*
         * 컬렉션 프레임워크
         * 여러 개의 다양한 데이터들을 쉽고 효과적으로 처리하도록
         * 표준화된 방법을 제공하는 클래스들의 집합을 의미.
         * 즉, 데이터를 효율적으로 저장하는 자료구조와 데이터를 처리하는 알고리즘을 미리 구현해놓은 클래스이다.
         * */

        /*
         * Collection Framework 는 크게 3가지 인터페이스 중 한 가지를 상속받아 구현해놓았다.
         * 1. List 인터페이스
         * 2. Set 인터페이스
         * 3. Map 인터페이스
         *
         * List 인터페이스와 Set 인터페이스의 공통 부분을 Collection 인터페이스에서 정의하고 있다.
         * 하지만 Map은 구조상의 차이로 Collection 인터페이스에서 정의하고 있지 않다.
         * */

        /*
         * 각 인터페이스 특징
         * 1. List 인터페이스
         * 순서있는 데이터의 집합으로 데이터 중복 저장을 허용함
         * - Vector, ArrayList, LinkedList, Stack, Queue 등이 있다.
         *
         * 2. Set 인터페이스
         * 순서없는 데이터의 집합으로 데이터 중복 저장을 허용 X
         * - HashSet, TreeSet 등이 있다.
         *
         * 3. Map 인터페이스
         * "키와 값" 한 쌍으로 이루어지는 데이터 집합이다.
         * key 를 Set 방식으로 관리하기때문에 데이터의 순서를 관리하지 않고 중복된 key 를 허용 X
         * value 는 중복된 값 저장 O
         * HashMap, TreeMap, HashTable, Properties 등이 있다.
         *
         * */

        /*
         * List 인터페이스를 구현한 모든 클래스는 요소의 저장 순서가 유지되며, 중복저장을 허용 O
         * ArrayList, LinkedList, Vector, Stack, Queue
         *
         * */

        /*
         * ArrayList
         * 가장 많이 사용되는 컬렉션 클래스다. (JDK 1.2버전부터 제공된다.)
         *
         * 내부적으로 배열을 이용해 요소를 관리 / 인덱스를 이용해 배열 요소를 빠르게 접근 가능하다
         *
         * ArrayList 는 배열의 단점을 보완하기위해 만들어졌다.
         * 배열은 크기를 변경할 수 없고, 요소의 추가, 삭제, 정렬 등이 복잡하다는 단점을 가지고 있다.
         * ArrayList는 그런 단점을 보완하고자
         * 크기변경, 요소의 추가, 삭제, 정렬 기능들을 미리 메소드로 구현해서 제공하고 있다.
         * (자동으로 수행되는 것이지 속도가 빨라지는 것은 아니다)
         * */

        // ArrayList 선언
        ArrayList alist = new ArrayList();

        List list = new ArrayList();    // 이걸로 제일많이 쓰인다.

        Collection clist = new ArrayList();

        // add 는 넣는 순서대로 적용됨
        list.add("apple");
        list.add(123);
        list.add(45.7);
        list.add(new Date());

        System.out.println("list : " + list);     // 오버라이드 되어있음?

        System.out.println("list의 size : " + list.size());    // 들어간 요소들의 길이

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " : " + list.get(i));      // get: 인덱스의 값을 꺼내온다
        }

        // 인덱스 값 중복 가능
        list.add("apple");
        System.out.println("list : " + list);      // 값 중복 신경 안씀. 마지막에 apple 추가됨.

        // 특정 인덱스 값 입력 가능
        // (원하는 인덱스 위치 번호, 인덱스 값)
        list.add(1, "banana");
        System.out.println("list : " + list);    // 원하는 인덱스 위치에 추가한 값이 적용됨.

        // 삭제
        list.remove(2);
        System.out.println("list : " + list);     // 삭제하고싶은 인덱스 위치 번호의 값이 지워짐.
        
        // 수정
        // 인덱스 번호, 
        list.set(1, Boolean.valueOf(true));
        System.out.println("list : " + list);
        
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        // stringList.add(123);   <- <String> 이라 int는 X
        stringList.add("banana");
        stringList.add("orange");
        stringList.add("mango");
        stringList.add("grape");

        System.out.println("stringList : " + stringList);

        // 리스트값 오름차순 정렬시키기
        Collections.sort(stringList);
        System.out.println("stringList : " + stringList);

        // 리스트값 내림차순 정렬시키기(복잡) -> LinkedList 으로 형변환 시키고 해야됨
        stringList = new LinkedList<>(stringList);

        /*
        * Iterator 란?
        * Collection 인터페이스 iterator() 메소드를 이용해서 인스턴스를 생성할 수 있다.
        * 컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기위해 사용한다.
        * 반복자라고 불리우며, 반복문을 통해 목록을 하나씩 꺼내는 방식으로 사용하기 위함이다.
        * 인덱스로 관리되는 컬렉션이 아닌 경우에는 반복문을 이용해서 요소에 하나씩 접근할 수없기 때문에
        * 인덱스를 사용하지않고도 반복문을사용하기 위한 목록을 만들어주는 역할이라고 보면 된다.
        *
        * -> 반복문 못 쓰는곳에서 반복문을 쓰는 것임
        * -> LinkedList에서는 반복문 사용 못하기때문에 지금 사용하려는 것임.
        *
        * hasNext() : 다음 요소를 가지고 있는 경우 true, 없는 경우 false 변환
        * next() : 다음 요소를 반환
        * */

        // 배열? = stringList를 다운캐스팅.descendingIterator()
        Iterator<String> dIter = ((LinkedList<String>) stringList).descendingIterator();    // descendingIterator 는 내림차순 시켜줌

        List<String> descList = new ArrayList<>();
        while(dIter.hasNext()) {
            descList.add(dIter.next());
        }

        System.out.println("descList : " + descList);
    }
}
