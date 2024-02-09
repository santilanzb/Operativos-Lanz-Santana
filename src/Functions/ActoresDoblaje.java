/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;

/**
 *
 * @author santi
 */
public class ActoresDoblaje {
     private int tarifaHora = 16;
    private int capacidadDrive = 35;
    private int doblajesGenerados;
    private static int pagoHora;

    // Constructor
    public ActoresDoblaje( int tarifaHora, int capacidadDrive) {
        this.tarifaHora = tarifaHora;
        this.capacidadDrive = capacidadDrive;
        this.doblajesGenerados = 0;
        this.pagoHora = 0;
    }

    // Función para generar guiones según el intervalo
    public void generarDoblajes() {
        if (IsDrivelleno()) {
            System.out.println("Se ha alcanzado la capacidad maxima en el drive");
            }else{
                if (ContadorTiempo.getdiasTranscurridos() % 1 == 0){
                     doblajesGenerados++;
                     doblajesGenerados++;
                     doblajesGenerados++;
                }
            }
    }

    // Función para calcular el pago del guionista por hora trabajada
    public void calcularPagoHora() {
        pagoHora = tarifaHora * ContadorTiempo.getHorasTranscurridas();
    }

    // Función para registrar las horas trabajadas por el guionista

    public boolean IsDrivelleno(){
        return doblajesGenerados >= capacidadDrive;
    }
    public static int getpagoHora(){
        return pagoHora;
    }
}
