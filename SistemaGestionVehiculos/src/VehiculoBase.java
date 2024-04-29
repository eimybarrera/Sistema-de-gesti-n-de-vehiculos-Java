public class VehiculoBase  implements Vehiculo{
    private String marca;
    private int velocidadActual;
    private boolean estaEnMovimiento;

    public VehiculoBase(String marca, int velocidadActual, boolean estaEnMovimiento) {
        this.marca = marca;
        this.velocidadActual = velocidadActual;
        this.estaEnMovimiento = estaEnMovimiento;
    }

    public String getMarca() {
        return marca;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public boolean isEstaEnMovimiento() {
        return estaEnMovimiento;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    @Override
    public void arrancar() {
        if (estaEnMovimiento==false && velocidadActual==0){
            System.out.println("El vehiculo"+marca+"está arrancando");
            estaEnMovimiento=true;
        }else {
            System.out.println("El vehiculo"+marca+"ya está en movimiento y tiene una velocidad de "+velocidadActual);
        }

    }

    @Override
    public void detener() {
    velocidadActual=0;

    }

    @Override
    public void acelerar(int velocidad) {


    }

    @Override
    public void frenar() {
        if (estaEnMovimiento && velocidadActual>0){
        int velocidad=velocidadActual;
        velocidadActual=velocidadActual-10;
            System.out.println("Su vehiculo"+marca+"tenia una velocidad de "+velocidad+"ahora tiene una velocidad de"+velocidadActual);
        }
        else {
            System.out.println("su vehiculo"+marca+"no puede frenar porque no está en movimiento su velocidad actual es de: "+velocidadActual);
        }
    }

    @Override
    public void obtenerMarca() {
        System.out.println("la marca del vehiculo es: "+marca);

    }

    @Override
    public void obtenerEstado() {
        String estado;
        if (estaEnMovimiento==true){
            estado="en movimiento";
        }else {
            estado="detenido";
        }
        System.out.println("El vehiculo"+marca+"está"+estado);

    }
}
