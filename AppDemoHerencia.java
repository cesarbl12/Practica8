import java.util.ArrayList;

public class AppDemoHerencia {
    public static void main(String[] args) {
        ArrayList<Smartphone> listaDeSmartphones = new ArrayList<>();

        Sensor sensor1 = new Sensor("Apple", "16PRO", "Apple", "Sensor Huella", 2.0f, null, "Huella dactilar", "Biométrico", 1);
        Sensor sensor2 = new Sensor("Samsung", "S21", "Samsung", "Sensor Huella", 1.0f, null, "Huella dactilar", "Biométrico", 1);

        Pantalla pantalla1 = new Pantalla("Apple", "R23", "Apple", "Pantalla Retina", 55.00f, null, 1170, 2532);
        Pantalla pantalla2 = new Pantalla("Samsung", "J1", "Samsung", "Pantalla O-LED", 44.00f, null, 1080, 2400);
        
        Smartphone smartphone1 = new Smartphone("Apple", "MOD16", "iPhone", "iPhone 16", 1200.00f, false, sensor1, pantalla1);
        Smartphone smartphone2 = new Smartphone("Samsung", "MOD31", "Galaxy", "Galaxy S21", 1000.00f, false, sensor2, pantalla2);

        listaDeSmartphones.add(smartphone1);
        listaDeSmartphones.add(smartphone2);

        ArrayList<Television> listaDeTelevisones = new ArrayList<>();

        Pantalla pantalla3 = new Pantalla("HISON", "ALPHA001", "HISON", "Pantalla OLED", 800.00f, null, 3840, 2160);
        Pantalla pantalla4 = new Pantalla("TCL", "ALPHA015", "TCL", "Pantalla LED", 700.00f, null, 1920, 1080);

        Television tv1 = new Television("HISON", "TV12345", "HISON", "LED TV", 1500.00f, false, pantalla1);
        Television tv2 = new Television("TCL", "TV54321", "TCL", "O-LED TV", 1400.00f, false, pantalla2);

        listaDeTelevisones.add(tv1);
        listaDeTelevisones.add(tv2);

        System.out.println("Lista de Celulares:");
        for (Smartphone smartphone : listaDeSmartphones) {
            System.out.println(smartphone);
        }

        System.out.println("\nLista de Televisiones:");
        for (Television tv : listaDeTelevisones) {
            System.out.println(tv);
        }
    }
}