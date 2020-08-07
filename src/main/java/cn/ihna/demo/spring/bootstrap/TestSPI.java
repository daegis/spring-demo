package cn.ihna.demo.spring.bootstrap;

import cn.ihna.demo.spring.service.SchoolService;

import java.util.ServiceLoader;

/**
 * @author xianyingda@gmail.com
 * @serial
 * @since 2020/8/7 1:05 下午
 */
public class TestSPI {
    public static void main(String[] args) {
        ServiceLoader<SchoolService> loader = ServiceLoader.load(SchoolService.class);
        for (SchoolService service : loader) {
            service.doSpeech();
        }
    }
}
