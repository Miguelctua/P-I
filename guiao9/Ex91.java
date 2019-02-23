import java.util.Scanner;

public class Ex91 {
	static Scanner sc = new Scanner (System.in);
	public static void main (String[] args) {
		String line = new String();
		int min=0;
		int mai=0;
		int num=0;
		int vogal=0;
		int consoante=0;
		
		System.out.println("Análise de uma frase\n");
		System.out.print("Frase de entrada:\n");
		line = sc.nextLine();
		for (int i=0;i<line.length();i++){
			char letra=line.charAt(i);
			if(Character.isUpperCase(letra)){
				mai++;
			}
				
			if (Character.isLowerCase(letra)){
				min++;
			}
			if (Character.isDigit(letra)){
				num++;
			}
			if (isVowel(letra) == true){
				vogal++;
			}
			else {
				consoante++;
			}
				
		}
		System.out.printf("\nNúmero de caracteres minusculos -> %d", min);
		System.out.printf("\nNúmero de caracteres maiusculos -> %d", mai);
        System.out.printf("\nNúmero de caracteres numéricos -> %d", num);
		System.out.printf("\nNúmero de vogais -> %d", vogal);
		System.out.printf("\nNúmero de consoantes -> %d",consoante);
		
	}
	public static boolean isVowel(char letra){
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra =='o' || letra == 'u' ){
			
		return true;
	}
	else {
		return false; 
	}
}
}

