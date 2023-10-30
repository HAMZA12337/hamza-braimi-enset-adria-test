//package org.sid.ordersrvice.service;
//
//import org.sid.ordersrvice.model.Wallet;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.hateoas.PagedModel;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//@FeignClient(name="wallet-service")
//public interface WalletRestClientService {
//
//
//    @GetMapping(path="/wallets?projection=fullWallet")
//    public PagedModel<Wallet> allWallet();
//
//    @GetMapping(path="/customers/{id}?projection=fullCustomer")
//    public Wallet walletById(@PathVariable(name="id") Long id);
//
//
//}
