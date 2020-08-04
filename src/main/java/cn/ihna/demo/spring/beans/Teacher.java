package cn.ihna.demo.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author xianyingda@gmail.com
 * @serial
 * @since 2020/8/4 1:39 下午
 */
@Component
public class Teacher {

    @PostConstruct
    public void init(){
        System.out.println("teacher init");
    }

    @Autowired
    private Student student;

    public void teach() {
        System.out.println("teach:" + student);
    }
}
