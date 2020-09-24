package Contador;

import java.util.Scanner;

public class FIFO {
	
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Introduce el numero de procesos: ");
			int num=sc.nextInt();
			
			int duracion[]=new int[num];
			
			
			for(int i=0;i<num;i++)
			{
				System.out.println("Indica la duracion del proceso "+(i+1)+": ");
				 duracion[i]=sc.nextInt();
			}
			
			
			int tEspera[]=new int[num];
			
			
			tEspera[0]=0;
			
			
			int tiempo_espera=0;
			
			for(int i=1;i<num;i++)
			{
				tiempo_espera+=duracion[i-1];
				tEspera[i]=tiempo_espera;
			}
			
		
			
			System.out.println("Proceso\t\tDuracion\t\tTiempo de espera");
			
		
			float total=0;
			
			for(int i=0;i<num;i++)
			{
				System.out.println("p"+(i+1)+"\t\t\t"+duracion[i]+"\t\t\t"+tEspera[i]);
				total+=tEspera[i];
			}
			
			System.out.println("El tiempo promedio es de: "+(total/num)+"ms");
			
			
		}
		
	}


