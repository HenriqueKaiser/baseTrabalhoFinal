package com.example.corridanaselva.controller;

import com.example.corridanaselva.entity.Circuito;
import com.example.corridanaselva.entity.Maratonista;
import com.example.corridanaselva.service.MaratonistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static com.example.corridanaselva.entity.Enum.DificuldadeCircuito.*;

@RestController
@RequestMapping("api/v1")
public class MaratonistaController {
    @Autowired
   private MaratonistaService maratonistaService;

    @PostMapping("maratonista")

    public ResponseEntity<Maratonista> salvarMaratonista(@RequestBody Maratonista maratonista){
        return ResponseEntity.status(HttpStatus.CREATED).body(maratonistaService.salvarMaratonista(maratonista));
    }
//
//    public boolean valorPorIdade(Enum DificuldadeCircuito){
//
//        int valorIncricao;
//        int idade=0;
//        valorIncricao:
//        if (valorPorIdade(PEQUENO)) {
//            if (idade < 18) {
//
//                valorIncricao = 1300;
//            } else {
//                valorIncricao = 1500;
//            }
//        }else if (valorPorIdade(MEDIO)) {
//            if (idade < 18) {
//                valorIncricao = 2000;
//            } else {
//                valorIncricao = 2300;
//            }
//        }else if (valorPorIdade(AVANCADO)){
//                    if(idade >18) {
//                        valorIncricao = 2800;
//                    }else {
//                        throw new ResponseStatusException(HttpStatus.NOT_FOUND,
//                                "Inscrição não permitida para menores.");
//                    }
//
//        }
//                return
//    }



    @GetMapping("maratonista/{id}")
    public ResponseEntity<Maratonista> buscarMaratonista(@PathVariable Long id) {
        Maratonista maratonista = maratonistaService.buscarMaratonista(id);
        if (maratonista == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Maratonísta não encontrado");
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(maratonista);
        }
    }
    @GetMapping("maratonistas")
    public List<Maratonista> listarMaratonistas() {
        return maratonistaService.listarMaratonistas();
    }
}

