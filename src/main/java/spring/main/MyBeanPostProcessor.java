package spring.main;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by user on 26.02.2017.
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object object, String s) throws BeansException {
        System.out.println("MyBeanPostProcessor " + object);
        return object;
    }

    public Object postProcessAfterInitialization(Object object, String s) throws BeansException {
        return object;
    }
}
