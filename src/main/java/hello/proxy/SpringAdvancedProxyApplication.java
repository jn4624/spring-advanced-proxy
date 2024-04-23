package hello.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "hello.proxy.app") //주의
public class SpringAdvancedProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAdvancedProxyApplication.class, args);
	}

}
