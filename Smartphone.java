public class Smartphone extends DispositivoElectronicoDeConsumo {
    protected Sensor sensorDeHuella;
    protected Pantalla pantalla;

    // Constructor que inicializa todos los atributos del Smartphone
    public Smartphone(String fabricante, String numeroSerie, String marca, String nombre, float costo, boolean encendido, Sensor sensorDeHuella, Pantalla pantalla) {
        // Llamada al constructor de la clase base (DispositivoElectronicoDeConsumo)
        super(fabricante, numeroSerie, marca, nombre, costo, encendido);
        this.sensorDeHuella = sensorDeHuella;
        this.pantalla = pantalla;
    }
    //Metodo para obtener el valor de sensor
    public Sensor getSensorDeHuella() {
        return sensorDeHuella;
    }
    //Metodo para obtener el valor de pantalla
    public Pantalla getPantalla() {
        return pantalla;
    }

    // Método para establecer el sensor de huella 
    public void setSensorDeHuella(Sensor sensorDeHuella) {
        this.sensorDeHuella = sensorDeHuella;
    }
    //Metodo para establecer la pantalla
    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    //Metodo toString para mostrar la informacion de smartphone
    @Override
    public String toString() {
        return "Smartphone{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", pantalla=" + pantalla.getNombre() +  // Mostrar el nombre de la pantalla
                ", sensorDeHuella=" + (sensorDeHuella != null ? sensorDeHuella.getNombre() : "N/A") +  // Mostrar el nombre del sensor
                ", encendido=" + encendido +
                '}';
    }
}