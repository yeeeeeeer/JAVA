package main.java.com.ohgiraffers.section01.run;

import main.java.com.ohgiraffers.section01.*;

public class Application02 {
    public static void main(String[] args) {

        /*
         * 와일드 카드
         * 제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 때,
         * 그 객체의 타입 변수를 제한할 수 있다.
         * <?> : 제한 없음
         * <? extends Type> : 와일드카드 상한 제한 (Type과 Type의 후손을 이용해 생성한 인스턴스만 가능)
         * <? super Type> : 와일드카드 하한 제한 (Type과 Type의 부모를 이용해 생선한 인스턴스만 인자로 사용 가능)
         * */

        WildCardFarm wildcardFarm = new WildCardFarm();

        // 농장 생성 자체가 불가능한 경우 매개변수로 사용할 수 없다
        // wildcardFarm.anyType(new RabbitFarm<Mammal>());
        // wildcardFarm.anyType(new RabbitFarm<Reptile>());

        wildcardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildcardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
        wildcardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        // extends
        // wildcardFarm.extendsType(new RabbitFarm<>(new Rabbit()));
        wildcardFarm.extendsType(new RabbitFarm<>(new Bunny()));
        wildcardFarm.extendsType(new RabbitFarm<>(new DrunkenBunny()));

        // super
        wildcardFarm.superType(new RabbitFarm<>(new Rabbit()));   // 부모
        wildcardFarm.superType(new RabbitFarm<>(new Bunny()));   // 자기자신
        // wildcardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));   // 자식? -> 에러발생



    }
}