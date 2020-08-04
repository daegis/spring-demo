package cn.ihna.demo.spring.config;

import cn.ihna.demo.spring.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xianyingda@gmail.com
 * @serial
 * @since 2020/8/4 2:00 下午
 */
@Configuration
public class AnnotationConfig {

    @Bean
    public Student student() {
        Student student = new Student();
        student.setAge(20);
        student.setName("lxx");
        return student;
    }
}
