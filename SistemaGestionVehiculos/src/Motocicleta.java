public class Motocicleta extends VehiculoBase {

    public Motocicleta(String marca, int velocidadActual, boolean estaEnMovimiento) {
        super(marca, velocidadActual, estaEnMovimiento);

    }

    public void acelerar(int velocidad) {
        if (velocidad>0&& velocidad<150){
            System.out.println("la motocicleta con marca"+getMarca()+" está acelerando");
            setVelocidadActual(velocidad);
            System.out.println("la velocidad actual es de "+getVelocidadActual());
        }else {
            System.out.println("la motocicleta solo puede acelerar 150 km/h");
        }

    }
}
