package slidenerd.withoutdi;

public class BarDatabase {

	public String fetchCocktail(String drinkName) {
		return "FROM BAR : " + drinkName;
	}

}
