package com.example.AbstractFactory;

public class ProcessadorLaptop implements Processador {
    @Override
    public String especificar() {
        return "Processador Laptop Intel Core i7 (8 núcleos - baixo consumo)";
    }

    @Override
    public String processar() {
        return "Processamento otimizado para economia de bateria";
    }
}
