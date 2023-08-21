package tech.vedantchimote.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.shopme.common.entity"})
public class AvoCommerceBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvoCommerceBackEndApplication.class, args);
	}

}
