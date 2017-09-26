/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discoteca;

/**
 *
 * @author s_n_a
 */
public class Disco {

    private int ano;
    private String nomeDisco;
    private Musica[] musicas;
    
    
    public void imprimeDisco(Disco disco){
        System.out.println("-------------------------------");
        for (Musica obj : musicas) {
            if(obj!=null){
                System.out.print("Faixa: " + obj.getFaixa());
                System.out.println("   Nome: " + obj.getNomeMusica());
            }
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNomeDisco() {
        return nomeDisco;
    }

    public void setNomeDisco(String nomeDisco) {
        this.nomeDisco = nomeDisco;
    }

    public Musica[] getMusicas() {
        return musicas;
    }

    public void setMusicas(Musica[] musicas) {
        this.musicas = musicas;
    }
}
