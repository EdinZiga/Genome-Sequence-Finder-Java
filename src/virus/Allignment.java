/**
 * 
 */
package virus;

import java.util.*;

/**
 * @author Faruk Imamovic
 * @version Creation time: 29 May 2020 19:05:46
 * Class Description
*/

public class Allignment {

	private static List<Character> corona = new ArrayList<>();
	private String coronaString = "acctg";
	private List<Character> ourGenome = new ArrayList<>();
	private final List<Character> acids = new ArrayList<Character>();
	private String ourInputString = "";
	public Allignment(String second) {
		ourInputString = second;
		if(second == null) {
			System.out.println("OurCorona cannot be null");
			System.exit(0);
		}
		for(char c : second.toCharArray()) {
			ourGenome.add(c);
		}
		for(char v : coronaString.toCharArray()) {
			corona.add(v);
		}
		acids.add('a');
		acids.add('t');
		acids.add('c');
		acids.add('g');
	}
	
	public static int editDistance(Allignment input) {
		
		if(input.getOurGenome().size() == 0) return corona.size();
		if(corona.size() == 0) return input.getOurGenome().size();
		
		if(corona.get(corona.size() - 1).equals(input.getOurGenome().size() - 1 )) {
			corona.remove(corona.size() - 1);
			input.removeGenome(input.getOurGenome().size() - 1);
			return editDistance(input);
		}
		
		Allignment insert = new Allignment(input.getOutInputString().substring(0, input.getOutInputString().length() - 1));
		Allignment remove = new Allignment(input.getOutInputString());
		remove.setCorona(remove.getCoronaString().substring(0, remove.getCoronaString().length() - 1));
		Allignment replace = new Allignment(input.getOutInputString().substring(0, input.getOutInputString().length() - 1));
		replace.setCorona(input.getCoronaString().substring(0, replace.getCoronaString().length() - 1));
		
		return 1 + min(editDistance(insert), editDistance(remove), editDistance(replace));
		
	}
	
	static int min(int x, int y, int z) 
    { 
        if (x <= y && x <= z) 
            return x; 
        if (y <= x && y <= z) 
            return y; 
        else
            return z; 
    }
	
	
	public List<Character> getOurGenome() {
		return ourGenome;
	}
	
	public List<Character> getCorona() {
		return corona;
	}
	
	public void removeGenome(int position){
		ourGenome.remove(position);
	}
	
	
	public String getCoronaString() {
		return coronaString;
	}

	public void setCoronaString(String coronaString) {
		this.coronaString = coronaString;
	}
	
	public String getOutInputString() {
		return this.ourInputString;
	}
	
	
	public void setCorona(String s) {
		for(char v : s.toCharArray()) {
			corona.add(v);
		}
	}

	public static void main(String[] args) {
		
	}

}
