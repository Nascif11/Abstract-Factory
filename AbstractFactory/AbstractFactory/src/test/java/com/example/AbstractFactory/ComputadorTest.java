package com.example.AbstractFactory;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ComputadorTest {

    @Test
    void deveObterEspecificacoesDesktop() {
        FabricaAbstrata fabrica = new FabricaDesktop();
        Computador computador = new Computador(fabrica);
        assertEquals("Processador Desktop Intel Core i9 (14 núcleos) | RAM 64GB DDR5 (capacidade total)",
                computador.obterEspecificacoes());
    }

    @Test
    void deveObterEspecificacoesLaptop() {
        FabricaAbstrata fabrica = new FabricaLaptop();
        Computador computador = new Computador(fabrica);
        assertEquals("Processador Laptop Intel Core i7 (8 núcleos - baixo consumo) | RAM 16GB LPDDR5 (otimizada para portabilidade)",
                computador.obterEspecificacoes());
    }

    @Test
    void deveProcessarComDesktop() {
        FabricaAbstrata fabrica = new FabricaDesktop();
        Computador computador = new Computador(fabrica);
        assertEquals("Computador processando com: Processamento de alta performance",
                computador.processar());
    }

    @Test
    void deveProcessarComLaptop() {
        FabricaAbstrata fabrica = new FabricaLaptop();
        Computador computador = new Computador(fabrica);
        assertEquals("Computador processando com: Processamento otimizado para economia de bateria",
                computador.processar());
    }

    @Test
    void deveVerificarProcessadorDesktop() {
        FabricaAbstrata fabrica = new FabricaDesktop();
        Processador processador = fabrica.createProcessador();
        assertNotNull(processador);
        assertInstanceOf(ProcessadorDesktop.class, processador);
    }

    @Test
    void deveVerificarProcessadorLaptop() {
        FabricaAbstrata fabrica = new FabricaLaptop();
        Processador processador = fabrica.createProcessador();
        assertNotNull(processador);
        assertInstanceOf(ProcessadorLaptop.class, processador);
    }

    @Test
    void deveVerificarMemoriaDesktop() {
        FabricaAbstrata fabrica = new FabricaDesktop();
        Memoria memoria = fabrica.createMemoria();
        assertNotNull(memoria);
        assertInstanceOf(MemoriaDesktop.class, memoria);
    }

    @Test
    void deveVerificarMemoriaLaptop() {
        FabricaAbstrata fabrica = new FabricaLaptop();
        Memoria memoria = fabrica.createMemoria();
        assertNotNull(memoria);
        assertInstanceOf(MemoriaLaptop.class, memoria);
    }

    @Test
    void deveConterProcessadorNoComputador() {
        FabricaAbstrata fabrica = new FabricaDesktop();
        Computador computador = new Computador(fabrica);
        assertNotNull(computador);
        String especificacoes = computador.obterEspecificacoes();
        assertTrue(especificacoes.contains("Processador"));
    }

    @Test
    void deveConterMemoriaNoComputador() {
        FabricaAbstrata fabrica = new FabricaLaptop();
        Computador computador = new Computador(fabrica);
        assertNotNull(computador);
        String especificacoes = computador.obterEspecificacoes();
        assertTrue(especificacoes.contains("RAM"));
    }
}