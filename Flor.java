public class Flor extends Planta {
    public Flor(String tipo) {
        super(tipo);
    }

    public void mostrar() {
        // ERROR: tipo es private en Planta
        //System.out.println(super.tipo);
    }
}