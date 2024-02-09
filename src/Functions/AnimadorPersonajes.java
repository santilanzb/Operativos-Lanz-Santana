/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;

/**
 *
 * @author santi
 */
public class AnimadorPersonajes {
     private int tarifaHora = 40;
    private int capacidadDrive = 55;
    private static int animacionesGenerados;
    private static int pagoHora;

    // Constructor
    public AnimadorPersonajes( int tarifaHora, int capacidadDrive) {
        this.tarifaHora = tarifaHora;
        this.capacidadDrive = capacidadDrive;
        this.animacionesGenerados = 0;
        this.pagoHora = 0;
    }

    // Función para generar guiones según el intervalo
    public void generarAnimaciones() {
        if (IsDrivelleno()) {
            System.out.println("Se ha alcanzado la capacidad maxima en el drive");
            }else{
                if (ContadorTiempo.getdiasTranscurridos() % 1 == 0){
                     animacionesGenerados++;
                     animacionesGenerados++;
                     animacionesGenerados++;
                }
            }
    }

    // Función para calcular el pago del guionista por hora trabajada
    public void calcularPagoHora() {
        pagoHora = tarifaHora * ContadorTiempo.getHorasTranscurridas();
    }
    
    public boolean IsDrivelleno(){
        return animacionesGenerados >= capacidadDrive;
    }
    public static int getpagoHora(){
        return pagoHora;
    }
    public static int getanimacionesGenerados(){
        return animacionesGenerados;
    }
}
