/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lex_s
 */
public class Character {
    
    public String nome;
    public int ataque;
    public int defesa;
    public int vida;    
    
    public Character criarCharacter(String nome, String ataque, String defesa, String vida )
    {  
        Character personagem = new Character();
        personagem.nome = nome;
        personagem.ataque =  Integer.parseInt(ataque);
        personagem.defesa = Integer.parseInt(defesa);
        personagem.vida = Integer.parseInt(vida);
        return personagem;
    }   
    
        public Character criarCharacter(String nome, double ataque, double defesa, double vida )
    {  
        Character personagem = new Character();
        personagem.nome = nome;
        personagem.ataque =  (int)ataque;
        personagem.defesa = (int)defesa;
        personagem.vida = (int)vida;
        return personagem;
    } 

}
