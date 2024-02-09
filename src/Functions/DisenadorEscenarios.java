/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;

/**
 *
 * @author santi
 */
public class DisenadorEscenarios {
    private int tarifaHora = 26;
    private int capacidadDrive = 20;
    private int escenariosGenerados;
    private static int pagoHora;

    // Constructor
    public DisenadorEscenarios( int tarifaHora, int capacidadDrive) {
        this.tarifaHora = tarifaHora;
        this.capacidadDrive = capacidadDrive;
        this.escenariosGenerados = 0;
        this.pagoHora = 0;
    }

    // Función para generar guiones según el intervalo
    public void generarEscenario() {
        if (IsDrivelleno()) {
            System.out.println("Se ha alcanzado la capacidad maxima en el drive");
            }else{
                if (ContadorTiempo.getdiasTranscurridos() % 2 == 0){
                     escenariosGenerados++;
                }
            }
    }

    // Función para calcular el pago del guionista por hora trabajada
    public void calcularPagoHora() {
        pagoHora = tarifaHora * ContadorTiempo.getHorasTranscurridas();
    }
    
    public boolean IsDrivelleno(){
        return escenariosGenerados >= capacidadDrive;
    }
    public static int getpagoHora(){
        return pagoHora;
    }
}
