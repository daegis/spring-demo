package cn.ihna.demo.spring.bootstrap;

import cn.ihna.demo.spring.beans.Cleaner;
import cn.ihna.demo.spring.beans.Student;
import cn.ihna.demo.spring.beans.Teacher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xianyingda@gmail.com
 * @serial
 * @since 2020/8/4 1:37 下午
 */
public class BootstrapFromXml {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("classpath:/beans.xml");
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println("student = " + student);
        Teacher teacher = applicationContext.getBean("teacher", Teacher.class);
        teacher.teach();
        Cleaner cleaner = applicationContext.getBean(Cleaner.class);
        System.out.println(cleaner);
    }
}
