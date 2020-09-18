/////////////////////////////////////////////////////////////////////
//Adilson Medronha, Felipe Ferro, Rafael Fontana e Nathan Schostack//
/////////////////////////////////////////////////////////////////////

import java.util.Hashtable;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Frequencia {

    public Frequencia(String string) {
	}

	public Hashtable<Character,Double> Frequencia(String nomeArquivo) throws FileNotFoundException{        
        
        Hashtable<Character,Double> table = new Hashtable<Character,Double>();
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
        return table;
    }

	public static Object expand() {
		return null;
	}
    
}