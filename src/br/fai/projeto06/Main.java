package br.fai.projeto06;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}

	private void start() {
		//String[]carros = {"civic", "gol", "palio", "uno"}; o professor declarou assim
							//0,       1,     2,       3
	String array[] = new String[4];
        
        array[0] = "civic";
        array[1] = "gol";
        array[2] = "palio";
        array[3] = "uno";
        
        for (String iteracao : array) {        	
        	
        	System.out.println("Nome do carro: "+iteracao);
        	
		}
        
        System.out.println("\n----------------------\n");
        array[1] = "L200";
        for (String iteracao : array) {
        	
            System.out.println("Nome do carro: "+iteracao);
		}
        
        System.out.println("\n----------------------\n");
        
       int tamanhoNovoArray = array.length+1;
       String[] novoArray=
    		   new String[tamanhoNovoArray];
       int j=0;
       while (j < array.length) {
           String iteracao = array[j];
           novoArray[j] = iteracao;
           j++;
       }
       
       novoArray[tamanhoNovoArray - 1] = "Gol";
       for (String iteracao : novoArray) {

           System.out.println("Nome do carro: " + iteracao);
       }


	  }        
	

}
