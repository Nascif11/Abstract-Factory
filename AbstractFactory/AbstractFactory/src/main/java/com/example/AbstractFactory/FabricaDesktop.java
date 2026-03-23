package com.example.AbstractFactory;

public class FabricaDesktop implements FabricaAbstrata {
    @Override
    public Processador createProcessador() {
        return new ProcessadorDesktop();
    }

    @Override
    public Memoria createMemoria() {
        return new MemoriaDesktop();
    }
}
