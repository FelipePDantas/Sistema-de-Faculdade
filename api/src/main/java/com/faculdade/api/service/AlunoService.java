package com.faculdade.api.service;

import com.faculdade.api.model.Aluno;
import com.faculdade.api.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    public Aluno create (Aluno aluno){
      return  alunoRepository.save(aluno);


        }
          }


