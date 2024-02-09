/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;

/**
 *
 * @author santi
 */
public class ProjectManager {
    private int tarifaHora = 40;
    private static int pagoHora;
    private static int cuentaRegresiva;
    
    
    
    public void ContadorEntrega(int deadline){
        while(deadline > 0 ){
        int contador = deadline;    
        if(ContadorTiempo.getHorasTranscurridas() % 24 == 0){
            while (contador >0){
            contador -= 1;
            cuentaRegresiva = contador;
            ContadorEntrega(contador);
            }
        }
        } ContadorEntrega(deadline); 
    }
    
    public void Anime(){
        if (ContadorTiempo.getMinutosTranscurridos()%30 ==0){
            System.out.println("El Proyect Manager esta viendo anime");
        } else {
            System.out.println("El Proyect Manager esta revisando el avance del proyecto");
        }
    }
            
    public static int RegistrarDias(){
        return ContadorTiempo.getdiasTranscurridos();
    }
    
    public void calcularPagoHora() {
        pagoHora = tarifaHora * ContadorTiempo.getHorasTranscurridas();
    }
    
    public static int getpagoHora(){
        return pagoHora;
    }
    
    public static int getcuentaRegresiva(){
        return cuentaRegresiva;
    }
}


