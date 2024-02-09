/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;

/**
 *
 * @author santi
 */
public class GuionistasPlotTwist {
     private int tarifaHora = 16;
    private int capacidadDrive = 35;
    private static int plotTwistGenerados;
    private static int pagoHora;

    // Constructor
    public GuionistasPlotTwist( int tarifaHora, int capacidadDrive) {
        this.tarifaHora = tarifaHora;
        this.capacidadDrive = capacidadDrive;
        this.plotTwistGenerados = 0;
        this.pagoHora = 0;
    }

    // Función para generar guiones según el intervalo
    public void plotTwistDoblajes() {
        if (IsDrivelleno()) {
            System.out.println("Se ha alcanzado la capacidad maxima en el drive");
            }else{
                if (ContadorTiempo.getdiasTranscurridos() % 3 == 0){
                     plotTwistGenerados++;
                }
            }
    }

    // Función para calcular el pago del guionista por hora trabajada
    public void calcularPagoHora() {
        pagoHora = tarifaHora * ContadorTiempo.getHorasTranscurridas();
    }

    // Función para registrar las horas trabajadas por el guionista

    public boolean IsDrivelleno(){
        return plotTwistGenerados >= capacidadDrive;
    }
    public static int getpagoHora(){
        return pagoHora;
    }
    public static int getplotTwistGenerados(){
        return plotTwistGenerados;
    }
}
