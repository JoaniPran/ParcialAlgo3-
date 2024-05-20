package ImperioIntergalactico;

public class EscudoSimple implements SistemaDefensa{
    int puntosdDeDefensa;

    public EscudoSimple(int puntosDefensa) {
        this.puntosdDeDefensa = puntosDefensa;
    }

    public void recibirDanio(int cantidadDeMisiles){
        this.puntosdDeDefensa = puntosdDeDefensa - cantidadDeMisiles * 10;
        if (this.puntosdDeDefensa < 0) {
            this.puntosdDeDefensa = 0;
        }
    }
    public int obtenerPuntoDeDefensa(){
        return (this.puntosdDeDefensa);
    }
}
