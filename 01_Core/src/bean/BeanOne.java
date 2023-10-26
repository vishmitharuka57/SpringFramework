package bean;

import org.springframework.stereotype.Component;

@Component
public class BeanOne {
    public BeanOne() {
        System.out.println("This is bean 1");
    }
}
