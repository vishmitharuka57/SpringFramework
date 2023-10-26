import bean.BeanOne;
import bean.BeanTwo;
import bean.SpringBean;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("JVM about to shutdown");
                ctx.close();
            }
        }));

        ctx.register(AppConfig.class);
        ctx.refresh();

       // SpringBean bean = ctx.getBean(SpringBean.class);
        //System.out.println(bean);

      //  BeanOne bean = ctx.getBean(BeanOne.class);
        //System.out.println(bean);





       // BeanTwo bean1 = ctx.getBean(BeanTwo.class);
       // System.out.println(bean1);
    }
}
