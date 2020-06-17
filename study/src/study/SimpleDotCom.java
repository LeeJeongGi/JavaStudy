package study;

public class SimpleDotCom {
	
	int[] locationCells;
	int numOfHits = 0;
	
	public void setLocationCells(int[] locs) {
		locationCells = locs;
		for(int i = 0; i < locationCells.length; i++)
			System.out.println("locationCells[i] : " + locationCells[i] );
	}
	
	public String checkYourself(String stringGuess) {
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		for(int i=0; i < locationCells.length; i++) {
			if(guess == locationCells[i]) {
				result = "hit";
				numOfHits++;
				break;
			}
		}
		
		if(numOfHits == locationCells.length) result = "kill";
		System.out.println(result);
		return result;
	}
}
