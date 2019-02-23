import java.util.*;
public class Ex94 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		String str, pattern;
		System.out.println("Digite a matricula");
		str=sc.nextLine();
		System.out.println("Digite o padrão");
		pattern=sc.nextLine();
		if(matchPattern(str, pattern) == true) {
            System.out.print("A matrícula é válida!");
        } else {
            System.out.print("A matrícula é inválida!");
        }
		
	}
	public static boolean matchPattern(String str, String pattern){
		char letra1 = str.charAt(0);
		char letra2 = str.charAt(0);
		char letra3 = str.charAt(2);
		char letra4 = str.charAt(3);
		char letra5 = str.charAt(4);
		char letra6 = str.charAt(5);
		char letra7 = str.charAt(6);
		
		if(Character.isUpperCase(letra1) == true && pattern.charAt(0) == 'A') {
            return true;
        } else if(Character.isUpperCase(letra3) == true && pattern.charAt(3) == 'A') {
            return true;
        } else if(Character.isUpperCase(letra5) == true && pattern.charAt(6) == 'A') {
            return true;
        } else {return false;}          
     }
		
}

