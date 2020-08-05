package cn.ihna.demo.spring.tomcat;

import cn.ihna.demo.spring.servlet.TestServlet;
import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;

/**
 * @author xianyingda@gmail.com
 * @serial
 * @since 2020/8/5 1:33 下午
 */
public class TomcatBootstrap {
    public static void main(String[] args) throws Exception {
        Tomcat tomcat = new Tomcat();
        tomcat.getConnector().setPort(9091);
        Context context = tomcat.addContext("/test-server", null);
        Tomcat.addServlet(context, "test-servlet", new TestServlet());
        context.addServletMappingDecoded("/hello", "test-servlet");
        tomcat.init();
        tomcat.start();
        tomcat.getServer().await();
    }
}
