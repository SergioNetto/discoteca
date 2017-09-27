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
public class Banda {
    private String nomeBanda;
    private Disco[] discos;
    
    public void imprimeBanda(Banda banda){
        System.out.println("-------------------------------");                
        System.out.println("-------------------------------");
        System.out.println("Banda: "+(banda.getNomeBanda()));
      
        for (Disco obj : discos) {
            if (obj!=null){
                System.out.println("-------------------------------");
                System.out.println("Ano: " + obj.getAno() + "   Disco: " + obj.getNomeDisco());
                obj.imprimeDisco(obj); 
            }
        }
               
    }

    public String getNomeBanda() {
        return nomeBanda;
    }

    public void setNomeBanda(String nomeBanda) {
        this.nomeBanda = nomeBanda;
    }

    public Disco[] getDiscos() {
        return discos;
    }

    public void setDiscos(Disco[] discos) {
        this.discos = discos;
    }

    
}
