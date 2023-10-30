//package org.sid.ordersrvice.Repository;
//
//import org.sid.ordersrvice.entities.Transfer;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.query.Param;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//import org.springframework.data.rest.core.annotation.RestResource;
//
//import java.util.List;
//
//@RepositoryRestResource
//public interface TransferRepository extends JpaRepository<Transfer, Long> {
//    @RestResource(path = "/byWalletId")
//    List<Transfer> findByCustomerId(@Param("WalletId") Long WalletId);
//}