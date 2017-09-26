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
        int tam = banda.discos.length;
        int cont=0;
        do{
            System.out.println("-------------------------------");
            System.out.println("Ano: " + banda.discos[cont].getAno() + "   Disco: " + banda.discos[cont].getNomeDisco());
            banda.discos[cont].imprimeDisco(banda.discos[cont]);
            cont++;
        }while (cont<tam);
               
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
