package Contador;

import java.util.Scanner;

public class SJF {
	
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		
		System.out.println("Indica el numero de procesos: ");
		int num=in.nextInt();
		
		int duracion[]=new int[num];
		
		for(int i=0;i<num;i++)
		{
			System.out.println("Indica la duracion de cada proceso: "+(i+1)+": ");
			duracion[i]=in.nextInt();
		}
		
		
		int tEspera[]=new int[num];
		
		int tiempo_espera=0;
		
		int total=0;
		
		int min=0;
		
		System.out.println("Proceso\t\t\tDuracion\t\tTiempo de Espera");
		
		do
		{
			for(int i=0;i<num;i++)
			{
				if(duracion[i]!=0)
				{
					min=duracion[i];
					break;
				}
			}
			int tem=0;
			for(int j=0;j<num;j++)
			{
				if(duracion[j]!=0 && min>duracion[j])
				{
					min=duracion[j];
					tem=j;
				}
			}
			
			duracion[tem]=0;
			
			System.out.println("p"+(tem+1)+"\t\t\t"+min+"\t\t\t\t"+tiempo_espera);
			
			tEspera[tem]=tiempo_espera;
			
			tiempo_espera+=min;
			
			total=0;
			
			for(int i=0;i<num;i++)
			{
				total+=duracion[i];
			}
		}
		
		while(total!=0);
		
		float tiempo_espera1=0;
		
		    for(int i=0;i<num;i++)
			{
				tiempo_espera1+=tEspera[i];
			}
			
			System.out.println("\nEl tiempo promedio es de : "+(tiempo_espera1/num)+"ms");
			
		
	}
}
