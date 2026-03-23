package com.example.AbstractFactory;

public class Computador {
    private final Processador processador;
    private final Memoria memoria;

    public Computador(FabricaAbstrata fabrica) {
        this.processador = fabrica.createProcessador();
        this.memoria = fabrica.createMemoria();
    }

    public String obterEspecificacoes() {
        return this.processador.especificar() + " | " + this.memoria.especificar();
    }

    public String processar() {
        return "Computador processando com: " + this.processador.processar();
    }
}
