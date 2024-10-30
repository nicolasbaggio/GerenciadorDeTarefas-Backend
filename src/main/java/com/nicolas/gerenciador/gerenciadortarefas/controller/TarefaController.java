package com.nicolas.gerenciador.gerenciadortarefas.controller;

import com.nicolas.gerenciador.gerenciadortarefas.model.Tarefa;
import com.nicolas.gerenciador.gerenciadortarefas.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tarefas")
@CrossOrigin(origins = "http://localhost:3000")  // Para permitir requisições do front-end

public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @GetMapping
    public List<Tarefa> listarTarefas() {
        return tarefaService.listarTarefas();
    }

    @PostMapping
    public Tarefa salvarTarefa(@RequestBody Tarefa tarefa) {
        return tarefaService.salvarTarefa(tarefa);
    }

    @DeleteMapping("/{id}")
    public void removerTarefa(@PathVariable Long id) {
        tarefaService.removerTarefa(id);
    }
}