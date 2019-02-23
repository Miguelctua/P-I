import java.util.Scanner;
	public class Ex3_12 {

		public static void main(String[] args) {
		calendario();

}
	public static void calendario() {	
		Scanner input=new Scanner(System.in);
		int ano,DiaDaSem,mes;
		System.out.println("ano");
		ano=input.nextInt();
		System.out.println("Mes(1-12)");
		mes=input.nextInt();
		System.out.println("Dia da semana em que o mes começa(dom 1- seg 2- terça 3...");
		DiaDaSem=input.nextInt();
		tabelaCalendario(ano,mes,DiaDaSem);
	}
	public static void tabelaCalendario(int ano,int mes,int DiaDaSem) {
		int dia;
		System.out.printf("\n--------------------------------------------------\n");
		nomeMes(mes,ano);
		System.out.printf("\n--------------------------------------------------\n");
		System.out.printf("Dom	Seg	Ter	Qua	Qui	Sex	Sab	\n");
		for(int i=0; i<=38; i++) {
			dia=i-(DiaDaSem);
			if(dia>0 && dia<=diaMes(mes,ano)) {
				System.out.printf("%d	",dia);
				if(i%7==1) {
					System.out.println();
				}
				
			}
			else
				System.out.printf("   ");
		}
		System.out.printf("\n--------------------------------------------------");
		
	}
	public static int diaMes(int mes,int ano) {
		int diaMes=1;
		switch(mes) {
		case 1: diaMes=31;break;
		case 2: 
			if(isbisexto(ano)){
					diaMes=29;
			}
			else
				diaMes=28;
			break;
		case 3: diaMes=31;break;
		case 4: diaMes=30;break;
		case 5: diaMes=31;break;
		case 6: diaMes=30;break;
		case 7: diaMes=31;break;
		case 8: diaMes=31;break;
		case 9: diaMes=30;break;
		case 10: diaMes=31;break;
		case 11: diaMes=30;break;
		case 12: diaMes=31;break;
		}
		return diaMes;
		
		
	}
	public static void nomeMes(int mes,int ano) {
		String nome="Mes irreconhecido";
		switch(mes) {
		case 1: nome="Janeiro";break;
		case 2: nome="Fevereiro";break;
		case 3: nome="Março";break;
		case 4: nome="Abril";break;
		case 5: nome="Maio";break;
		case 6: nome="Junho";break;
		case 7: nome="Julho";break;
		case 8: nome="Agosto";break;
		case 9: nome="Setembro";break;
		case 10: nome="Outubro";break;
		case 11: nome="Novembro";break;
		case 12: nome="Dezembro";break;
		}
		System.out.printf("		%s	%d		",nome,ano);
	}
	
	
	public static boolean isbisexto(int n) {
		if(n%4==0) {
			return true;
		}
		return false;
	
	}
}
