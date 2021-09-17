package com.sales4agro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class Sales4agroApplication {
	public static void main(String[] args) {
		SpringApplication start = new SpringApplication(Sales4agroApplication.class);

		Environment env = start.run(args).getEnvironment();

		String protocol = "http";

		if (env.getProperty("server.ssl.key-store") != null) {
			protocol = "https";
		}

		System.out.printf("\n\nSomething great can happen here: %s://localhost:%s\n\n",
				protocol,
				env.getProperty("server.port"));
	}
}
