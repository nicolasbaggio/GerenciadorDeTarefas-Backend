package com.nicolas.gerenciador.gerenciadortarefas;

import com.nicolas.gerenciador.gerenciadortarefas.model.Tarefa;
import com.nicolas.gerenciador.gerenciadortarefas.repository.TarefaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GerenciadorTarefasApplication {

    public static void main(String[] args) {
        SpringApplication.run(GerenciadorTarefasApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(TarefaRepository tarefaRepository) {
        return (args) -> {
            Tarefa tarefa = new Tarefa();
            tarefa.setTitulo("Tarefa de Teste");
            tarefa.setDescricao("Esta é uma tarefa de teste.");
            tarefaRepository.save(tarefa);
        };
    }
}