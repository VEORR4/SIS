import java.util.LinkedList;
import java.util.Random;

/**
 * App
 */

public class App { 
    static LinkedList tabela[] = new LinkedList[26];
    
    //def hash()
    public static int hash (String valor) {
        valor = valor.toLowerCase();
        //System.out.println(valor.charAt(0));
        int codigoAscii = valor.charAt(0);
        int resto = (codigoAscii+7)%26;
        //System.out.println(codigoAscii + " " + resto);
        return resto;
    }

    public static void adiciona(String valor){
        int categoria = hash(valor);
        if (tabela[categoria] == null){
            tabela[categoria] = new LinkedList();        
        }
        tabela[categoria].add(valor);
    }   
    
    public static void imprimir() {
        System.out.println("-------------------------------------");
        for (int i = 0; i < tabela.length; i++) {
            LinkedList lista = tabela[i];
            int total = lista.size();
            System.out.println(i + "total: " + total + "->" + lista);
        }
    }

    public static void gerarNomes(int qtdPalavras) {
        Random rnd = new Random();
        for (int i = 0; i < qtdPalavras; i++) {
            int qtdLetras = rnd.nextInt(3, 9);
            String palavra = "";
            for (int j = 0; j < qtdLetras; j++) {
                char letra = (char)(rnd.nextInt(97, 123));
                palavra += letra;
            }
            adiciona(palavra);
        }
    }
        
    
    public static void main(String[] args) {
        gerarNomes(20);
    }
}