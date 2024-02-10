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
public class Ensambladores {
    private int tarifaHora = 50;
    private static int capituloNormalCartoon;
    private static int capituloNormalDisney;
    private static int pagoHora;
    private int guionesGenerados = Guionistas.getguionesGenerados();
    private int escenariosGenerados = DisenadorEscenarios.getescenariosGenerados();
    private int animacionesGenerados = AnimadorPersonajes.getanimacionesGenerados();
    private int doblajesGenerados = ActoresDoblaje.getdoblajesGenerados();
    private static int capituloPlotTwistCartoon;
    private static int capituloPlotTwistDisney;

    // Constructor
    public Ensambladores( int tarifaHora) {
        this.tarifaHora = tarifaHora;
        this.capituloNormalCartoon = 0;
        this.capituloNormalDisney = 0;
        this.pagoHora = 0;
        this.capituloPlotTwistCartoon = 0;
        this.capituloPlotTwistDisney = 0;
    }

    // Función para generar guiones según el intervalo
    public void CapituloNormalCartoon() {
        if(guionesGenerados >=1 && escenariosGenerados >=2 && animacionesGenerados >=6 && doblajesGenerados >=5){
            if (ContadorTiempo.getdiasTranscurridos() % 2 ==0){
                capituloNormalCartoon++;
                guionesGenerados = guionesGenerados -1; 
                escenariosGenerados = escenariosGenerados -2;
                animacionesGenerados = animacionesGenerados -6;
                doblajesGenerados = doblajesGenerados -5;
            }
        }
    }
    
    public void CapituloNormalDisney() {
        if(guionesGenerados >=1 && escenariosGenerados >=1 && animacionesGenerados >=2 && doblajesGenerados >=4){
            if (ContadorTiempo.getdiasTranscurridos() % 2 ==0){
                capituloNormalDisney++;
                guionesGenerados = guionesGenerados -1; 
                escenariosGenerados = escenariosGenerados -1;
                animacionesGenerados = animacionesGenerados -2;
                doblajesGenerados = doblajesGenerados -4;
            }
        }
    }
    
    public void CapituloPlotTwistCartoon(){
        if (capituloNormalCartoon %3 ==0){
            capituloPlotTwistCartoon++;
        }
    }
    
    public void CapituloPlotTwistDisney(){
        if (capituloNormalDisney %3 ==0){
            capituloPlotTwistDisney++;
        }
    }

    // Función para calcular el pago del guionista por hora trabajada
    public void calcularPagoHora() {
        pagoHora = tarifaHora * ContadorTiempo.getHorasTranscurridas();
    }

    // Función para registrar las horas trabajadas por el guionista


    public static int getpagoHora(){
        return pagoHora;
    }
    
    public static int getcapituloNormalCartoon(){
        return capituloNormalCartoon;
    }
    
    public static int getcapituloPlotTwistCartoon(){
        return capituloPlotTwistCartoon;
    }
    
     public static int getcapituloNormalDisney(){
        return capituloNormalDisney;
    }
    
    public static int getcapituloPlotTwistDisney(){
        return capituloPlotTwistDisney;
    }
}
