import bean.BeanOne;
import bean.BeanTwo;
import bean.SpringBean;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

       // SpringBean bean = ctx.getBean(SpringBean.class);
        //System.out.println(bean);

      //  BeanOne bean = ctx.getBean(BeanOne.class);
        //System.out.println(bean);



        ctx.close();

       // BeanTwo bean1 = ctx.getBean(BeanTwo.class);
       // System.out.println(bean1);
    }
}
