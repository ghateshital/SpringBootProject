package in.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.ashokit.security.AppSecurity;

@Configuration
public class AppConfig {

	public AppConfig()
	{
		System.out.println("Appconfig::Constructor");
	}
	@Bean
	public AppSecurity createObjAppsecurity() {
		AppSecurity as = new AppSecurity("SHA-256");
		return as;
	}
}
