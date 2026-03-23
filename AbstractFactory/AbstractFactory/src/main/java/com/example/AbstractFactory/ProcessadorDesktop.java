package com.example.AbstractFactory;

public class ProcessadorDesktop implements Processador {
    @Override
    public String especificar() {
        return "Processador Desktop Intel Core i9 (14 núcleos)";
    }

    @Override
    public String processar() {
        return "Processamento de alta performance";
    }
}