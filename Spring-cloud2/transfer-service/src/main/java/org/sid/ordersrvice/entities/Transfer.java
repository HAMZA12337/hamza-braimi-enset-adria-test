//package org.sid.ordersrvice.entities;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.sid.ordersrvice.enums.TransfertEtat;
//import org.sid.ordersrvice.model.Wallet;
//
//import java.util.Date;
//
//
//@Entity @Data
//@Table(name="orders")
//@AllArgsConstructor @NoArgsConstructor @Builder
//public class Transfer {
//
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private Date date;
//    private double amount;
//    private TransfertEtat status;
//
//
//    private Long idsourceWallet;
//
//    private Long  iddestinationWallet;
//
//    @Transient
//
//    private Wallet wallet ;
//
//
//
//
//
//}
