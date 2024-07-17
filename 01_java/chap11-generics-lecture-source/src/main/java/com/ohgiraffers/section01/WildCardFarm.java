package main.java.com.ohgiraffers.section01;

public class WildCardFarm {

    // <?> : RabbitFarm의 어떤 것도 다 들어올수있다는 뜻
    public void anyType(RabbitFarm<?> farm){
        farm.getAnimal().cry();
    }

    // 자기자신과 자식
    public void extendsType(RabbitFarm<? extends Bunny> farm){
        farm.getAnimal().cry();
    }

    // 자기자신과 부모
    public void superType(RabbitFarm<? super Bunny> farm){
        farm.getAnimal().cry();
    }


}
