package ImperioIntergalactico;

public class Acorazado extends Nave{

    private AtaqueDisparable tipoDeAtaque;
    private EscudoIonico tipoDeDefensa;
    private SistemaDeAtaque torretaOinica;

    public Acorazado(AtaqueDisparable Ataque, EscudoIonico Defensa,SistemaDeAtaque torreta){
        this.tipoDeAtaque = Ataque;
        this.tipoDeDefensa = Defensa;
        this.torretaOinica = torreta;
    }
    public int puntosTotates(){
        return tipoDeDefensa.puntosDeAtaque((tipoDeAtaque.obtenerPuntosDeAtaque() + torretaOinica.obtenerPuntosDeAtaque(tipoDeAtaque.cantidadDeBombas())));
    }

    public AtaqueDisparable obtenerSistemaDeAtaque(){
        return tipoDeAtaque;
    }

    public EscudoIonico obtenerSistemaDeDefensa(){
        return tipoDeDefensa;
    }

}
