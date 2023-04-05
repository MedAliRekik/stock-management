package com.stockmanagement.services;

import com.stockmanagement.error.ConflictException;
import com.stockmanagement.error.NotFoundException;
import com.stockmanagement.model.Client;
import com.stockmanagement.repository.ClientRepository;
import com.stockmanagement.services.metier.IClientMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ClientService implements IClientMetier {
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    @Override
    public Page<Client> getClients(int page, int size) {
        return clientRepository.findAll(PageRequest.of(page, size));

    }

    @Override
    public Page<Client> getClientsByMotCle(String mc, int page, int size) {

        return clientRepository.findAllByMotCle(mc, PageRequest.of(page, size));
    }

    @Override
    public Client getClient(Long code) {
        try {
            return clientRepository.findByCode(code);
        } catch (NoSuchElementException ex) {
            throw new NotFoundException(String.format("No Record with the code [%s] was found in our database", code));
        }
    }

    @Override
    public Client saveClient(Client client) {
        if (clientRepository.findByCode(client.getCode()) != null) {
            throw new ConflictException("Another client with the same code exists");
        }
        return clientRepository.save(client);
    }

    @Override
    public boolean deleteClient(Long code) {
        Client frs = clientRepository.findByCode(code);
        if (frs != null) {
            clientRepository.delete(frs);
            return true;
        }
        return false;
    }
}
