package main.java.com.ohgiraffers.section03.copy;

public class Application01 {
    public static void main(String[] args) {

        /*
         * 배열의 복사 - 두 가지 종류
         * 1. 얕은 복사(shadow copy) : stack 의 주소값만 복사
         * 2. 깊은 복사(deep copy) :  heap의 배열에 저장된 값을 복사
         *
         * 많이 쓰진않지만 면접에서 자주 물어본다
         * */

        /*
         * 얕은 복사는 stack에 저장되어 있는 배열의 "주소값만 복사"한다.
         * 따라서 두 개의 변수는 "동일한 주소값"을 가진다.
         * 하나의 변수에 저장된 주소값을 가지고 배열의 내용을 수정하게되면,
         * 다른 배열에 접근했을때도 동일한 배열을 가리키고 있으므로 변경된 값이 반영되어있다.
         * */

        int[] originArr = {1, 2, 3, 4, 5};
        int[] copyArr = originArr;  // copyArr에 originArr 을 넣음  <- 동일한 주소값을 가짐

        System.out.println(originArr.hashCode());  // 주소값 보는 것 hashCode
        System.out.println(copyArr.hashCode());

        for(int x : originArr){     // originArr의 값들이 x에 하나씩 대입되서 나타남
            System.out.println(x);
        }
        for(int x : copyArr){
            System.out.println(x);
        }

        copyArr[0]=99;   // copy의 값을 변경해보았다. -> originArr 과 copyArr은 같은 주소값을 가져서 둘다 값이 변경되었다.
        for(int x : originArr){
            System.out.println(x);
        }
        for(int x : copyArr){
            System.out.println(x);
        }


    }


}
