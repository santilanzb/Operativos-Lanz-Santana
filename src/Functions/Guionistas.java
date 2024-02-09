/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;

/**
 *
 * @author santi
 */
public class Guionistas {
    private int tarifaHora = 20;
    private int capacidadDrive = 25;
    private int guionesGenerados;
    private int horasTrabajadas;

    // Constructor
    public Guionistas( int tarifaHora, int capacidadDrive) {
        this.tarifaHora = tarifaHora;
        this.capacidadDrive = capacidadDrive;
        this.guionesGenerados = 0;
        this.horasTrabajadas = 0;
    }

    // Función para generar guiones según el intervalo
    public void generarGuiones() {
        if (IsDrivelleno()) {
            System.out.println("Se ha alcanzado la capacidad maxima en el drive");
            }else{
                guionesGenerados++;
            }
    }

    // Función para calcular el pago del guionista por hora trabajada
    public void calcularPagoHora() {
        
    }

    // Función para registrar las horas trabajadas por el guionista
    public void registrarHorasTrabajadas(int horas) {
        horasTrabajadas += horas;
    }
    public boolean IsDrivelleno(){
        return guionesGenerados >= capacidadDrive;
    }
}
            
