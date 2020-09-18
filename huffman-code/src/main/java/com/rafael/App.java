/////////////////////////////////////////////////////////////////////
//Adilson Medronha, Felipe Ferro, Rafael Fontana e Nathan Schostack//
/////////////////////////////////////////////////////////////////////

import java.util.Hashtable;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
	
	public static void main(String[] args) throws FileNotFoundException {
		Frequencia f = new Frequencia("../texto1.txt");
		System.out.println(f);
		

	}
}