package micromarket.eadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EadminApplication {

	public static void main(String[] args) {
		SpringApplication.run(EadminApplication.class, args);
	}

}
