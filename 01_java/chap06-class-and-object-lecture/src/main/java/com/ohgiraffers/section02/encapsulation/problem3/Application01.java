package main.java.com.ohgiraffers.section02.encapsulation.problem3;

public class Application01 {
    public static void main(String[] args) {

        // 몬스터 객체를 여러개 생성한다.

        Monster monster1 = new Monster();
        monster1.setInfo("드라큘라");
        monster1.setHp(100);

        Monster monster2 = new Monster();
        monster2.setInfo("슈렉");
        monster2.setHp(200);

        Monster monster3 = new Monster();
        monster3.setInfo("늑대인간");
        monster3.setHp(300);

        System.out.println(monster1.getInfo());
        System.out.println(monster2.getInfo());
        System.out.println(monster3.getInfo());

        // 아직까지 필드에 직접접근하는게 정상작동된다. - problem4 에서 막아볼 예정?
        Monster monster4 = new Monster();
        monster4.kinds = "두치";
        monster4.hp= -500;

    }
}
