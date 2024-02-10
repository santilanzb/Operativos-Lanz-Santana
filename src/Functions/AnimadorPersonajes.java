package Functions;

import java.util.concurrent.Semaphore;

public class AnimadorPersonajes extends Thread {

    private int tarifaHora = 40;
    private int capacidadDrive = 55;
    private static int animacionesGenerados;
    private static int pagoHora;
    private Semaphore semaphore;

    // Constructor
    public AnimadorPersonajes(int tarifaHora, int capacidadDrive, Semaphore semaphore) {
        this.tarifaHora = tarifaHora;
        this.capacidadDrive = capacidadDrive;
        this.animacionesGenerados = 0;
        this.pagoHora = 0;
        this.semaphore = semaphore;
    }

    // Override the run method of Thread class
    @Override
    public void run() {
        while (true) {
            try {
                // Acquire the semaphore permit
                semaphore.acquire();
                // Generate animations
                generarAnimaciones();
                // Release the semaphore permit
                semaphore.release();
                // Sleep for some time
                sleep(1000); // Adjust as needed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Function to generate animations
    public void generarAnimaciones() {
        if (IsDrivelleno()) {
            System.out.println("Se ha alcanzado la capacidad máxima en el drive");
        } else {
            if (ContadorTiempo.getdiasTranscurridos() % 1 == 0) {
                animacionesGenerados += 3;
            }
        }
    }

    // Function to calculate the payment per hour
    public void calcularPagoHora() {
        pagoHora = tarifaHora * ContadorTiempo.getHorasTranscurridas();
    }

    // Function to check if the drive is full
    public boolean IsDrivelleno() {
        return animacionesGenerados >= capacidadDrive;
    }

    public static int getpagoHora() {
        return pagoHora;
    }

    public static int getanimacionesGenerados() {
        return animacionesGenerados;
    }
}