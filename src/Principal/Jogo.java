package Principal;

import java.util.Scanner;
import modelo.Baralho;
import modelo.Jogador;

public class Jogo {
    private Scanner entrada;
    private Baralho baralho;
    private Jogador [] jogadores;
    
    public Jogo(){
        
        baralho = new Baralho();
        baralho.mostrarBaralho();
        baralho.embaralhar();
        baralho.mostrarBaralho();
        
        entrada = new Scanner(System.in);
        
    }
    
    public void iniciarJogo(){
        
        
        System.out.println("Quantos jogadores irão participar ? (máximo de 7 jogadores)");
        int qtdJogadores = entrada.nextInt();
        
        jogadores = new Jogador[qtdJogadores];    
        if (jogadores.length<8){
        for (int i = 0; i < jogadores.length; i++) {
            System.out.println("Jogador " + (i+1) + " Digite seu nome:");   
            jogadores[i] = new Jogador(entrada.next());
        }
        
        }else{
                System.out.println("A quantidade máxima é de 7 jogadores");
        }
        
    }
    
    public void distribuirCartas(int qtd){
        System.out.println("\nDISTRIBUINDO BARALHO\n");
        for (Jogador j : jogadores) {
            j.setCartas(baralho.distibruirCartas(qtd));
          
        }
        
    }
    
    public void mostrarCartas(){
        
        for (Jogador j : jogadores) {
            j.mostrarCartas();
        }
  
    }
    
    
    public static void main(String[] args) {
        Jogo jogador1 = new Jogo();
        jogador1.iniciarJogo();
        jogador1.distribuirCartas(7);
        jogador1.mostrarCartas();
    }
}
