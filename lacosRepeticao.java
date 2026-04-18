public class lacosRepeticao {
	public static void main(String[] args) {
		//for (int i = 0; i < 5; i++) {  // ele cria uma variável dizendo que o valor dela é = 0, depois analisa se a variável é menor do que 5, e depois faz o incremento.
    	//	System.out.println(i);  // aqui ele imprime de 0 a 5.
//} 
		//int j = 0;  
		//while (j < 5) { // aqui ele verifica se a variável é menor que 5, se for, ele executa até o número 4, porque 5 não é menor, ele é igual. Se não, não acontece nada.  
    	//	System.out.println(j);  
    	//	j++;  
//} 
		//int k = 0;  
		//do { 
    	//	System.out.println(k); // aqui ele primeiro imprime o valor da variável, faz o incremento e só depois verifica se é menor do que 5.
    	//	k++;  
		//} while (k < 5); 

		//for (int i = 0; i < 10; i++) {  
		//	if (i == 5) {  
		//		break; // Sai do loop quando i é igual a 5  
    	//	}  
    	//	System.out.println(i);  
    	//}

    	for (int j = 0; j < 10; j++) {  
			if (j == 5) {  
				continue; // Ou seja, ele determinou o valor da variável, verificou se é menor do que 10, fez incrementação e verificou de é menor que 5. Como 5 é igual, ele pulou.
			} 
    		System.out.println(j);  
    	}
	}
}