package ImperioIntergalactico;

public class BombasDeNeutrones implements AtaqueDisparable{

    int bombasDeNeutrones = 10;
    @Override
    public int obtenerPuntosDeAtaque(){

       if (this.bombasDeNeutrones < 0){
                return 0;
        }
        return (this.bombasDeNeutrones * 5);
        }


    public void disparar() {
        this.bombasDeNeutrones = this.bombasDeNeutrones - 1;
    }
    public int cantidadDeBombas(){
        return this.bombasDeNeutrones;
    }
}

