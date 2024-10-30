package com.nicolas.gerenciador.gerenciadortarefas.service;

import com.nicolas.gerenciador.gerenciadortarefas.model.Tarefa;
import com.nicolas.gerenciador.gerenciadortarefas.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {
    @Autowired
    private TarefaRepository tarefaRepository;

    public List<Tarefa> listarTarefas() {
        List<Tarefa> tarefas = tarefaRepository.findAll();
        System.out.println("Tarefas encontradas: " + tarefas); // Adicione este log
        return tarefas;
    }

    public Tarefa salvarTarefa(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    public void removerTarefa(Long id) {
        tarefaRepository.deleteById(id);
    }
}