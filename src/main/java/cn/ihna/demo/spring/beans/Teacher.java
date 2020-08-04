package cn.ihna.demo.spring.beans;

import cn.ihna.demo.spring.aop.TestAop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author xianyingda@gmail.com
 * @serial
 * @since 2020/8/4 1:39 下午
 */
@Component
public class Teacher implements Teach {

    @PostConstruct
    public void init() {
        System.out.println("teacher init");
    }

    @Autowired
    private Student student;

    @Autowired
    private Teach teacher;

    @TestAop
    @Override
    public void teach() {
        System.out.println("teacher = " + teacher.getClass());
        System.out.println("this = " + this.getClass());
        System.out.println("teacher==this = " + (teacher == this));
        System.out.println("teach:" + student);
    }
}
