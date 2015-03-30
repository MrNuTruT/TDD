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
		n2t.put("15", "quinze");
		n2t.put("16", "seize");
		
		n2t.put("20", "vingt");
		n2t.put("30", "trente");
		n2t.put("40", "quarante");
		n2t.put("50", "cinquante");
		n2t.put("60", "soixante");
		
	}
	
	public static String num2text(String input) {
		int nbr = Integer.parseInt(input);
		if(Integer.parseInt(input)<17 || nbr == 20 || nbr == 30 || nbr == 40 || nbr == 50 || nbr == 60)
			return(n2t.get(input));
		
		else if(nbr == 21 || nbr == 31 || nbr == 41 || nbr == 51 || nbr == 61)
			return(n2t.get(""+(nbr/10)*10) + " et " + n2t.get(""+(nbr -((nbr/10)*10))));
					
		else
			return(n2t.get(""+(nbr/10)*10) + " " + n2t.get(""+(nbr -((nbr/10)*10))));
	
	}
	public static String text2num(String input) {
		
	}
}