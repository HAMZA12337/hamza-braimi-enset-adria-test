package org.sid.Braimi.entities;


import org.springframework.data.rest.core.config.Projection;

@Projection(name="fullClient",types = Client.class)
public interface ClientProjection {

    public int getId();
    public String getName();
    public String getEmail();




}
