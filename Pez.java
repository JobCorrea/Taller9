public class Pez extends Animal{
    protected String tipoDeAgua;

    public Pez(String especie, String tipoDeAgua) {
        super(especie);
        this.tipoDeAgua = tipoDeAgua;
    }

    @Override
    public void mostrarEspecie(){
        super.mostrarEspecie();
        System.out.println("Tipo de AGUA: "+tipoDeAgua);
    }
    
}