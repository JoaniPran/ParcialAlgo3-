package ImperioIntergalactico;

public class EscudoFenix implements SistemaDefensa {
    int puntosdDeDefensa;

    public EscudoFenix(int puntosDefensa) {
        this.puntosdDeDefensa = puntosDefensa;
    }

    public SistemaDefensa recibirDanio(int cantidadDeMisiles) {
        this.puntosdDeDefensa = puntosdDeDefensa - (cantidadDeMisiles * 10);
            if (puntosdDeDefensa < 0) {
                return new EscudoSimple(30);
            }
            return this;
    }

    public int obtenerPuntoDeDefensa() {
        return (this.puntosdDeDefensa);
    }
}