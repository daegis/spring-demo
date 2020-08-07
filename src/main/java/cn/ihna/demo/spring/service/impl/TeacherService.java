package cn.ihna.demo.spring.service.impl;

import cn.ihna.demo.spring.service.SchoolService;

/**
 * @author xianyingda@gmail.com
 * @serial
 * @since 2020/8/7 1:06 下午
 */
public class TeacherService implements SchoolService {
    @Override
    public void doSpeech() {
        System.out.println("I am a teacher");
    }
}
