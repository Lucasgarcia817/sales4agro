package com.sales4agro;

import com.sales4agro.domain.Anuncio;
import com.sales4agro.domain.Carrinho;
import com.sales4agro.domain.Cliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class Sales4agroApplication {
	public static void main(String[] args) {
		SpringApplication.run(Sales4agroApplication.class, args);
	}
}
