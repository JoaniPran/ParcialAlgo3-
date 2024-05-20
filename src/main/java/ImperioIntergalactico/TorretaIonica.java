package ImperioIntergalactico;

public class TorretaIonica implements SistemaDeAtaque{
    public int obtenerPuntosDeAtaque(int canitdadDeMisiles){
        if (canitdadDeMisiles == 10){
            return canitdadDeMisiles * 10;
        }else
            if (canitdadDeMisiles < 10){
            return (canitdadDeMisiles - 10) * 10;
        }
    return 0;
    }
}
