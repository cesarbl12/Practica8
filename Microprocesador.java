public class Microprocesador extends ComponenteElectronico {

    protected int cacheRam;
    protected long velocidadHz;

    // Constructor que inicializa tanto los atributos heredados como los específicos de Microprocesador
    public Microprocesador(String fabricante, String numeroSerie, String marca, String nombre, float costo, DispositivoElectronico esParteDe, int cacheRam, long velocidadHz) {
        // Llamada al constructor de la clase base (ComponenteElectronico)
        super(fabricante, numeroSerie, marca, nombre, costo, esParteDe);
        this.cacheRam = cacheRam;
        this.velocidadHz = velocidadHz;
    }
    //Metodo para obtener CacheRam
    public int getCacheRam() {
        return cacheRam;
    }
    //Metodo para obtener VelocidadHz
    public long getVelocidadHz() {
        return velocidadHz;
    }
    //Metodo toString para mostrar la informacion de Microprocesador
    @Override
    public String toString() {
        return "Microprocesador{" +
                "nombre='" + nombre + '\'' +
                ", cacheRam=" + cacheRam + " MB" +
                ", velocidadHz=" + velocidadHz + " Hz" +
                ", esParteDe=" + (esParteDe != null ? esParteDe.getNombre() : "N/A") +
                '}';
    }
}