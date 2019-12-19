
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.min;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lex_s
 */
public class teste {
    public static void main(String[] args) throws IOException {
        //String name = "Alex";        
        //System.out.println(name.toUpperCase());
        //Animal animal = new  Animal();
        //System.out.println(animal.animal());
        String newLine = System.getProperty("line.separator");
        Character personagem = new Character();
        Character adversario = new Character();
        
         BufferedReader reader =
                   new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Informe seu nome");  
        String nome = reader.readLine();
        System.out.println("Informe seu ataque");  
        String ataque = reader.readLine();
        System.out.println("Informe sua defesa");  
        String defesa = reader.readLine();
        System.out.println("Informe sua vida");  
        String vida = reader.readLine();   
        personagem.criarCharacter(nome, ataque, defesa, vida);
        //
        double atk = (Math.random() * ((10 - 1) + 1)) + 1;
        double def = (Math.random() * ((10 - 1) + 1)) + 1;
        double lif = (Math.random() * ((50 - 15) + 1)) + 15;
        adversario = adversario.criarCharacter("Bot", atk, def, lif);
        
        System.out.println(adversario.nome + " - Ataque: " + adversario.ataque + newLine + 
                "Defesa: " + adversario.defesa + newLine + "Vida: " +
                adversario.vida);  
    }
    

    
    
}
