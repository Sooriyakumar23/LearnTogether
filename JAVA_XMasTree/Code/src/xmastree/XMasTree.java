package xmastree;

public class XMasTree {
	
	public static void main (String[] args) {
		
		int characterLength = 39;
		
		int starLength = 0;
		int spaceLength = 0;
		
		for (int i=1; i<=4; i++) {
			starLength = 2*i-1;
			spaceLength = (characterLength - starLength) / 2;
			System.out.print(String.valueOf(' ').repeat(spaceLength));
			System.out.print(String.valueOf('*').repeat(starLength));
			System.out.println(String.valueOf(' ').repeat(spaceLength));
		}
		
		for (int i=1; i<=5; i++) {
			starLength = 2*i+3;
			spaceLength = (characterLength - starLength) / 2;
			System.out.print(String.valueOf(' ').repeat(spaceLength));
			System.out.print(String.valueOf('*').repeat(starLength));
			System.out.println(String.valueOf(' ').repeat(spaceLength));
		}
		
		for (int i=1; i<=6; i++) {
			starLength = 2*i+9;
			spaceLength = (characterLength - starLength) / 2;
			System.out.print(String.valueOf(' ').repeat(spaceLength));
			System.out.print(String.valueOf('*').repeat(starLength));
			System.out.println(String.valueOf(' ').repeat(spaceLength));
		}
		
		for (int i=1; i<=7; i++) {
			starLength = 2*i+15;
			spaceLength = (characterLength - starLength) / 2;
			System.out.print(String.valueOf(' ').repeat(spaceLength));
			System.out.print(String.valueOf('*').repeat(starLength));
			System.out.println(String.valueOf(' ').repeat(spaceLength));
		}
		
		for (int i=1; i<=8; i++) {
			starLength = 2*i+23;
			spaceLength = (characterLength - starLength) / 2;
			System.out.print(String.valueOf(' ').repeat(spaceLength));
			System.out.print(String.valueOf('*').repeat(starLength));
			System.out.println(String.valueOf(' ').repeat(spaceLength));
		}
		
		for (int i=1; i<=4; i++) {
			int slashLength = 5;
			spaceLength = (characterLength - slashLength) / 2;
			System.out.print(String.valueOf(' ').repeat(spaceLength));
			System.out.print(String.valueOf('|').repeat(slashLength));
			System.out.println(String.valueOf(' ').repeat(spaceLength));
			
		}
		
	}

}
