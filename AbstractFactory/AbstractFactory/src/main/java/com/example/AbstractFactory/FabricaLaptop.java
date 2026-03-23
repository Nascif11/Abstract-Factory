package com.example.AbstractFactory;

public class FabricaLaptop implements FabricaAbstrata {
    @Override
    public Processador createProcessador() {
        return new ProcessadorLaptop();
    }

    @Override
    public Memoria createMemoria() {
        return new MemoriaLaptop();
    }
}
