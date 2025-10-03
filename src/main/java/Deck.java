/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */

import java.util.*;


public class Deck {
    private List<Card> cards = new ArrayList<>();
    
    public Deck(){
        String[] palos = {"Treboles", "Corazones", "Picas","Diamantes"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};
        
        for (String palo : palos){
            String color;
            if(palo.equals("Corazones")|| palo.equals("Diamantes")){
                color = "Rojo";
            }else {
                color = "Negro";
            }
            
            for(String valor : valores){
                cards.add(new Card(palo, color, valor));
            } 
        }
    }
    
    public void shuffle(){
        Collections.shuffle(cards);
        System.out.println("Se mezclo el Deck");
    }
    
    public void head (){
        try{
        if (!cards.isEmpty()){
            throw new NoSuchElementException("El deck esta vacio.");
        }
            Card card = cards.remove(0);
            System.out.println(card.toString());
            System.out.println("Quedan" + cards.size()+ "cartas en el deck");
        }catch (NoSuchElementException e) {
            System.out.println("Error:"+ e.getMessage());
        }
    }
    
    public void pick(){
        try{
        if(cards.isEmpty()){
            throw new NoSuchElementException("El deck esta vacio.");
        }
            Random rand = new Random();
            int index = rand.nextInt(cards.size());
            Card card = cards.remove(index);
            System.out.println(card.toString());
            System.out.println("Quedan" + cards.size()+ "cartas en el deck");
        }catch(NoSuchElementException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
    
    public void hand(){
        try{
        if (cards.size() <5){
            throw new IllegalStateException("No hay suficientes cartas para una mano.");
        }
            for(int i=0; i<5; i++){
                Card card = cards.remove(0);
                System.out.println(card.toString());
            }
            System.out.println("Quedan" + cards.size()+ "cartas en el deck");
        }catch(IllegalStateException e){
            System.out.println("Error:" + e.getMessage());
        }
    }
}
