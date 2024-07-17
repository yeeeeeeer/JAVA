package main.java.com.ohgiraffers.question;

public class User {

    // 필드 작성  회원 id, pwd, name
    private String id;

    private int pwd;

    private int pwd2;

    private String name;

    // 기본생성자
    public User() {
    }

    // 매개변수 받는 생성자
    public User(String id, int pwd, String name) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
    }

    // 로그인할때
    public User(String id,int pwd) {
        this.id = id;
        this.pwd = pwd;
    }

    // 게터세터
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPwd() {
        return pwd;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 회원정보 리턴하는 메소드
    public String getInfo() {
        return "Member { " + "id = " + id + ", pwd = " + pwd + ", name = " + name + " }";
    }
}
