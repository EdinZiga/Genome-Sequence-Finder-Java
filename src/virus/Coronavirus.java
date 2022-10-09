package virus;
import java.util.*;

/**
 * @authors <Faruk> && <Edin>
 * @description SE211 Project Complex
 */
/**
 * Made as final project for SE211 Software Construction
 * Collaboration between <FarukImamovic> && <EdinZiga>
  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣤⣤⣤⣤⣶⣦⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀ 
⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⡿⠛⠉⠙⠛⠛⠛⠛⠻⢿⣿⣷⣤⡀⠀⠀⠀⠀⠀ 
⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⠋⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⠈⢻⣿⣿⡄⠀⠀⠀⠀ 
⠀⠀⠀⠀⠀⠀⠀⣸⣿⡏⠀⠀⠀⣠⣶⣾⣿⣿⣿⠿⠿⠿⢿⣿⣿⣿⣄⠀⠀⠀ 
⠀⠀⠀⠀⠀⠀⠀⣿⣿⠁⠀⠀⢰⣿⣿⣯⠁⠀⠀⠀⠀⠀⠀⠀⠈⠙⢿⣷⡄⠀ 
⠀⠀⣀⣤⣴⣶⣶⣿⡟⠀ ⠀⢸⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣷⠀ 
⠀⢰⣿⡟⠋⠉⣹⣿⡇⠀⠀⠘⣿⣿⣿⣿⣷⣦⣤⣤⣤⣶⣶⣶⣶⣿⣿⣿⠀ 
⠀⢸⣿⡇⠀⠀⣿⣿⡇⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠀ 
⠀⣸⣿⡇⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠉⠻⠿⣿⣿⣿⣿⡿⠿⠿⠛⢻⣿⡇⠀⠀ 
⠀⣿⣿⠁⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣧⠀⠀ 
⠀⣿⣿⠀⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠀⠀ 
⠀⣿⣿⠀⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠀⠀ 
⠀⢿⣿⡆⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡇⠀⠀ 
⠀⠸⣿⣧⡀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠃⠀⠀ 
⠀⠀⠛⢿⣿⣿⣿⣿⣇⠀ ⠀⠀⣰⣿⣿⣷⣶⣶⣶⣶⠶⠀⢠⣿⣿⠀⠀⠀ 
⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀⠀⠀⣿⣿⡇⠀⣽⣿⡏⠁⠀⠀⢸⣿⡇⠀⠀⠀ 
⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀⠀⠀⣿⣿⡇⠀⢹⣿⡆⠀⠀⠀⣸⣿⠇⠀⠀⠀ 
⠀⠀⠀⠀⠀⠀⠀⢿⣿⣦⣄⣀⣠⣴⣿⣿⠁⠀⠈⠻⣿⣿⣿⣿⡿⠏⠀⠀⠀⠀ 
⠀⠀⠀⠀⠀⠀⠀⠈⠛⠻⠿⠿⠿⠿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
 */
/**
 * @WARNING
 * This version of the program uses an extreme amount of arrays which in turn may strain your CPU. 
 * It does this in order to find every possible genome sequence match, regardless of its position.
 * If you're going to test this use sequences under 1000 characters for optimal experience.
 * By default it is set to 300 characters. That can be changed on line 74.
 * The editDistance method returns 0, as we decided to try a different approach, so we never properly developed the counter
 * The Console will display the sequence matches found
 * @WARNING
 */
interface Viral {
	
	public void mutate();
	
	public boolean same(Coronavirus c);
	
	public boolean functionallySimilar(Coronavirus c);
	
	public int editDistance(Coronavirus c);
	
	public List<Character> getCorona();
}

public class Coronavirus implements Viral{
	/**
	 * CharList corona = base genome which we can compare, mutate etc
	 * Final CharList acids = short list of amino-acids
	 */
	private List<Character> corona = new ArrayList<>();  
	private final List<Character> acids = new ArrayList<Character>();
	
	/**
	 * @param none
	 * No argument constructor, generates virus of random length with random acids
	 */
	public Coronavirus() {
		acids.add('a');
		acids.add('t');
		acids.add('c');
		acids.add('g');
		
		Random coronaSize = new Random();
		Random acidGenerator = new Random();
		int size = coronaSize.nextInt(300);
		int acid;
		
		for(int i = 0 ; i < size ; i++) {
			acid = acidGenerator.nextInt(4);
			corona.add(acids.get(acid));
		}
	}
	/**
	 * @param size
	 * @effect generates a virus of length size with random genomes
	 */
	public Coronavirus(int size) {
		acids.add('a');
		acids.add('t');
		acids.add('c');
		acids.add('g');
		
		Random acidGenerator = new Random();
		int acid;
		
		for(int i = 0 ; i < size ; i++) {
			acid = acidGenerator.nextInt(4);
			corona.add(acids.get(acid));
		}
	}
	/**
	 * @param String second = user defined genome sequence in string form
	 * Single argument constructor, sets corona genome to user input
	 */
	public Coronavirus(String second) {
		for(char v : second.toCharArray()) {
			corona.add(v);
		}
		acids.add('a');
		acids.add('t');
		acids.add('c');
		acids.add('g');
	}
	/**
	 * 
	 * @param Coronavirus c
	 * @effect copy constructor
	 */
	public Coronavirus (Coronavirus other) {
		this.corona = other.getCorona();
		for(char i : other.acids) {
			this.acids.add(i);
		}
	}
	
	//Getter
	public List<Character> getCorona() {
		return corona;
	}
	
	/**
	 * @param none
	 * Causes one random genome mutation for calling object
	 */
	public void mutate() {
		Random randomAcid = new Random();
		Random randomIndex = new Random();
		char acid;
		char charAtIndex;
		do {
			acid = acids.get(randomAcid.nextInt(4));
			int index = randomIndex.nextInt(corona.size());
			charAtIndex = corona.get(index);
			corona.set(index, acid);
			
		}while(acid == charAtIndex);
	};
	
	/**
	 * @expects Coronavirus c is not null, and it contains the initialized genomic sequence
	 * @param Coronavirus c
	 * @return true if two viruses have the identical genomic sequence, and otherwise returns false
	 * (Basically an equals method with extra steps)
	 */
	public boolean same(Coronavirus c) {
		if (c == null) return false;
		if(this.corona.size() != c.corona.size()) return false;
		return c.getCorona().equals(this.corona);
	}
	
	/**
	 * @expects Coronavirus c is not null, and it contains the initialized genomic sequence
	 * @param Coronavirus c
	 * @return true if two viruses have the identical number of each amino-acid
	 */
	public boolean functionallySimilar(Coronavirus c) {
		if(c.getCorona().size() != corona.size()) return false;
		int[] first = new int[] {0,0,0,0};
		int[] second = new int[] {0,0,0,0};
		List <Character> copy = new ArrayList<>(c.getCorona());
		
		for(int i = 0 ; i < corona.size() ; i++) {
			if(corona.get(i).equals('a')) first[0] = first[0] + 1;
			if(corona.get(i).equals('t')) first[1] = first[1] + 1;
			if(corona.get(i).equals('c')) first[2] = first[2] + 1;
			if(corona.get(i).equals('g')) first[3] = first[3] + 1;
			
			if(copy.get(i).equals('a')) second[0] = second[0] + 1;
			if(copy.get(i).equals('t')) second[1] = second[1] + 1;
			if(copy.get(i).equals('c')) second[2] = second[2] + 1;
			if(copy.get(i).equals('g')) second[3] = second[3] + 1;
		}
		for(int i = 0 ; i < 4 ; i++) {
			if(first[i] != second[i]) return false;
		}
		return true;
	}
	
	/**
	 * @expects Coronavirus c is not null, and it contains the initialized genomic sequence
	 * @param Coronavirus c
	 * @return the minimum number of single-character inserts/deletes/substitutions
	 * Calculates amount of edits needed to make a sequence a coronavirus sequence
	 */
	public int editDistance(Coronavirus c) {
		if(corona.equals(c.corona)) return 0;
		List<Character> ECorona = new ArrayList<Character>(corona);
		List<Character> EInput = new ArrayList<Character>(c.getCorona());
		List<Character> match;
		Boolean sw=false;
		int total=0;
		int index1=0,index2=0;
		
		while(matcher(ECorona,EInput)!=null) {
		sw=false;
		match = matcher(ECorona,EInput);
		System.out.println("Matcher found - " + match);
		for(int i=0; i<ECorona.size(); i++) {
			if(ECorona.get(i)==match.get(0)) {
				for(int j=0; j<match.size();j++) {
					if(ECorona.get(i+j)!=match.get(j)) {
						 sw=false; break;
					} else sw=true;
				}
			}
			if(sw) {
				index1=i;
				break;
			}
		}
		sw=false;
		for(int i=0; i<EInput.size(); i++) {
			if(EInput.get(i)==match.get(0)) {
				for(int j=0; j<match.size();j++) {
					if(EInput.get(i+j)!=match.get(j)) {
						 sw=false; break;
					} else sw=true;
				}
			}
			if(sw) {
				index2=i;
				break;
			}
		}
		for(int i=0; i<match.size();i++) {
				ECorona.set(index1+i, null);
			}
		for(int i=0; i<match.size();i++) {
			EInput.set(index2+i, null);
		}	
		for(int i=ECorona.size()-1; i>=0;i--) {
			if(ECorona.get(i)==null)ECorona.remove(i);
		}
		for(int i=EInput.size()-1; i>=0;i--) {
			if(EInput.get(i)==null)EInput.remove(i);
		}
		}
		System.out.println(ECorona);
		System.out.println(EInput);
		if(ECorona.size()!=EInput.size()) {
			if(ECorona.size()>EInput.size()) {
				total=EInput.size()+ECorona.size();
				}
			if(EInput.size()>ECorona.size()) {
				total=ECorona.size()+EInput.size();
			}
		} else total=ECorona.size();
		
		return 0;
	};
	
	
	/**
	 * @param List<Character> base && other
	 * @return ArrayList<Character> of largest found sequence match
	 * Takes CharList in which it searches for the biggest sequence match from the coronavirus sequence 
	 * ex. corona="tttactgttt" input="tttccacactgccttt" return= "actg"
	 */
	public List<Character> matcher(List<Character> base, List<Character> other){
		if(base==null || other==null) {
			System.out.println("Null input");
			return null;
		}
		if(base.size()==0 || other.size()==0) {
			System.out.println("Empty input");
			return null;
			
		}
		List<Character> corEditIn = new ArrayList<Character>(base);
		List<Character> corEditOut = new ArrayList<Character>(base);
		List<Character> match = new ArrayList<Character>(other);
		List<Character> find = new ArrayList<Character>();		
		boolean fnd=false;
		for(int f=corEditIn.size(); f>0; f--) {
			corEditIn = new ArrayList<Character>(base);
			corEditOut = new ArrayList<Character>(base);
		while(corEditOut.size()!=1) {
			corEditIn = new ArrayList<Character>(corEditOut);
			while(corEditIn.size()!=1) {
				fnd=false;
				for(int i=0; i<=match.size()-corEditIn.size(); i++) {
					if(corEditIn.get(0)==match.get(i) && 
							(corEditIn.get(0)!=null && match.get(i)!=null)) {	
						for(int k=0; k<corEditIn.size(); k++) {
							if(corEditIn.get(k)!=match.get(i+k)) {
							 fnd=false; break;
							} else fnd=true;
						}
						if(fnd) {
							find = new ArrayList<Character>(corEditIn);
							
							break;
						}
					}
					if(fnd) break;
				}
				if(fnd) break;
				fnd=false;
				corEditIn.remove(corEditIn.size()-1);
			}
			corEditOut.remove(0);
			if(find.size()==f) break;
		}
		if(find.size()==f) break;
		}
		
		if(find.size()==0) {
			return null;
		} else return find;
	}
	
	
	public static void main(String arg[]) {
		
		Coronavirus obj1 = new Coronavirus();
		Coronavirus obj2 = new Coronavirus();
		
		System.out.println("Size of object 1: " + obj1.getCorona().size());
		System.out.println("Size of object 2: " + obj2.getCorona().size());
		
		long startTime =  System.nanoTime();
		System.out.println("Edit distance: " + obj1.editDistance(obj2));
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		System.out.println("Execution time of Edit distance : " + timeElapsed + " nanoseconds" );
	}
}
