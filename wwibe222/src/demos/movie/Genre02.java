package demos.movie;

public enum Genre02 {

	HORROR("Horror"), ACTION("Action"), CRIME("Crime"), THRILLER("Thriller");

	private String name;

	Genre02(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
