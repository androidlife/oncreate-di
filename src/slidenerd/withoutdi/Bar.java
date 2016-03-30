package slidenerd.withoutdi;

public class Bar {

	private BarDatabase db;

	public Cocktail getCocktail(String drinkName) {
		db = new BarDatabase();
		String drinkFromBar = db.fetchCocktail(drinkName);
		return new Cocktail(drinkFromBar);
	}
	
	//using setters
	public void setBarDatabase(BarDatabase db){
		this.db = db;
	}
	
	public Cocktail getCocktailFromBar(String drinkName){
		String drinkFromBar = db.fetchCocktail(drinkName);
		return new Cocktail(drinkFromBar);
	}
	

}
