package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import ImperioIntergalactico.Coberta;
import ImperioIntergalactico.CovertaMisiles;
import ImperioIntergalactico.EscudoSimple;
import org.junit.Test;


public class pruebas {

    @Test
    public void test01UnPeleadorConCiertoKiYTransformacionPoseeElSiguienteNivelDePelea() {
        // Arrange
        int kiEsperado = 5000;

        Coberta nuevaCoberta = new Coberta(new CovertaMisiles(), new EscudoSimple());

        // La lectura se hizo con un modelo viejo. El estado base no afecta el nivel de Ki

        nuevaCoberta
        // Act
        int kiObtenido = algoRastreadorZ.nivelDePeleaDe("Goku");

        // Assert
        assertEquals(kiEsperado, kiObtenido);
    }
}