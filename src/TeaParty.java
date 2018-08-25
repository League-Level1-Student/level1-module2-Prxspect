
public class TeaParty {
	
	
	public String welcome (String name, boolean isWoman, boolean isKnighted) {
		if (isKnighted == true && isWoman == false) {
			return "Sir " + name;
		}
		else if (isKnighted == false && isWoman == false) {
			return "Mr. " + name;
		}
		else if (isKnighted == true && isWoman == true) {
			return "Lady " + name;
		}
		else if (isKnighted == false && isWoman == true) {
			return "Ms. " + name;
		}
		else {
			return "error";
		}
		
		
    

    }
}
