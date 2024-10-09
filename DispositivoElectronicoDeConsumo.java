public class DispositivoElectronicoDeConsumo extends DispositivoElectronico{
    protected boolean encendido;

    public DispositivoElectronicoDeConsumo(String fabricante, String numeroSerie, String marca, String nombre, float costo, boolean encendido) {
        // Llamada al constructor de la clase base para inicializar los atributos heredados
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.encendido = encendido;  // Inicializa el estado de encendido
    }
    public DispositivoElectronicoDeConsumo() {

    }
    //Metodo para encender encendido
    public boolean encender(boolean encendido){
        encendido=true;
        return encendido;
    }
    //Metodo para apagar encendido
    public boolean apagar(boolean encendido){
        encendido=false;
        return encendido;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}