package infinitystone.chalkag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//@ComponentScan(basePackages = {"infinitystone.chalkag","controller.common"})
public class ChalKagApplication {

  public static void main(String[] args) {
    SpringApplication.run(ChalKagApplication.class, args);
  }

}
