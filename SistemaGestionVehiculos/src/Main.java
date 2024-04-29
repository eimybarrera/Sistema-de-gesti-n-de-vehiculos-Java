//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Motocicleta motocicleta= new Motocicleta("Honda",0,false);
        Automovil automovil= new Automovil("Toyota",0,false);
        automovil.arrancar();
        automovil.acelerar(60);
        automovil.frenar();
        automovil.obtenerEstado();

        motocicleta.arrancar();
        motocicleta.acelerar(120);
        motocicleta.frenar();
        motocicleta.obtenerEstado();


    }
}