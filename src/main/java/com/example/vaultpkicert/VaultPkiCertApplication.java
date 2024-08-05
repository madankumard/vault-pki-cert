package com.example.vaultpkicert;

import com.example.vaultpkicert.config.HashiVaultConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(HashiVaultConfig.class)
public class VaultPkiCertApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory
			.getLogger(VaultPkiCertApplication.class);

	private HashiVaultConfig hashiVaultConfig;

	public static void main(String[] args) {
		SpringApplication.run(VaultPkiCertApplication.class, args);
	}

	public VaultPkiCertApplication(HashiVaultConfig hashiVaultConfig) {
		this.hashiVaultConfig = hashiVaultConfig;
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("dbid: " + hashiVaultConfig.getDbid());
		log.info("dbpid: " + hashiVaultConfig.getDbpid());

	}
}
