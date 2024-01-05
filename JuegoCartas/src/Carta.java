
public class Carta {
    private String nombre;

    Carta(String nombre){
        this.nombre = nombre;
    }

    String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    void jugar(){

    }

    void mostrarDescripcion(){
        System.out.println(nombre);
    }
}

class CartaNumerica extends Carta{
    private int numero;

    CartaNumerica(String nombre, int numero){
        super(nombre);
        this.numero = numero;
    }

    int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    void mostrarDescripcion(){
        super.mostrarDescripcion();
        System.out.println(numero);
    }
}

class CartaEspecial extends Carta{
    String especial;

    CartaEspecial(String nombre, String especial){
        super(nombre);
        this.especial = especial;
    }

    String getEspecial(){
        return especial;
    }

    public void setEspecial(String especial) {
        this.especial = especial;
    }

    void activarEfectoEspecial(){
        try{

        } catch (Exception e){

        }
    }
    @Override
    void mostrarDescripcion(){
        super.mostrarDescripcion();
        System.out.println(especial);
    }
}