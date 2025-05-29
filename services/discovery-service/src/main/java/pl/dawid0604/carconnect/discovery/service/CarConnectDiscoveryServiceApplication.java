package pl.dawid0604.carconnect.discovery.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CarConnectDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarConnectDiscoveryServiceApplication.class, args);
	}

}
