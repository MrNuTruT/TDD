package iut.tdd;

import java.util.HashMap;

public class Convert {
	
	static HashMap<String,String> n2t = new HashMap<String,String>();
	static {
		n2t.put("0", "zéro");
		n2t.put("1", "un");
		n2t.put("2", "deux");
		n2t.put("3", "trois");
		n2t.put("4", "quatre");
		n2t.put("5", "cinq");
		n2t.put("6", "six");
		n2t.put("7", "sept");
		n2t.put("8", "huit");
		n2t.put("9", "neuf");
		n2t.put("10", "dix");
		n2t.put("11", "onze");
		n2t.put("12", "douze");
		n2t.put("13", "treize");
		n2t.put("14", "quatorze");
		n2t.put("15", "qunize");
		n2t.put("16", "seize");
	}
	
	public static String num2text(String input) {
		return(n2t.get(input));
	}
	public static String text2num(String input) {
		
	}
}