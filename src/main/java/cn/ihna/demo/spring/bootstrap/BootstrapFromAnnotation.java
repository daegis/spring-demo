package cn.ihna.demo.spring.bootstrap;

import cn.ihna.demo.spring.beans.Student;
import cn.ihna.demo.spring.beans.Teacher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author xianyingda@gmail.com
 * @serial
 * @since 2020/8/4 1:37 下午
 */
@ComponentScan("cn.ihna.demo.spring")
public class BootstrapFromAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(BootstrapFromAnnotation.class);
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println("student = " + student);
        Teacher teacher = applicationContext.getBean("teacher", Teacher.class);
        teacher.teach();
    }
}
