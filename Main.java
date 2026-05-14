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
        System.out.println();

        super.tipo = "Cattleya";
    }
}
 // ERROR: non-static variable super cannot be referenced from a static context
        // super no puede usarse en Main porque:
        // 1. main es un método estático
        // 2. Main no hereda de Planta