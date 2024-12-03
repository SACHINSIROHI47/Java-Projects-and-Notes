import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
 public class HelloSpringConfig {
  @Bean
  public HelloJava helloJava(){
      return new HelloJava();
  }
}
