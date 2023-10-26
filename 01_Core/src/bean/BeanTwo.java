package bean;

import org.springframework.stereotype.Component;

@Component
public class BeanTwo {
    public BeanTwo() {
        System.out.println("This is bean 2");
    }
}
