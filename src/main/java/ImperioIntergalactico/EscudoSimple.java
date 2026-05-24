package ImperioIntergalactico;

public class EscudoSimple implements SistemaDefensa{
    int puntosdDeDefensa;

    public EscudoSimple(int puntosDefensa) {
        this.puntosdDeDefensa = puntosDefensa;
    }

    public SistemaDefensa recibirDanio(int cantidadDeMisiles){
            this.puntosdDeDefensa = this.puntosdDeDefensa - cantidadDeMisiles;
            return this;
        }

    public int obtenerPuntoDeDefensa(){
        return (this.puntosdDeDefensa);
    }



}
