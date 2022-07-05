package demos.movie.v1;

public enum Genre {

	/*
	 * Aufzählungskonstanten
	 */
	FANTASY("Fantasy"), SCIENCE_FICTION("Science-Fiction"), DRAMA("Drama"), HORROR("Horror");

	/*
	 * Attribute
	 */
	private String description;

	/*
	 * Konstruktoren
	 */
	private Genre(String description) {
		this.description = description;
	}

	/*
	 * Setter und Getter
	 */
	public String getDescription() {
		return description;
	}

}
