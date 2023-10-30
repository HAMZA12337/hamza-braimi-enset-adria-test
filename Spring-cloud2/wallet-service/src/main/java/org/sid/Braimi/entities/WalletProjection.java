package org.sid.Braimi.entities;


import org.springframework.data.rest.core.config.Projection;

import java.util.UUID;

@Projection(name="fullWallet",types = Wallet.class)
public interface WalletProjection {

    public int getId();
    public UUID getWalletId();
    public double getBalance();
    public String getCurrency();



}
