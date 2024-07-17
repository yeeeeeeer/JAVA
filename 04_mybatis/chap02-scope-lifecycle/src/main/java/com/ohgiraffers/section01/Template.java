package com.ohgiraffers.section01;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Template {

    /*
     * SqlSessionFactory 는 애플리케이션이 실행하는 동안 존재한다.
     * 애플리케이션이 실행되는동안 여러차례 SqlsessionFactory 를 다시 빌드하지 않는것이 가장 좋은 형태이다.
     * 애플리케이션 스코프로 관리하기 위한 가장 간단한 방법은 싱글톤 패턴(한번 생성으로 여러번 돌려씀) 을 이용하는 것이다.
     * */

    private static SqlSessionFactory sqlSessionFactory;

    public static SqlSession getSqlSession() {

        /*
         * SqlSessionFactoryBuilder 는 SqlSessionFactory 를 생성한 후 유지할 필요가 X
         * 따라서 메소드 스코프를 생명주기를 관리하여 스코프가 종료된 이후 GC(가비지 컬렉터)가 회수할 수 있도록 하는 것이다.
         * 여러 개의 SqlSessionFactory 를 빌드하기 위해 재사용할 수 있지만 여러 개 생성하지 않는것이 권장사항,
         * SqlSessionFactoryBuilder 는 필요시에만 메소드 레벨에서 잠시 호출하는 것이 바람직하다
         * */

        if (sqlSessionFactory == null) {
            String resource = "mybatis-config.xml";

            // xml 파일로 리소스팩토리 만들기?
            try {
                InputStream inputStream = Resources.getResourceAsStream(resource);
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /*
        * SqlSession 은 공유되지않아야하므로 요청 시마다 생성해야 한다.
        * 요청 시 생성하고 요청이 완료되면 close 하는 HTTP 요청과 유사한 스코프에 두는 것이 가장 올바른 방법이다.
        *
        * openSession() : SqlSession 인터페이스 타입의 객체를 반환하는 메소드로 boolean 타입을 인자로 전달.
        * SqlSessionFactory 는 하나만 만들어둔 후 계속 사용하지만 그에 반환되는 SqlSession 은
        * 호출 시마다 새롭게 만들어 리턴해준다.
        * */

        System.out.println("sqlSessionFactory의 hashCode() : " + sqlSessionFactory.hashCode());

        return sqlSessionFactory.openSession(false);
    }
}
