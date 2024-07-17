package com.ohgiraffers.section01.xmlmapper;

import com.ohgiraffers.common.CategoryAndMenuDTO;
import com.ohgiraffers.common.MenuAndCategoryDTO;
import com.ohgiraffers.common.MenuDTO;
import com.ohgiraffers.common.Template;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ElementTestService {
    private ElementTestMapper mapper;

    public void selectCacheTest() {

        // Sqlsession : 쿼리 실행, 트랜잭션 관리 등을 하는 인터페이스
        SqlSession sqlSession = Template.getSqlSession();
        mapper = sqlSession.getMapper(ElementTestMapper.class);

        /* 필기. 최초 요청 시에는 시간이 걸리지만 그 이후에는 캐싱된 데이터를 불러오기 때문에 속도가 빠르다. */
        for(int i = 0; i < 10; i++) {
            Long startTime = System.currentTimeMillis(); // 시작시간

            List<String> nameList = mapper.selectCacheTest();
            System.out.println(nameList);

            Long endTime = System.currentTimeMillis();  // 종료시간

            Long interval = endTime - startTime;
            System.out.println("수행 시간 : " + interval + "(ms)");
        }
        sqlSession.close();
    }


    public void selectResultMapTest() {

        SqlSession sqlSession = Template.getSqlSession();
        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<MenuDTO> menuList = mapper.selectResultMapTest();

        for(MenuDTO menu : menuList){
            System.out.println(menu);
        }
        sqlSession.close();
    }


    public void selectResultMapConstructorTest() {

        SqlSession sqlSession = Template.getSqlSession();
        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<MenuDTO> menuList = mapper.selectResultMapConstructorTest();

        for(MenuDTO menu : menuList){
            System.out.println(menu);
        }
        sqlSession.close();
    }


    public void selectResultMapAssociationTest() {

        SqlSession sqlSession = Template.getSqlSession();
        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<MenuAndCategoryDTO> menuList = mapper.selectResultMapAssociationTest();

        for(MenuAndCategoryDTO menu : menuList){
            System.out.println(menu);
        }
        sqlSession.close();
    }


    public void selectResultMapCollectionTest() {

        SqlSession sqlSession = Template.getSqlSession();
        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<CategoryAndMenuDTO> menuList = mapper.selectResultMapCollectionTest();

        for(CategoryAndMenuDTO menu : menuList){
            System.out.println(menu);
        }
        sqlSession.close();
    }


    public void insertMenuTset(MenuDTO menuDTO) {

        SqlSession sqlSession = Template.getSqlSession();
        mapper = sqlSession.getMapper(ElementTestMapper.class);

        // insert의 결과는 int
        int result = mapper.insertMenuTset(menuDTO);

        if(result > 0){
            System.out.println("메뉴 등록 성공!");
            sqlSession.rollback();
        }
        sqlSession.close();

    }

    public void insertCategoryAndMenuTest(MenuAndCategoryDTO menuAndCategoryDTO) {

        SqlSession sqlSession = Template.getSqlSession();
        mapper = sqlSession.getMapper(ElementTestMapper.class);

        int result1 = mapper.insertNewCategory(menuAndCategoryDTO);
        int result2 = mapper.insertNewMenu(menuAndCategoryDTO);

        if(result1 > 0 && result2 > 0){
            System.out.println("신규 카테고리와 메뉴 등록 성공");
            sqlSession.commit();
        }else{
            System.out.println("신규 카테고리와 메뉴 등록 실패");
            sqlSession.rollback();
        }
        sqlSession.close();

    }
}
