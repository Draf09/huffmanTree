///////////////////////////////////////////////////////
//Adilson Medronha, Rafael Fontana e Nathan Schostack//
///////////////////////////////////////////////////////

import java.util.Hashtable;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class App {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		String nomeArquivo = "texto.txt";
		
		Hashtable<Character,Double> table = new Hashtable<Character,Double>();
		
        addArquivo(table, nomeArquivo);
        
        /*
		table.put('a', 45.0);
		table.put('b', 13.0);
		table.put('c', 12.0);
		table.put('d', 16.0);
		table.put('e', 9.0);
		table.put('f', 5.0);
		*/
        System.out.println("///Frequencia///");
        printFrequencia(table);        
        
		HuffmanEncoding hf = new HuffmanEncoding(table);
        
		System.out.println("///Codigos de Huffman///");
		hf.printEncoding();
		
        codificaArquivo(hf, nomeArquivo);
        decodificaArquivo(hf, "arquivoCodificado.txt");
	}
	
    public static void decodificaArquivo(HuffmanEncoding hf, String nomeArquivo) throws FileNotFoundException {
		Hashtable<String,Character> codigosHuffmanInvertido = new Hashtable<String,Character>();
        for(Character c : hf.codigosHuffman.keySet()){			
			codigosHuffmanInvertido.put(hf.codigosHuffman.get(c), c);
		}
        
        File arquivo = new File(nomeArquivo);
		Scanner inFile = new Scanner(arquivo);
        PrintWriter outPut = new PrintWriter("arquivoDecodificado.txt");
        String str = "";
		while(inFile.hasNextLine()){
            String aux = inFile.nextLine();
            char[] linha = aux.toCharArray();
            int size = linha.length;
            String linhaDecodificada = "";
			for(int i = 0; i < size; i++){
                str = str + Character.toString(linha[i]);
                if(codigosHuffmanInvertido.get(str) != null){
                    linhaDecodificada = linhaDecodificada + codigosHuffmanInvertido.get(str);
                    str = "";
                }
				
            }
            outPut.print(linhaDecodificada);
		}
		outPut.close();
		inFile.close();
    }
    
    public static void codificaArquivo(HuffmanEncoding hf, String nomeArquivo) throws FileNotFoundException {
		File arquivo = new File(nomeArquivo);
		Scanner inFile = new Scanner(arquivo);
		PrintWriter outPut = new PrintWriter("arquivoCodificado.txt");
		while(inFile.hasNextLine()){
			String str = inFile.nextLine();
			char[] linha = str.toCharArray();
			int size = linha.length;
			String linhaCodificada = "";
			for(int i = 0; i < size; i++){
				
			linhaCodificada = linhaCodificada + (hf.codigosHuffman.get(linha[i]));
				
			}
			linhaCodificada = linhaCodificada + hf.codigosHuffman.get('\n');
			outPut.println(linhaCodificada);
		}
		outPut.close();
		inFile.close();
	}
    
    
    public static void addArquivo(Hashtable<Character,Double> table, String nomeArquivo) throws FileNotFoundException {
            
        File arquivo = new File(nomeArquivo);
        Scanner inFile = new Scanner(arquivo);		
		while(inFile.hasNextLine()){
			String str = inFile.nextLine();
			char[] linha = str.toCharArray();
            int size = linha.length;
			for(int i = 0; i < size; i++){
				
				if(table.get(linha[i]) == null){					
					table.put(linha[i], 1.0);
				} else {
                    double num = table.get(linha[i]);
					table.replace(linha[i], num+1);
				}
			}
			if(inFile.hasNextLine()){
                if(table.get('\n') == null){
                    table.put('\n', 1.0);
                } else {
                    double num = table.get('\n');
                    table.replace('\n', num+1);
                }				
            }
        }
		inFile.close();	
    }
    
    public static void printFrequencia(Hashtable<Character,Double> table) {
        
        for(Character c : table.keySet()){			
			System.out.println(c + ": " + table.get(c));			
		}
        
    }
    
}