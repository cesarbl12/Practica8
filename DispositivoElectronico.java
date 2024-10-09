import java.util.ArrayList;
public class DispositivoElectronico {
    protected String fabricante;
    protected String numeroSerie;
    protected String marca;
    protected String nombre;
    protected float costo;
    protected ArrayList<ComponenteElectronico> componentes = new ArrayList<>();

    public DispositivoElectronico() {
        ArrayList<ComponenteElectronico> componentes = new ArrayList<>();
    }
    public DispositivoElectronico(String fabricante, String numeroSerie, String marca, String nombre, float costo) {
        this.fabricante = fabricante;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.nombre = nombre;
        this.costo = costo;
    }
    //metodo para obtener fabricante
    public String getFabricante() {
        return fabricante;
    }
    //metodo para obtener numeroSerie
    public String getNumeroSerie() {
        return numeroSerie;
    }
    //metodo para obtener marca
    public String getMarca() {
        return marca;
    }
    //metodo para obtener nombre
    public String getNombre() {
        return nombre;
    }
    //Metodo para obtener costo
    public float getCosto() {
        return costo;
    }
    //Metodo para agregar un componente a ArrayList
    public void agregarComponente(ComponenteElectronico componente)
    {
        componentes.add(componente);
    }
    //Metodo para eliminar un componente de la ArrayList
    public void quitarComponentes(ComponenteElectronico componente){
        componentes.remove(componente);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}