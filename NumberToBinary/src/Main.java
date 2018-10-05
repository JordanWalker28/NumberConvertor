
import java.util.Scanner;
public class Main {
	public static void main(String [] args) {
		while(true) { //Main Body while loop keeps the program running until the user exits
			
		//Choice Output
		System.out.println("Hello, What would you like to do?");
		System.out.println("1. Number to Binary");
		System.out.println("2. Binary to Number");
		System.out.println("3. Number to HexaDecimal");
		System.out.println("4. HexaDecimal to Number");
		System.out.println("5. Number to HexaDecimal");
		System.out.println("6. HexaDecimal to Number");
		System.out.println("7. Exit");
		
		//Input Selection
		Scanner choice = new Scanner(System.in);
		String input = choice.nextLine();
			if (input.equalsIgnoreCase("Exit") || input.equals("7")) {
				System.out.println("Quiting");
				break;
			}else if(input.equals("1")){
				System.out.println("Number to Binary");
				NumberToBinary();
			}else if(input.equals("2")) {
				System.out.println("Binary to Number");
				WordToNumber();
			}else if(input.equals("3")) {
				System.out.println("Number to Hexadecimal");
				NumberToHexaDecimal();
			}else if(input.equals("4")) {
				System.out.println("Hexadecimal to Number");
				HexadecimalToNumber();
			}else if(input.equals("4")) {
				System.out.println("Hexadecimal to Binary");
				HexadecimalToNumber();
			}else if(input.equals("4")) {
				System.out.println("Binary to HexaDecimal");
				HexadecimalToNumber();
			}else {
				System.out.println("");
			}
		}
	}
	
	public static void HexadecimalToNumber() {
		while(true) {
			System.out.println("Change a Hexadecimal to a Number \nType Exit to go back to the main menu!");
			Scanner number = new Scanner(System.in);
			String input = number.nextLine();
			if(input.equalsIgnoreCase("Exit")) {
				break; 
			}else {
				ConvertHexToNumber(input);
			}
		}			
	}

	public static void WordToNumber() {
		while(true) {
			System.out.println("Change a Binary Number to a regular Number \nType Exit to go back to the main menu!");
			Scanner number = new Scanner(System.in);
			String input = number.nextLine();
			if(input.equalsIgnoreCase("Exit")) {
				break; 
			}else {
				int input2;
				input2 = Integer.parseInt(input);
				ConvertBinaryToNumber(input);
			}
		}
	}

	public static void NumberToHexaDecimal() {
		while(true) {
			System.out.println("Change a Number to Hexadecimal \nType Exit to go back to the main menu!");
			Scanner number = new Scanner(System.in);
			String input = number.nextLine();
			if(input.equalsIgnoreCase("Exit")) {
				break; 
			}else {
				ConvertNumberToHex(input);
			}
		}	
	}

	public static void NumberToBinary() {
		while(true) {
			String inputResult;
			System.out.println("Change a Number to Binary \nType Exit to go back to the main menu!");
			Scanner number = new Scanner(System.in);
			String input = number.nextLine();
			if(input.equalsIgnoreCase("Exit")) {
				break; 
			}else {
				inputResult = ConvertNumberToBinary(input);
				System.out.println(inputResult);
			}
		}
	}

	private static void ConvertNumberToHex(String input) {
		int input2;
		input2 = Integer.parseInt(input);
		StringBuilder sb = new StringBuilder();
		
		while (input2 > 0) {
			if(input2 % 16 <= 9) {
				sb.append(input2 % 16);
			}else if(input2 % 16 == 10) {
				sb.append("A");
			}else if(input2 % 16 == 11) {
				sb.append("B");
			}else if(input2 % 16 == 12) {
				sb.append("C");
			}else if(input2 % 16 == 13) {
				sb.append("D");
			}else if(input2 % 16 == 14) {
				sb.append("E");
			}else if(input2 % 16 == 15) {
				sb.append("F");
			}
			input2 = input2 / 16; 
		}
		System.out.println(sb.reverse());
	}

	private static void ConvertHexToNumber(String input) {
		String a_letter;
		int len = input.length() - 1;
		int count = 0; 
		
		for(int i = 0; i<input.length();i++) {
			a_letter = Character.toString(input.charAt(i));		
			if(a_letter.equals("1")) {
				count = (int) (count + (1 * Math.pow(16, len)));
				len--;
			}else if (a_letter.equals("2")){
				count = (int) (count + (2 * Math.pow(16, len)));
				len--;
			}else if (a_letter.equals("3")){
				count = (int) (count + (3 * Math.pow(16, len)));
				len--;
			}else if (a_letter.equals("4")){
				count = (int) (count + (4 * Math.pow(16, len)));
				len--;
			}else if (a_letter.equals("5")){
				count = (int) (count + (5 * Math.pow(16, len)));
				len--;
			}else if (a_letter.equals("6")){
				count = (int) (count + (6 * Math.pow(16, len)));
				len--;
			}else if (a_letter.equals("7")){
				count = (int) (count + (7 * Math.pow(16, len)));
				len--;
			}else if (a_letter.equals("8")){
				count = (int) (count + (8 * Math.pow(16, len)));
				len--;
			}else if (a_letter.equals("9")){
				count = (int) (count + (9 * Math.pow(16, len)));
				len--;
			}else if (a_letter.equals("0")){
				count = (int) (count + (0 * Math.pow(16, len)));
				len--;
			}else if (a_letter.equalsIgnoreCase("A")){
				count = (int) (count + (10 * Math.pow(16, len)));
				len--;
			}else if (a_letter.equalsIgnoreCase("B")){
				count = (int) (count + (11 * Math.pow(16, len)));
				len--;
			}else if (a_letter.equalsIgnoreCase("C")){
				count = (int) (count + (12 * Math.pow(16, len)));
				len--;
			}else if (a_letter.equalsIgnoreCase("D")){
				count = (int) (count + (13 * Math.pow(16, len)));
				len--;
			}else if (a_letter.equalsIgnoreCase("E")){
				count = (int) (count + (14 * Math.pow(16, len)));
				len--;
			}else if (a_letter.equalsIgnoreCase("F")){
				count = (int) (count + (15 * Math.pow(16, len)));
				len--;
			}
		}
		System.out.println("final " + count);
	}

	private static String ConvertNumberToBinary(String input) {
		int input2; 
		input2 = Integer.parseInt(input);
		StringBuilder sb = new StringBuilder();
		
		while(input2 > 0) {
			int r = input2 % 2; 
			sb.append(r);
			input2 = input2 / 2; 
		}
		input = sb.reverse().toString();
		return input;
	}
	
	
	private static void ConvertBinaryToNumber(String input) {
		String a_letter;
		int len = input.length() - 1;
		int count = 0; 
		
		for(int i = 0; i<input.length();i++) {
			a_letter = Character.toString(input.charAt(i));		
			if(a_letter.equals("1")) {
				count = (int) (count +  Math.pow(2, len));
				len--;
			}else if (a_letter.equals("0")){
				len--;
			}
		}
		System.out.println("final " + count);
	}	
}
	
		
	
	
		
	
