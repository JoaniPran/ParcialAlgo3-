package ImperioIntergalactico;

public class CovertaMisiles implements AtaqueDisparable{

    public int canitdadDeMisiles = 3;

    public int obtenerPuntosDeAtaque(){
        return (this.canitdadDeMisiles * 10);
    }

    public void disparar() {
        this.canitdadDeMisiles = this.canitdadDeMisiles - 1 ;
    }

    public int cantidadDeBombas(){
        return this.canitdadDeMisiles;
    }
}
