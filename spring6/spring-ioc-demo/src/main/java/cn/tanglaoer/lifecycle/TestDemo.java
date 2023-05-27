package cn.tanglaoer.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

/**
 * 生命周期
 * @author <a href="https://github.com/TangLaoEr">tks</a>
 * @Date 2023/5/27
 */
public class TestDemo implements InitializingBean, DisposableBean {
    private String name;

    public TestDemo() {
    }

    public String getName() {
        System.out.println("getName");
        return name;
    }

    public void setName(String name) {
        System.out.println("setName");
        this.name = name;
    }

    public void init() {
        System.out.println("init");
    }

    public void cleanup() {
        System.out.println("cleanup");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destory");
    }
}