package micromarket.eproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EproductApplication {

	public static void main(String[] args) {
		SpringApplication.run(EproductApplication.class, args);
	}

}
