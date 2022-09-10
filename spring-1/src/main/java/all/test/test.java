package all.test;

import all.domain.student;
import all.domain.tiger;
import all.springConfig.springConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;

public class test {

    @Test
    public void test(){

        ApplicationContext ctx=new AnnotationConfigApplicationContext(springConfig.class);

        student addStu = (student) ctx.getBean("zhangsan");

        System.out.println(addStu);

    }


    @Test
    public void test2(){

        ApplicationContext ctx=new AnnotationConfigApplicationContext(springConfig.class);

        tiger addStu = (tiger) ctx.getBean("tiger");

        System.out.println(addStu);

    }

}
