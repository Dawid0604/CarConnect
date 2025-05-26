package pl.dawid0604.carconnect.config.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CarConnectApplication {

	public static void main(final String[] args) {
		SpringApplication.run(CarConnectApplication.class, args);
	}

}
