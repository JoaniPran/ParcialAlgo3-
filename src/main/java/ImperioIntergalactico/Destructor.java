package ImperioIntergalactico;

public class Destructor extends Nave{

    private AtaqueDisparable tipoDeAtaque;
    private SistemaDefensa tipoDeDefensa;

    public Destructor(AtaqueDisparable Ataque, SistemaDefensa Defensa){
        this.tipoDeAtaque = Ataque;
        this.tipoDeDefensa = Defensa;
    }
    public int puntosTotates(){

        if (tipoDeDefensa.obtenerPuntoDeDefensa() == 0 ){
            tipoDeDefensa =  new EscudoSimple(30);
        }
        return (tipoDeAtaque.obtenerPuntosDeAtaque() + tipoDeDefensa.obtenerPuntoDeDefensa());
    }

    public AtaqueDisparable obtenerSistemaDeAtaque(){
        return tipoDeAtaque;
    }

    public SistemaDefensa obtenerSistemaDeDefensa(){
        return tipoDeDefensa;
    }

}
