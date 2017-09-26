/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discoteca;

import java.util.Scanner;

/**
 *
 * @author s_n_a
 */
public class Discoteca {

    public Banda[] arquivo;
    public Disco[] novoDisco;
    public Musica[] musicas;
    
    public Discoteca(){
        arquivo = new Banda[10];
    }
        
    public static void main(String[] args) {
        Discoteca dc = new Discoteca();
        Scanner sc = new Scanner(System.in);
        int opc=0;
        do{
            System.out.println("-------------------------------");            
            System.out.println("Discoteca");
            System.out.println("01 - Inserir dados");
            System.out.println("02 - discografia de uma banda");
            System.out.println("09 - sair");
            System.out.print("Digite a opção: ");
            opc=Integer.parseInt(sc.nextLine());
            
            switch(opc){
                case 1:
                    dc.inserirDados();
                    break;
                case 2:
                    dc.mostrarDiscografia();
                    break;   
                default:
                    break;
            }
            System.out.println("-------------------------------");
        }while(opc!=9);
        
    }

    private void inserirDados() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome da banda "+ (i+1)+": ");
            String nome=sc.nextLine();
            if(nome.equals("")) break;
            arquivo[i] = new Banda();
            arquivo[i].setNomeBanda(nome);
            
            System.out.print("Digite o numero de discos: ");
            int numDisco = Integer.parseInt(sc.nextLine());
            
            for (int j = 0; j < numDisco; j++) {
                novoDisco = new Disco[numDisco];
                novoDisco[j] = new Disco();
                
                System.out.print("Digite o ano do disco: ");
                novoDisco[j].setAno(Integer.parseInt(sc.nextLine()));
                System.out.print("Digite o nome do disco: ");
                novoDisco[j].setNomeDisco(sc.nextLine());
                
                
                System.out.print("Digite o numero de faixas do disco: ");
                int numFaixas = Integer.parseInt(sc.nextLine());
                
                for (int k = 0; k < numFaixas; k++) {
                    musicas = new Musica[numFaixas];
                    musicas[k] = new Musica();                   
                    musicas[k].setFaixa(k+1);
                    System.out.print("Digite o nome da musica da faixa "+musicas[k].getFaixa()+": ");
                    musicas[k].setNomeMusica(sc.nextLine());                    
                    novoDisco[j].setMusicas(musicas);
                }
                arquivo[i].setDiscos(novoDisco);
            }            
        }
    }

    private void mostrarDiscografia() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome da banda: ");
        String banda=sc.nextLine();
        for (int i = 0; i < 10; i++) {
            if(arquivo[i]==null) break;
            if(arquivo[i].getNomeBanda().equals(banda)){
                arquivo[i].imprimeBanda(arquivo[i]);
                return;
            }    
            
        }
        System.out.println("Banda não encontrada");    
    }
    
}
