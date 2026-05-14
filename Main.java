public class Main{
    public static void main(String[] args) {
        Persona persona = new Persona("Messi", 38);
        persona.mostrarDetalles();
        Empleado empleado = new Empleado("Cristiano", 40, "YouTube");
        empleado.mostrarDetalles();
        System.out.println();

        Animal animal = new Animal("Moncholo");
        animal.mostrarEspecie();
        Pez pez = new Pez("Salmon", "Dulce 'Rio'");
        pez.mostrarEspecie();
    }
}