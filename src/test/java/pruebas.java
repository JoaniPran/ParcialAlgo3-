package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import ImperioIntergalactico.*;
import org.junit.Test;


public class pruebas {

    @Test
    public void test01UnaCovertaConUnSistemaDeAtaque() {

        int puntosDeAtaqueEsperado = 40;

        Coberta nuevaCoberta = new Coberta(new CovertaMisiles(), new EscudoSimple(20));

        nuevaCoberta.obtenerSistemaDeAtaque().disparar();

        assertEquals(puntosDeAtaqueEsperado, nuevaCoberta.puntosTotates());
    }

    @Test
    public void test02UnDestructorConUnSistemaDeAtaqueYDefensa() {

        int puntosDeAtaqueEsperado = 100;

        Destructor nuevoDestructor = new Destructor(new DestructorMisiles(), new EscudoFenix(50));

        nuevoDestructor.obtenerSistemaDeDefensa().recibirDanio(6);

        assertEquals(puntosDeAtaqueEsperado, nuevoDestructor.puntosTotates());
    }

    @Test
    public void test03UnAcorazadoConUnSistemaDeAtaqueYDefensa() {

        int puntosDeAtaqueEsperado = 300;

        Acorazado nuevoAcorazado = new Acorazado(new BombasDeNeutrones(), new EscudoIonic(), new TorretaIonica());

        assertEquals(puntosDeAtaqueEsperado, nuevoAcorazado.puntosTotates());
    }

    @Test
    public void test04UnAcorazadoConUnSistemaDeAtaqueDefensaYUnDisparo() {

        int puntosDeAtaqueEsperado = 70;

        Acorazado nuevoAcorazado = new Acorazado(new BombasDeNeutrones(), new EscudoIonic(), new TorretaIonica());

        nuevoAcorazado.obtenerSistemaDeAtaque().disparar();

        assertEquals(puntosDeAtaqueEsperado, nuevoAcorazado.puntosTotates());
    }
}