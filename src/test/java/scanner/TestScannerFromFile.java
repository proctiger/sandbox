package scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestScannerFromFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		String nomeArquivo = "/Users/williansromera/Desktop/workspace/sandbox/src/test/java/scanner/arquivo.txt";
		File arquivo = new File(nomeArquivo );
		
		Scanner scanner = new Scanner(arquivo);
	
		
		while(scanner.hasNext()){
			System.out.println(scanner.nextLine());
		}
		
		scanner.close();
	}
	
}
