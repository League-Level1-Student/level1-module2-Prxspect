

public class TeaMakerRunner {
public static void main(String[] args) {
	Cup cup = new Cup();
	Kettle kettle = new Kettle();
    kettle.boil();
    Kettle.Water hotWater = kettle.getWater();
	TeaBag teabag = new TeaBag ("Green");
	teabag.getFlavor();
	cup.makeTea(teabag, hotWater);
	
}
}
