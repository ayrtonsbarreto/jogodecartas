package modelo;

import java.util.Random;

public class Baralho {
    private Carta [] cartas;
    private Random aleatorio;
    private int contador = 0;
    
     public Baralho(){
        
        String[] faces = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] naipes = {"Copas","Ouros","Paus","Espadas"};
        
        cartas = new Carta[52];
        aleatorio = new Random();
        

        for (String naipe : naipes) {
            for (String face : faces) {
                cartas[contador] = new Carta(face, naipe);
                contador++;
            }
        }
        contador = 0;
    }
        
    public void mostrarBaralho(){
        
        System.out.println("APRESENTANDO BARALHO");
        for (Carta c : cartas) {
            System.out.println(c.toString());
           
        }
    }
    
    public void embaralhar(){
        
        System.out.println("\nEMBARALHANDO CARTAS\n");
       
        for(int i = 0; i<cartas.length; i++){
            
            int num1 = aleatorio.nextInt(cartas.length);
            int num2 = aleatorio.nextInt(cartas.length);
            
            cartas[i] = cartas[num1];
            cartas[num1] = cartas[num2];
            cartas[num2] = cartas[i];
            
        }
        
    }
    
    public Carta[] distibruirCartas(int qtd){
        
        Carta[] cartasDist = new Carta[qtd];
        
        for (int i = 0; i < cartasDist.length; i++) {
            
            cartasDist[i] = cartas[contador];
            contador++;
            
        }
        
        return cartasDist;
    }
    
    public Carta[] getCartas(){
        return cartas;
    }
}
