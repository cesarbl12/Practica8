public class ComponenteElectronico extends DispositivoElectronico {
    protected DispositivoElectronico esParteDe;

    // Constructor que inicializa tanto los atributos de la clase base como el atributo esParteDe
    public ComponenteElectronico(String fabricante, String numeroSerie, String marca, String nombre, float costo, DispositivoElectronico esParteDe) {
        // Llamada al constructor de la clase base
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.esParteDe = esParteDe;  // Inicializa el atributo esParteDe
    }
public ComponenteElectronico(){

}
    public DispositivoElectronico getEsParteDe() {
        return esParteDe;
    }

    public void setEsParteDe(DispositivoElectronico esParteDe) {
        this.esParteDe = esParteDe;
    }

    @Override
    public String toString() {
        return "ComponenteElectronico{" +
                "nombre='" + nombre + '\'' +
                ", esParteDe=" + (esParteDe != null ? esParteDe.getNombre() : "N/A") +
                '}';
    }
}