/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import Functions.ContadorTiempo;
import Windows.Interfaz;

/**
 *
 * @author santi
 */
public class Main {
    
    public static void main(String[] args){
        
        Interfaz fw = new Interfaz();
        fw.setVisible(true);
        fw.setLocationRelativeTo(null);
        
        ContadorTiempo.iniciarContador(Interfaz.ReturnTime());
    }
}
