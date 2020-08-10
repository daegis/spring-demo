package cn.ihna.demo.spring.beans;

import java.util.UUID;

/**
 * @author xianyingda@gmail.com
 * @serial
 * @since 2020/8/10 9:05 下午
 */
public class CleanerFactory {

    public Cleaner getCleaner() {
        Cleaner cleaner = new Cleaner();
        cleaner.setFrom("factory");
        cleaner.setName(UUID.randomUUID().toString());
        return cleaner;
    }
}
