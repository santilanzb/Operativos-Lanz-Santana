/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;

import javax.swing.JLabel;

/**
 *
 * @author fabriziospiotta
 */
public class Drive {
    
    private int guiones;
    private int escenarios;
    private int animaciones;
    private int doblajes;
    private int guionPlotTwist;
    private int capitulos;
    private int counterForPT;
    private int plotwist;
    private int [] necessities; 
    private Company company;
    private JLabel [] labels;

    public Drive(int [] necessities, Company company) {
        this.guiones = 0;
        this.escenarios = 0;
        this.animaciones = 0;
        this.doblajes = 0;
        this.guionPlotTwist = 0;
        this.capitulos = 0;
        this.plotwist = 0;
        this.counterForPT = 0;
        this.necessities = necessities;
        this.company = company;
    }
    
    public void addPart(int type, int quantityWorkers) {
        if (type == 0 && this.getGuiones() < 25){
            int calc = this.getGuiones() + (1 * quantityWorkers);
            if (calc < 25) {
                this.setGuiones(calc);
            } else {
                this.setGuiones(25);
            }
            this.labels[type].setText(Integer.toString(this.getGuiones()));
        }
        else if (type == 1 && this.getEscenarios() < 20){
            int calc = this.getEscenarios() + (1 * quantityWorkers);
            if (calc < 20) {
                this.setEscenarios(calc);
            } else {
                this.setEscenarios(20);
            }
            this.labels[type].setText(Integer.toString(this.getEscenarios()));
        }
        else if (type == 2 && this.getAnimaciones() < 55){
            int calc = this.getAnimaciones() + (3 * quantityWorkers);
            if (calc < 55) {
                this.setAnimaciones(calc);
            } else {
                this.setAnimaciones(55);
            }
            this.labels[type].setText(Integer.toString(this.getAnimaciones()));
        }
        else if (type == 3 && this.getDoblajes() < 35){
            int calc = this.getDoblajes() + (3 * quantityWorkers);
            if (calc < 35) {
                this.setDoblajes(calc);
            } else {
                this.setDoblajes(35);
            }
            this.labels[type].setText(Integer.toString(this.getDoblajes()));
        }
        else if (type == 4 && this.getGuionPlotTwist() < 10){
            int calc = this.getGuionPlotTwist() + (1 * quantityWorkers);
            if (calc < 10) {
                this.setGuionPlotTwist(calc);
            } else {
                this.setGuionPlotTwist(10);
            }
            this.labels[type].setText(Integer.toString(this.getGuionPlotTwist()));
        }
        check();
    }
    
    public void addChapter(int quantityAssemblers){
        int quantityChapters = quantityAssemblers;
        
        // Guiones
        int quantity = calculatePossibleChapters(guiones, 0);
        if (quantity < quantityChapters){
            quantityChapters = quantity;
        }
        
        // Escenarios
        quantity = calculatePossibleChapters(escenarios, 1);
        if (quantity < quantityChapters){
            quantityChapters = quantity;
        }
        
        // Animaciones
        quantity = calculatePossibleChapters(animaciones, 2);
        if (quantity < quantityChapters){
            quantityChapters = quantity;
        }
        
        // Doblajes
        quantity = calculatePossibleChapters(doblajes, 3);
        if (quantity < quantityChapters){
            quantityChapters = quantity;
        }
        
        
        // Final
        /*
        if (quantityChapters > quantityAssemblers){
            quantityChapters = quantityAssemblers;
        }
        */
        
        
        guiones -= (necessities[0]*quantityChapters);
        this.labels[0].setText(Integer.toString(this.getGuiones()));
        escenarios -= (necessities[1]*quantityChapters);
        this.labels[1].setText(Integer.toString(this.getEscenarios()));
        animaciones -= (necessities[2]*quantityChapters);
        this.labels[2].setText(Integer.toString(this.getAnimaciones()));
        doblajes -= (necessities[3]*quantityChapters);
        this.labels[3].setText(Integer.toString(this.getDoblajes()));
        
        
        while (counterForPT >= necessities[5] && guionPlotTwist >= necessities[4] && quantityChapters > 0){
            plotwist += 1;
            guionPlotTwist -= necessities[4];
            counterForPT -= necessities[5];
            quantityChapters -= 1;
        }        
        this.labels[4].setText(Integer.toString(this.getGuionPlotTwist()));
        capitulos += quantityChapters;
        counterForPT += quantityChapters;
        
        this.labels[5].setText(Integer.toString(capitulos));
        this.labels[6].setText(Integer.toString(plotwist));
        
    }
    
    public boolean check(){
        boolean ready = false;
        if (guiones >= necessities[0] &&  escenarios >= necessities[1] && animaciones >= necessities[2] && doblajes >= necessities[3]){
            ready= true;
        } 
        
        return ready;
    }
    
    public int calculatePossibleChapters(int value, int type){
        int cantidad = value;
        int quantity = 0;
        while (cantidad > 0){
            int resto = cantidad - necessities[type];
            if (resto >= 0){
                quantity += 1;
            }
            cantidad = resto;
        }
        
        return quantity;
    }
    
    public void sendChapters() {
        this.company.setGanancias(this.company.getGanancias() + (this.company.getChapterPrice()*capitulos));
        this.company.setGanancias(this.company.getGanancias() + this.company.getPtPrice()*plotwist);
        this.labels[7].setText(Integer.toString(this.company.getGanancias()));
        capitulos = 0;
        plotwist = 0;
        this.labels[5].setText(Integer.toString(capitulos));
        this.labels[6].setText(Integer.toString(plotwist));
    }
   
   
    /**
     * @return the guiones
     */
    public int getGuiones() {
        return guiones;
    }

    /**
     * @param guiones the guiones to set
     */
    public void setGuiones(int guiones) {
        this.guiones = guiones;
    }

    /**
     * @return the animaciones
     */
    public int getAnimaciones() {
        return animaciones;
    }

    /**
     * @param animaciones the animaciones to set
     */
    public void setAnimaciones(int animaciones) {
        this.animaciones = animaciones;
    }

    /**
     * @return the escenarios
     */
    public int getEscenarios() {
        return escenarios;
    }

    /**
     * @param escenarios the escenarios to set
     */
    public void setEscenarios(int escenarios) {
        this.escenarios = escenarios;
    }

    /**
     * @return the doblajes
     */
    public int getDoblajes() {
        return doblajes;
    }

    /**
     * @param doblajes the doblajes to set
     */
    public void setDoblajes(int doblajes) {
        this.doblajes = doblajes;
    }

    /**
     * @return the guionPlotTwist
     */
    public int getGuionPlotTwist() {
        return guionPlotTwist;
    }

    /**
     * @param guionPlotTwist the guionPlotTwist to set
     */
    public void setGuionPlotTwist(int guionPlotTwist) {
        this.guionPlotTwist = guionPlotTwist;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }

    public int getPlotwist() {
        return plotwist;
    }

    public void setPlotwist(int plotwist) {
        this.plotwist = plotwist;
    }


    public int[] getNecessities() {
        return necessities;
    }

    public void setNecessities(int[] necessities) {
        this.necessities = necessities;
    }

    public JLabel[] getLabels() {
        return labels;
    }

    public void setLabels(JLabel[] labels) {
        this.labels = labels;
    }
       
}
