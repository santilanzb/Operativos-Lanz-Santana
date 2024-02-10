/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author santi
 */
public class Guionistas {
    private int tarifaHora = 20;
    private int capacidadDrive = 25;
    private static int guionesGenerados;
    private static int pagoHora;

    // Constructor
    public Guionistas( int tarifaHora, int capacidadDrive) {
        this.tarifaHora = tarifaHora;
        this.capacidadDrive = capacidadDrive;
        this.guionesGenerados = 0;
        this.pagoHora = 0;
    }

    // Función para generar guiones según el intervalo
    public void generarGuiones() {
        if (IsDrivelleno()) {
            System.out.println("Se ha alcanzado la capacidad maxima en el drive");
            }else{
                if (ContadorTiempo.getdiasTranscurridos() % 2 == 0){
                     guionesGenerados++;
                }
            }
    }

    // Función para calcular el pago del guionista por hora trabajada
    public void calcularPagoHora() {
        pagoHora = tarifaHora * ContadorTiempo.getHorasTranscurridas();
    }

    // Función para registrar las horas trabajadas por el guionista

    public boolean IsDrivelleno(){
        return guionesGenerados >= capacidadDrive;
    }
    public static int getpagoHora(){
        return pagoHora;
    }
    public static int getguionesGenerados(){
        return guionesGenerados;
    }
}
            
