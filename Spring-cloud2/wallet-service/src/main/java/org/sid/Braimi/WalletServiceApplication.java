package org.sid.Braimi;

import org.sid.Braimi.entities.Client;
import org.sid.Braimi.entities.Wallet;
import org.sid.Braimi.repository.ClientRepository;
import org.sid.Braimi.repository.WalletRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class WalletServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalletServiceApplication.class, args);
	}



	@Bean

	CommandLineRunner start(WalletRepository walletRepository, ClientRepository clientRepository){

		return args->{

			clientRepository.saveAll(
					List.of(

							Client.builder().name("HAMZA BRAIMI").email("hamza@Gmail.com").build(),
							Client.builder().name("Ahamdi BRAIMI").email("hamza@Gmail.com").build(),
							Client.builder().name("Hassan BRAIMI").email("hassani@Gmail.com").build()
					)
			);


			Client cl1=clientRepository.findById(1L).get();

			walletRepository.saveAll(
					List.of(

							Wallet.builder().walletId(UUID.randomUUID()).balance(1222).currency("DH").client(cl1).build(),
							Wallet.builder().walletId(UUID.randomUUID()).balance(1232).currency("DH").client(cl1).build(),
							Wallet.builder().walletId(UUID.randomUUID()).balance(1222).currency("DH").client(cl1).build(),
							Wallet.builder().walletId(UUID.randomUUID()).balance(1222).currency("DH").client(cl1).build(),
							Wallet.builder().walletId(UUID.randomUUID()).balance(1222).currency("DH").client(cl1).build()

					)
			);

			clientRepository.findAll().forEach(c -> {
				System.out.println(c.getName());
				System.out.println(c.getEmail());
			});


		};
	}











}


