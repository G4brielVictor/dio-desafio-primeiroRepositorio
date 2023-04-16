package Carro;

public class Carro {
     private String modelo; 
     private int ano;
     private String cor; 
     private int velocidade;

     public void carro(String modelo, int ano, String cor) {
         this.modelo = modelo;
         this.ano = ano;
         this.cor = cor;
         this.velocidade = 0; 
     }

     public void acelerar(int valor) {
        this.velocidade += valor;
         System.out.println("O carro está acelerando a" + this.velocidade + "km/h");
     }

     public void frear() {
         System.out.println("O carro freiou");
     }

     public void girar() {
         System.out.println("O carro girou para ");
     }
}