import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class springuseprogram 
{
 public static void main(String arg[]) 
 {
     AnnotationConfigApplicationContext ctx=new
         AnnotationConfigApplicationContext(HelloSpringConfig.class);
    HelloJava hellojava=ctx.getBean(HelloJava.class);
     hellojava.setTutorName("Ashish!");
     String strname=hellojava.getTutorName();
     System.out.println(strname);
 }
}
