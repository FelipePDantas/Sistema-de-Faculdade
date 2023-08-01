package com.faculdade.api.controller;

import com.faculdade.api.model.Aluno;
import com.faculdade.api.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    public ResponseEntity<Aluno> create (@RequestBody Aluno aluno){

        Aluno alunocreated = alunoService.create(aluno);

        return ResponseEntity.status(201).body(alunocreated);
    }



}
