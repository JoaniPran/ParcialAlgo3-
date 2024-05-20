package ImperioIntergalactico;

public class DestructorMisiles implements AtaqueDisparable{

    int canitdadDeMisiles = 5;
    @Override
    public int obtenerPuntosDeAtaque(){
        if (canitdadDeMisiles == 5) {
            return (this.canitdadDeMisiles * 10) + 20;
        }
        return 0;
    }
    public void disparar(int CantidadDeMisiles) {
        this.canitdadDeMisiles = this.canitdadDeMisiles - CantidadDeMisiles;
    }
}
