package com;

import java.util.Scanner;

//1. Realiza un programa, valida si es una fecha válida y formato.
//Formato esperado dd/MM/yyyy
//Entradas: 45/13/2002, 03/02/2001, 01/20/2010, 02-04-2010

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int dia, mes, ano;
		
		System.out.println("Ingrese una fecha!");
		System.out.println("Ingrese el dia:");
		dia = entrada.nextInt();
		System.out.println("Ingrese el mes:");
		mes = entrada.nextInt();
		System.out.println("Ingrese el año:");
		ano = entrada.nextInt();
		
		if((dia>=1) && (dia<=30)) {
			
			if((mes>=1) && (mes<=12)) {
				
				if(ano!=0) {
					System.out.println("Fecha correcta!");
					System.out.println(dia+"/"+mes+"/"+ano);
				}
				else {
					System.out.println("Fecha incorrecta el ano " +ano+ " no existe");
				}
				
			}
			else {
				System.out.println("Fecha incorrecta el mes " +mes+ " no existe");
			}
			
		}
		else {
			System.out.println("Fecha incorrecta el dia " +dia+ " no existe");
		}

	}

}
