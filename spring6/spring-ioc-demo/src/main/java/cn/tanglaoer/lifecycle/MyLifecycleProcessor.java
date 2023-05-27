package cn.tanglaoer.lifecycle;

import org.springframework.context.LifecycleProcessor;

/**
 * @author <a href="https://github.com/TangLaoEr">tks</a>
 * @Date 2023/5/27
 */
public class MyLifecycleProcessor implements LifecycleProcessor {
    @Override
    public void onRefresh() {
        System.out.println("onRefresh");
    }

    @Override
    public void onClose() {
        System.out.println("onClose");
    }

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public boolean isRunning() {
        return false;
    }
}
