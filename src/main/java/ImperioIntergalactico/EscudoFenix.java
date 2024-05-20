package ImperioIntergalactico;

public class EscudoFenix implements SistemaDefensa {
    int puntosdDeDefensa;

    public EscudoFenix(int puntosDefensa) {
        this.puntosdDeDefensa = puntosDefensa;
    }

    public void recibirDanio(int cantidadDeMisiles) {
        this.puntosdDeDefensa = puntosdDeDefensa - (cantidadDeMisiles * 10);
        if (this.puntosdDeDefensa < 0) {
            this.puntosdDeDefensa = 0;
        }
    }

    public int obtenerPuntoDeDefensa() {
        return (this.puntosdDeDefensa);
    }
}