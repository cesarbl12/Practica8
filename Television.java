public class Television extends DispositivoElectronicoDeConsumo {
    protected Pantalla pantalla;

    // Constructor que inicializa tanto los atributos heredados como la pantalla
    public Television(String fabricante, String numeroSerie, String marca, String nombre, float costo, boolean encendido, Pantalla pantalla) {
        // Llamada al constructor de la clase base (DispositivoElectronicoDeConsumo)
        super(fabricante, numeroSerie, marca, nombre, costo, encendido);
        this.pantalla = pantalla;  // Inicializa el atributo pantalla
    }

    // Método para obtener la pantalla
    public Pantalla getPantalla() {
        return pantalla;
    }

    //Metodo para establecer la pantalla
    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    //Metodo toString para mostrar la informacion de telivision
    @Override
    public String toString() {
        return "Television{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", pantalla=" + pantalla.getNombre() +  // Mostrar el nombre de la pantalla
                ", encendido=" + encendido +
                '}';
    }
}