package ImperioIntergalactico;

public class Coberta extends Nave{

    private SistemaDeAtaque tipoDeAtaque;
    private SistemaDefensa tipoDeDefensa;

    public Coberta(SistemaDeAtaque Ataque, SistemaDefensa Defensa){
        this.tipoDeAtaque = Ataque;
        this.tipoDeDefensa = Defensa;
    }
    public int puntosTotates(){
        return (tipoDeAtaque.obtenerPuntosDeAtaque() + tipoDeDefensa.obtenerPuntoDeDefensa());
    }

    public SistemaDeAtaque obtenerSistemaDeAtaque(){
        return tipoDeAtaque;
    }

}
