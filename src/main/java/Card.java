/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Card {
    private String palo;
    private String color;
    private String valor;
    
    public Card (String palo, String color, String valor){
        this.palo = palo;
        this.color = color;
        this.valor = valor;
                
    }
    
    public String getPalo(){
        return palo;
    }
    
    public String getColor(){
        return color;
    }
    
    public String getValor(){
        return valor;
    }
    
    @Override
    public String toString(){
        return palo + "," + color + "," + valor;
    }
}
