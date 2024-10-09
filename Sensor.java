public class Sensor extends ComponenteElectronico {
    protected String tipo;
    protected String unidadDeMedida;
    protected int valor;

    // Constructor que inicializa tanto los atributos heredados como los específicos de Sensor
    public Sensor(String fabricante, String numeroSerie, String marca, String nombre, float costo, DispositivoElectronico esParteDe, String tipo, String unidadDeMedida, int valor) {
        // Llamada al constructor de la clase base (ComponenteElectronico)
        super(fabricante, numeroSerie, marca, nombre, costo, esParteDe);
        this.tipo = tipo;
        this.unidadDeMedida = unidadDeMedida;
        this.valor = valor;
    }
    //Metodo para obtener tipo
    public String getTipo() {
        return tipo;
    }
    //Metodo para obtener UnidadDeMedida
    public String getUnidadDeMedida() {
        return unidadDeMedida;
    }
    //Metodo para obtener valor
    public int getValor() {
        return valor;
    }
    //Metodo para establecer tipo
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    //Metodo para establecer unidadMedida
    public void setUnidadDeMedida(String unidadDeMedida) {
        this.unidadDeMedida = unidadDeMedida;
    }
    //Metodo para establecer valor
    public void setValor(int valor) {
        this.valor = valor;
    }

    //Metodo toString para mostrar la informacion de sensor
    @Override
    public String toString() {
        return "Sensor{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", unidadDeMedida='" + unidadDeMedida + '\'' +
                ", valor=" + valor +
                ", esParteDe=" + (esParteDe != null ? esParteDe.getNombre() : "N/A") +
                '}';
    }
}