package modelo;

public class Jogador {
    private String nome;
    private Carta [] cartas;

    public Jogador(String nome) {
        this.nome = nome;
        cartas = new Carta[7];
    }

    public void setCartas(Carta[] cartas) {
        this.cartas = cartas;
    }

    public String getNome() {
        return nome;
    }
    
    public void mostrarCartas(){
        
        System.out.println("");
        System.out.println("CARTAS DO JOGADOR " + nome);
        
        for(Carta c: cartas){
            System.out.println(c.toString());
        }
    }
}