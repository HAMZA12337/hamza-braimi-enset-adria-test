package org.sid.ordersrvice;

//import org.sid.ordersrvice.Repository.TransferRepository;
//import org.sid.ordersrvice.entities.Transfer;
//import org.sid.ordersrvice.enums.TransfertEtat;
//import org.sid.ordersrvice.model.Wallet;
//import org.sid.ordersrvice.service.WalletRestClientService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
import java.util.Random;

@SpringBootApplication
@EnableFeignClients
public class OrderSrviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderSrviceApplication.class, args);
	}


//	@Bean
//	CommandLineRunner start(TransferRepository orderRespository, ProductItemRespository productItemRespository,
//							WalletRestClientService customerRestClientService,
//							InventoryRestClientService inventoryRestClientService){
//
//
//		return args -> {
//
//
//			List<Wallet> customers=customerRestClientService.allcustomers().getContent().stream().toList();
//			List<Product> products=inventoryRestClientService.allproducts().getContent().stream().toList();
//
//			Long customerId=1L;
//           Random random=new Random();
//			Wallet customer=customerRestClientService.customerById(customerId);
//
//			for(int i=0;i<20;i++ ){
//				Transfer order= Transfer.builder()
//						.customerId(customers.get(random.nextInt(customers.size())).getId())
//						.status(Math.random()>0.5? TransfertEtat.PENDING: TransfertEtat.CREATED)
//						.createdAt(new Date())
//						.build();
//
//
//				Transfer savedOrder=orderRespository.save(order);
//
//
//				for(int j=0;j<products.size();j++) {
//
//					if (Math.random() > 0.5) {
//						ProductItem productItem = ProductItem.builder()
//								.order(savedOrder)
//								.ProductId(products.get(j).getId())
//								.price(products.get(j).getPrice())
//								.quantity(products.get(j).getQuantity())
//								.discount(Math.random())
//								.build();
//						productItemRespository.save(productItem);
//					}
//				}
//
//
//
//			}
//
//
//
//
//
//
//		};
//
//



//	}












}
