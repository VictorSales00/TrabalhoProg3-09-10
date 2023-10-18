package br.edu.umfg.trabProg0910.controllers;

import br.edu.umfg.trabProg0910.entities.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/client")
public class ClientController {

    private ArrayList<Client> list =  new ArrayList<Client>();

    @PostMapping
    public ResponseEntity<Client> postClient (Client client){
        this.list.add(client);
        return ResponseEntity.ok(client);
    }
}


