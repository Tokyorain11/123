package all.springConfig;


import all.domain.student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "all.domain")
@PropertySource(value = "classpath:tiger.properties")
public class springConfig {

    @Bean(name = "zhangsan")
    public student addStu(){

        student student = new student();
        student.setId(1);
        student.setName("zhangsan");
        student.setAge(15);

        return student;

    }


}
