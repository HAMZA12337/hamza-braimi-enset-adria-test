//package org.sid.ordersrvice.web;
//
//
//import org.sid.ordersrvice.Repository.TransferRepository;
//import org.sid.ordersrvice.entities.Transfer;
//import org.sid.ordersrvice.service.WalletRestClientService;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class TransferRestController {
//
//
//    private TransferRepository transferRepository;
//
//    public TransferRestController(TransferRepository transferRepository, WalletRestClientService walletRestClientServicee) {
//        this.transferRepository = transferRepository;
//        this.walletRestClientServicee = walletRestClientServicee;
//    }
//
//    private WalletRestClientService walletRestClientServicee;
//
//
//
//    @GetMapping("/fullTransfer/{id}")
//
//    public Transfer getTransfer(@PathVariable(name="id") Long id){
//
//        Transfer transfer=transferRepository.findById(id).get();
//
//        transfer.setWallet(walletRestClientServicee.walletById(transfer.getIdsourceWallet()));
//
//
//    return transfer;}
//
//
//
//
//
//}
