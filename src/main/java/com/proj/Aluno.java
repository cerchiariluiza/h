package com.proj;

public class Aluno {
	
	public int getNotaDoAluno(int a, int b) {
		
		if(b == 0) {
			b =1;
			
			
			
		}
		// FIXME ajuste na divisao por zero
		int nota = a /b;
		
		return nota;
		
	}
	
	

}
