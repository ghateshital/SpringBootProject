package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import in.ashokit.security.AppSecurity;

@SpringBootApplication
@ComponentScan(basePackages = { " in.ashokit", "com.tcs" })
public class Application {

	public static void main(String[] args) {
		/*
		 * ConfigurableApplicationContext ctx=SpringApplication.run(Application.class,
		 * args); int count=ctx.getBeanDefinitionCount(); System.out.println(count);
		 */

		SpringApplication.run(Application.class, args);
	}

	/*
	 * @Bean public AppSecurity createObjAppsecurity() { AppSecurity as = new
	 * AppSecurity("SHA-256"); return as; }
	 */

}
