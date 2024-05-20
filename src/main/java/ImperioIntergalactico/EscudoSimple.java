package ImperioIntergalactico;

public class EscudoSimple implements SistemaDefensa{
    int puntosdDeDefensa = 20;
    public void recibirDaño(int cantidadDeMisiles){
        this.puntosdDeDefensa = puntosdDeDefensa - cantidadDeMisiles;
    }
    public int obtenerPuntoDeDefensa(){
        return (this.puntosdDeDefensa);
    }
}
