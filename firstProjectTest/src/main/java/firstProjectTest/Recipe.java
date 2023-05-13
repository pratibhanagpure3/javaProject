package firstProjectTest;

public class Recipe extends AbstractRecipe {

	public static void main(String[] args) {
		Recipe rec = new Recipe();
		rec.execute();

	}

	@Override
	void getReady() {
		System.out.println("preparing raw materials");

	}

	@Override
	void doTheDish() {
		System.out.println("making the dishes");

	}

	@Override
	void cleanup() {
		System.out.println("clean the utensils");

	}

}
