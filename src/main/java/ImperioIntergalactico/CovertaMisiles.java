package ImperioIntergalactico;

public class CovertaMisiles implements AtaqueDisparable{

    int canitdadDeMisiles = 3;
    @Override

    public int obtenerPuntosDeAtaque(){
        return (this.canitdadDeMisiles * 10);
    }

    @Override
    public void disparar(int CantidadDeMisiles) {
        this.canitdadDeMisiles = this.canitdadDeMisiles - CantidadDeMisiles;
    }
}
