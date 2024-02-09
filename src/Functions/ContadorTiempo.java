/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;

/**
 *
 * @author Abraham Santana
 */
public class ContadorTiempo {

    private static int segundos = 0;
    private static int diasTranscurridos = 0;
    private static int horasTranscurridas = 0;


    public static void iniciarContador(int time) {
        // Bucle infinito para simular el tiempo transcurrido
        if (time == 0) {
        System.out.println("El tiempo no puede ser cero.");
        return; // Salir de la función si time es cero
        
    }   while (true) {
            try {
                // Dormir el hilo durante un segundo
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Incrementar el contador de segundos
            segundos++;

            // Si han pasado x segundos (equivalentes a 1 día), reiniciar el contador de días
            if (segundos % time == 0) {
                int dias = segundos / time;
                diasTranscurridos  = dias;
                System.out.println("Han pasado " + dias + " días.");
            }

            // Imprimir el tiempo transcurrido en segundos
            System.out.println("Tiempo transcurrido: " + segundos + " segundos.");
        }
    }
    
    public void HorasTranscurridas(int time){
        horasTranscurridas = (time)/ 24;
    }

    
    public static int getSegundosTranscurridos() {
        return segundos;
    }
    
    public static int getdiasTranscurridos(){
        return diasTranscurridos ;
    }
    
    public static int getHorasTranscurridas(){
        return horasTranscurridas;
    }
}

