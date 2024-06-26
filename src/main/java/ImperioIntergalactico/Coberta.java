package ImperioIntergalactico;

public class Coberta extends Nave{

    private AtaqueDisparable tipoDeAtaque;
    private SistemaDefensa tipoDeDefensa;

    public Coberta(AtaqueDisparable Ataque, SistemaDefensa Defensa){
        this.tipoDeAtaque = Ataque;
        this.tipoDeDefensa = Defensa;
    }
    public int puntosTotates(){
        return (tipoDeAtaque.obtenerPuntosDeAtaque() + tipoDeDefensa.obtenerPuntoDeDefensa());
    }

    public AtaqueDisparable obtenerSistemaDeAtaque(){
        return tipoDeAtaque;
    }

}
