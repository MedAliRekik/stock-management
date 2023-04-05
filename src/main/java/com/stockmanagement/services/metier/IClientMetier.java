package com.stockmanagement.services.metier;

import com.stockmanagement.model.Client;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IClientMetier {
    List<Client> getClients();

    Page<Client> getClients(int page, int size);

    Page<Client> getClientsByMotCle(String mc, int page, int size);

    Client getClient(Long code);

    Client saveClient(Client frs);

    boolean deleteClient(Long code);
}
