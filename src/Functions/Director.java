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
public class Director {
    private int tarifaHora = 60;
    private static int pagoHora;
    private int capituloNormalCartoon = Ensambladores.getcapituloNormalCartoon();
    private static int CapListosEntregarNormalesCartoon;
    private int capituloNormalDisney = Ensambladores.getcapituloNormalDisney();
    private static int CapListosEntregarNormalesDisney;
    private int capituloPlosTwistCartoon = Ensambladores.getcapituloPlotTwistCartoon();
    private static int CapListosEntregarPlotTwistCartoon;
    private int capituloPlosTwistDisney = Ensambladores.getcapituloPlotTwistDisney();
    private static int CapListosEntregarPlotTwistDisney;
    private static int Total;
    
    public void entregaCapitulosNormalesCartoon(){
        if (ProjectManager.getcuentaRegresiva()==0){
            if (capituloNormalCartoon >0){
                CapListosEntregarNormalesCartoon++;
            }
        }
    }
    
    public void entregaCapitulosPlotTwistCartoon(){
        if (ProjectManager.getcuentaRegresiva()==0){
            if ( capituloPlosTwistCartoon >0){
                CapListosEntregarPlotTwistCartoon++;
            }
        }
    }
    
    public void entregaCapitulosNormalesDisney(){
        if (ProjectManager.getcuentaRegresiva()==0){
            if (capituloNormalDisney >0){
                CapListosEntregarNormalesDisney++;
            }
        }
    }
    
    public void entregaCapitulosPlotTwistDisney(){
        if (ProjectManager.getcuentaRegresiva()==0){
            if ( capituloPlosTwistDisney >0){
                CapListosEntregarPlotTwistDisney++;
            }
        }
    }
    
    public void Ganancias(){
       int n1 =  CapListosEntregarNormalesCartoon * 300000;
       int n2 =  CapListosEntregarPlotTwistCartoon * 650000;
       int n3 =  CapListosEntregarNormalesDisney * 250000;
       int n4 =  CapListosEntregarPlotTwistDisney * 600000;
       
       Total = n1 + n2+ n3+ n4;
    }
    
    
    public void calcularPagoHora() {
        pagoHora = tarifaHora * ContadorTiempo.getHorasTranscurridas();
    }
    
    public static int getpagoHora(){
        return pagoHora;
    } 
    
    public static int getTotal(){
        return Total;
    }
}




