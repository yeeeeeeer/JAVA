package main.java.com.ohgiraffers.section02.uses;

// 전달받을 "멤버의 정보" 를 담을 클래스 -> DTO 클래스 임
public class Member {

    // 필드 작성
    private int num;

    private String id;

    private String pwd;

    private String name;

    private int age;

    private char gender;

    // 알트인서트 - 셀렉트 논 <- 기본생성자
    public Member() {
    }

    // 알트인서트 - 셀렉트 모두 다하기 <- 매개변수 받는 생성자
    public Member(int num, String id, String pwd, String name, int age, char gender) {
        this.num = num;
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // 알트인서트 - 게터세터 모두선택 오케이
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getInfo() {
        return "Member{" + "num : " + num + " id = " + id + ", pwd = " + pwd + ", name = " + name + ", age = " + age + ", gender = " + gender + "}";

    }
}
