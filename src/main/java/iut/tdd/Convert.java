package iut.tdd;

public class Convert {
	public static String num2text(String input) {
		if(input.equals("0"))
			return "zéro";
		else if(input.equals("1"))
			return "un";
		else if(input.equals("2"))
			return "deux";
		else if(input.equals("3"))
			return "trois";
		else if(input.equals("4"))
			return "quatre";
		else if(input.equals("5"))
			return "cinq";
		else if(input.equals("6"))
			return "six";
		else if(input.equals("7"))
			return "sept";
		else if(input.equals("8"))
			return "huit";
		else if(input.equals("9"))
			return "neuf";
		else
			return null;
	}
	public static String text2num(String input) {
		if(input.equals("zéro"))
			return "0";
		else if(input.equals("un"))
			return "1";
		else if(input.equals("deux"))
			return "2";
		else if(input.equals("trois"))
			return "3";
		else if(input.equals("quatre"))
			return "4";
		else if(input.equals("cinq"))
			return "5";
		else if(input.equals("six"))
			return "6";
		else if(input.equals("sept"))
			return "7";
		else if(input.equals("huit"))
			return "8";
		else if(input.equals("neuf"))
			return "9";
		else
			return null;
	}
}