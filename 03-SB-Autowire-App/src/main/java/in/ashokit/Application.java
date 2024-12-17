

package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	  ConfigurableApplicationContext ctx=	SpringApplication.run(Application.class, args);
	  UserService service=ctx.getBean(UserService.class);
	  service.getUserName(100);
	}
}
