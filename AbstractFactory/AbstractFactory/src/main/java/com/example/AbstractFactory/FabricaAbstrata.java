package com.example.AbstractFactory;;=

public interface FabricaAbstrata {
    Processador createProcessador();
    Memoria createMemoria();
}