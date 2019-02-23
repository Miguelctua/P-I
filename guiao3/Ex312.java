import java.util.Scanner;
public class Ex312 {
	
	public static void main (String[] args) {
	int ano,dia;
	int diasemana=7;
	int diames ;
	String mes;
		Scanner ler= new Scanner (System.in);
	
		System.out.print("Ano:");
		ano=ler.nextInt();
		System.out.print("mes");
		mes=ler.next();
		System.out.print("Em que dia da semana começa esse mês ? 1 = Domingo 2 = Segunda, 3 = Terça, 4 = Quarta, 5 = Quinta, 6 = Sexta, 7 = Sábado");
		diasemana = ler.nextInt();
		System.out.print("----------------------\n");
		System.out.printf("| %s     %d          | \n",mes,ano);
		System.out.print("----------------------\n" );
		System.out.print("|Su Mo Tu We Th Fr Sa|\n");
		System.out.print("----------------------\n");
		switch (mes)
    {
			case "Janeiro":
			  diames=31; 
			break;
			case "Fevereiro":
			 double bi1=(ano%4);
			 double bi2=(ano%100);
			 double bi3=(ano%400);
				if (bi1==0)
				diames=29;
				else 
				if (bi2==0)
				diames=29;
				else
				if (bi3==0)
				diames=29;
				else
				diames=28;
			 
			break;
			case "Março" :
				diames=31;
			break;
			case "Abril" :
				diames=30;
			break;
			case "Maio":
				diames=31;
			break;
			case "Junho":
				diames=30;
			break;
			case "Julho":
				diames=31;
			break;
			case "Agosto":
				diames=31;
			break;
			case "Setembro":
				diames=30;
			break; 
			case "Outubro":
				diames=31;
			break;
			case "Novembro":
				diames=30;
			break;
			case "Dezembro":
				diames=31;
			break;
					
				}
		for (int i=1 ;i<=diames;i++) {
			dia =i;
			System.out.printf("%3d",dia);
			i++; 
			}
			
		
		System.out.printf("\n----------------------\n");
	
	
}
}

