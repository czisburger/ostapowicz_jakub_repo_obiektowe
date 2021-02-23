import java.util.Scanner;

class JakubOstapowiczPolaFigurPlaskich{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		String figura = "";
		if(!figura.equals("quit")){
			menu();
			figura = sc.next();
			figura(figura);
		}
	}
	
	public static void figura(String figura){
		switch(figura){
			case "1":{
				kwadrat();
				break;
			}
			case "2":{
				prostokat();
				break;
			}
			default:{
				defaultText();
			}
		}
	}
	
	public static void menu(){
		System.out.println("1 - kwadrat");
		System.out.println("2 - prostokat");
		System.out.println("quit - zamkniecie programu");
		System.out.println("");
		System.out.print("Wybierz jedna figure: ");
	}
	
	public static void defaultText(){
		System.out.print("");
	}
	
	public static void kwadrat(){
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		System.out.print("Podaj dlugosc boku: ");
		int bok = sc.nextInt();
		for (int i=1; i<bok+1; i++){
			System.out.print("*");
		}
		for (int x=1; x<bok-1; x++){
			System.out.println("");
			for (int j=1; j<2; j++){
				System.out.print("*");
				for (int k=2; k<bok; k++){
					System.out.print(" ");
				}
				System.out.print("*");
			}
		}
		System.out.println("");
		for (int i=1; i<bok+1; i++){
			System.out.print("*");
		}
		System.out.println("");
		System.out.println("Obwod: "+bok+"*4 = "+(bok * 4));
		System.out.println("Pole: "+bok+"*"+bok+" = "+(bok * bok));
	}
	
	public static void prostokat(){
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		System.out.print("Podaj dlugosc pierwszego boku: ");
		int pierwszy = sc.nextInt();
		System.out.print("Podaj dlugosc pierwszego boku: ");
		int drugi = sc.nextInt();
		for (int i=1; i<pierwszy+1; i++){
			System.out.print("*");
		}
		for (int x=1; x<drugi-1; x++){
			System.out.println("");
			for (int j=1; j<2; j++){
				System.out.print("*");
				for (int k=2; k<pierwszy; k++){
					System.out.print(" ");
				}
				System.out.print("*");
			}
		}
		System.out.println("");
		for (int i=1; i<pierwszy+1; i++){
			System.out.print("*");
		}
		System.out.println("");
		System.out.println("Obwod: "+pierwszy+"*2"+drugi+"*2 = "+(pierwszy * 2 + drugi * 2));
		System.out.println("Pole: "+pierwszy+"*"+drugi+" = "+(pierwszy * drugi));
	}
}