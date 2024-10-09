public class Pantalla extends ComponenteElectronico {
    protected int resolucionX;
    protected int resolucionY;

    // Constructor que inicializa tanto los atributos heredados como los específicos de Pantalla
    public Pantalla(String fabricante, String numeroSerie, String marca, String nombre, float costo, DispositivoElectronico esParteDe, int resolucionX, int resolucionY) {
        // Llamada al constructor de la clase base (ComponenteElectronico)
        super(fabricante, numeroSerie, marca, nombre, costo, esParteDe);
        this.resolucionX = resolucionX;
        this.resolucionY = resolucionY;
    }

    // Métodos para obtener ResolucionX
    public int getResolucionX() {
        return resolucionX;
    }
    //Metodo para obtener ResolucionY
    public int getResolucionY() {
        return resolucionY;
    }
    //Metodo toString para mostrar la informacion de pantalla
    @Override
    public String toString() {
        return "Pantalla{" +
                "nombre='" + nombre + '\'' +
                ", resolucionX=" + resolucionX +
                ", resolucionY=" + resolucionY +
                ", esParteDe=" + (esParteDe != null ? esParteDe.getNombre() : "N/A") +
                '}';
    }
}