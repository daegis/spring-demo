package cn.ihna.demo.spring.service.impl;

import cn.ihna.demo.spring.service.SchoolService;

/**
 * @author xianyingda@gmail.com
 * @serial
 * @since 2020/8/7 1:05 下午
 */
public class StudentService implements SchoolService {
    @Override
    public void doSpeech() {
        System.out.println("I am a student");
    }
}
