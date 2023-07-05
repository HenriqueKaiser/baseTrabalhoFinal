package com.example.corridanaselva.service;

import com.example.corridanaselva.entity.Inscricao;
import com.example.corridanaselva.entity.Maratona;
import com.example.corridanaselva.entity.Maratonista;
import com.example.corridanaselva.repository.InscricaoRepository;
import com.example.corridanaselva.repository.MaratonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InscricaoService {
    @Autowired
    private InscricaoRepository inscricaoRepository;
    public Inscricao salvarInscricao (Inscricao inscricao){
        return inscricaoRepository.save(inscricao);

    }
    public Inscricao buscarInscricaoPorId (Long id){
        return inscricaoRepository.findById(id).get();
    }

    public List<Inscricao> listarInscricoes (){
        return  inscricaoRepository.findAll();
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

}
