package ImperioIntergalactico;

public class DestructorMisiles implements AtaqueDisparable{

    int canitdadDeMisiles = 5;
    @Override
    public int obtenerPuntosDeAtaque(){
        if (canitdadDeMisiles == 5) {
            return (this.canitdadDeMisiles * 10) + 20;
        }else{
            return (this.canitdadDeMisiles);
        }

    }
    public void disparar() {
        this.canitdadDeMisiles = this.canitdadDeMisiles - 1;
    }

    public int cantidadDeBombas(){
        return this.canitdadDeMisiles;
    }

}
