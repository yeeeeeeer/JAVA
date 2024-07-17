package main.com.java.ohgiraffers.under_a.dto;

public class MemberDTO {

    // id, pwd
    private String id;
    private String pwd;

    // 기본생성자
    public MemberDTO() {
    }

    // 전체생성자
    public MemberDTO(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
    }

    // get. set
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
}
