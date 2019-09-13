import java.util.*;
public class Exame2 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int op;
		int nPilotos=0;
		Piloto[] array = new Piloto[9]; 
		System.out.println("Gestão de uma prova automóvel:");
		System.out.println("1 - Inserir informação dos pilotos");
		System.out.println("2 - Listar pilotos ordenados pelo número da viatura");
		System.out.println("3 - Alterar informação de um piloto");
		System.out.println("4 - Remover piloto com base no número da viatura");
		System.out.println("5 - Listar pilotos ordenados pelo nome");
		System.out.println("6 - Remover piloto(s) com base no nome");
		System.out.println("7 - Validar matriculas");
		System.out.println("8 - Terminar programa");
		do{
			System.out.println("Digite a sua opção");
			op=Integer.parseInt(sc.nextLine()); 
			switch(op){
				case 1:
					
					array = new Piloto[9];
					for(int i=0;i<array.length;i++){
						Scanner read = new Scanner(System.in);
						array[i]=new Piloto();
						array[i].viatura=i+1;
						System.out.print("Nome do piloto:");
						array[i].nome=sc.nextLine();
						if (array[i].nome.length()==0) break;
						System.out.print("Matrícula:");
						array[i].matricula=sc.nextLine();
						nPilotos++;
					}
				break;
				case 2:
					Piloto tmp = new Piloto();
					boolean trocas;
					trocas = false;
					do{
						for(int i=0;i<nPilotos-1;i++){
								if(array[i].viatura>array[i+1].viatura){
									tmp.viatura=array[i].viatura;
									tmp.nome=array[i].nome;
									tmp.matricula=array[i].matricula;
									array[i].viatura=array[i+1].viatura;
									array[i].nome=array[i+1].nome;
									array[i].matricula=array[i+1].matricula;
									array[i+1].viatura=tmp.viatura;
									array[i+1].nome=tmp.nome;
									array[i+1].matricula=tmp.matricula;
									trocas=true;
								}
						}
					}while(trocas);
					for(int i=0;i<nPilotos;i++){
						System.out.printf("Nome:%s\n",array[i].nome);
						System.out.printf("Matrícula:%s\n",array[i].matricula);
						System.out.printf("Número da viatura:%s\n",array[i].viatura);
						System.out.println();
					}	
				break;
				case 3:
					int nViatura;
					int posicao;
					do{
						System.out.println("Digite o numero da viatura :");
						nViatura = Integer.parseInt(sc.nextLine());
						posicao=procurarElemento(array,nPilotos,nViatura);
						if (posicao==-1) System.out.println("Numero inválido");
					}while(posicao==-1); 
					System.out.println("Nome:");
					array[posicao].nome=sc.nextLine();
					if(array[posicao].nome.length()==0)break;
					System.out.println("Matricula:");
					array[posicao].matricula=sc.nextLine();
				break;
				case 4:	
					int posicaoRetirar;
					do{
						System.out.println("Digite o numero da viatura :");
						nViatura = Integer.parseInt(sc.nextLine());
						posicaoRetirar=procurarElemento(array,nPilotos,nViatura);
						if (posicaoRetirar==-1) System.out.println("Numero inválido");
					}while(posicaoRetirar==-1);
					for(int i=posicaoRetirar;i<nPilotos;i++){
						array[posicaoRetirar].nome=array[posicaoRetirar+1].nome;
						array[posicaoRetirar].matricula=array[posicaoRetirar+1].matricula;
					}
					nPilotos--;
				break;
				case 5:
					String nomes[] = new String[nPilotos];
					for(int i=0;i<nPilotos;i++){
						nomes[i]=array[i].nome;
					}
					Arrays.sort(nomes);
					for(int i=0;i<nPilotos;i++){
						array[i].nome=nomes[i];
					}
					for (int i=0;i<nPilotos;i++){
						System.out.printf("Nome : %s\n",array[i].nome);
						System.out.printf("Matrícula: %s\n",array[i].matricula);
						System.out.printf("Veíulo Nrº: %d\n",array[i].viatura);
					}
				break;
				case 6:
					int posicaoRemover;
					String remove;
					do{
						System.out.println("Digite o nome que pretende remover");
						remove=sc.nextLine();
						posicaoRemover=procurarElemento(array,nPilotos,remove);
						if (posicaoRemover==-1)System.out.println("Nome inválido!");
					}while(posicaoRemover==-1);
					for (int i=posicaoRemover;i<nPilotos;i++){
						array[i].nome=array[i+1].nome;
						array[i].matricula=array[i+1].matricula;
					}
					nPilotos--;
					System.out.println("Piloto Removido");
						
				break;	
				case 7:
				boolean isValid;
					for (int i=0;i<nPilotos;i++){
						isValid =validMatricula(array[i].matricula);
						if (!isValid){
							do{
								System.out.printf("Matricula %s do piloto %s inválida digite uma nova\n",array[i].matricula,array[i].nome);
								array[i].matricula=sc.nextLine();
								isValid =validMatricula(array[i].matricula);
							}while(!isValid);
						}
						else System.out.printf("Matricula %s valida do piloto %s\n",array[i].matricula,array[i].nome);
					}
				break;
				case 8:
				break;
				default:
					System.out.println("Opção inválida");
							
					
			}
		}while(op!=8);
	}
	public static int procurarElemento(Piloto array[],int nPilotos,int nViatura){
		int n=0;
		int pos=-1;
		do{
			if(array[n++].viatura == nViatura){
				pos= n-1;
			}
		}while(pos == -1 && n<nPilotos);
		return pos;
	}
	public static int procurarElemento(Piloto array[],int nPilotos,String remove){
		int n=0;
		int pos=-1;
		do{
			if (array[n++].nome.equals(remove)){//if(array[n++].nome==remove){
				pos = n-1;
			}
		}while(pos == -1 && n<nPilotos);
		return pos;
	}
	public static boolean validMatricula (String mat){
		if (mat.length()!=8) return false;
		if (mat.charAt(2)!='-' || mat.charAt(5)!='-') return false;
		if (Character.isLetter(mat.charAt(0))&&Character.isLetter(mat.charAt(1))&&Character.isDigit(mat.charAt(3))&&Character.isDigit(mat.charAt(4))&&Character.isDigit(mat.charAt(6))&&Character.isDigit(mat.charAt(7))) return true;
		if (Character.isDigit(mat.charAt(0))&&Character.isDigit(mat.charAt(1))&&Character.isLetter(mat.charAt(3))&&Character.isLetter(mat.charAt(4))&&Character.isDigit(mat.charAt(6))&&Character.isDigit(mat.charAt(7))) return true;
		if (Character.isDigit(mat.charAt(0))&&Character.isDigit(mat.charAt(1))&&Character.isDigit(mat.charAt(3))&&Character.isDigit(mat.charAt(4))&&Character.isLetter(mat.charAt(6))&&Character.isLetter(mat.charAt(7))) return true;
		else return false;
	}
		
}
class Piloto{
	int viatura;
	String nome;
	String matricula;
}
