public class Automovil extends VehiculoBase {

    public Automovil(String marca, int velocidadActual, boolean estaEnMovimiento) {
        super(marca, velocidadActual, estaEnMovimiento);
    }
    public void acelerar(int velocidad) {
        if (getVelocidadActual()>0 || isEstaEnMovimiento()){
            System.out.println("Acelerando el vehiculo"+getMarca());
            setVelocidadActual(velocidad);
            System.out.println("Su vehiculo"+getMarca()+"tiene una velocidad de"+getVelocidadActual());
        }
        else {
            System.out.println("la aceleracion debe ser mayor a cero");
        }


    }
}
