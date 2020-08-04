package cn.ihna.demo.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author xianyingda@gmail.com
 * @serial
 * @since 2020/8/4 10:26 下午
 */
@Component
public class HeadMaster {

    @Autowired
    private HeadMaid headMaid;
}
