package demos.movie.v1;

/**
 * Genre
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum Genre {

	/*
	 * Aufzählungskonstanten
	 */
	ADVENTURE("Abenteuer"), ACTION("Action"), DOCUMENTATION("Dokumentation"), DRAMA("Drama"), EROTIC("Erotik"),
	FANTASY("Fantasy"), BIOGRAPHY("Biographie"), COMEDY("Komödie"), HORROR("Horror"), WAR("Kriegsfilm"),
	LOVE("Liebsfilm"), MARTIAL_ARTS("Martial Arts"), MUSIC("Musikfilm"), PORNO("Porno"), ROAD("Roadmovie"),
	SCIENCE_FICTION("Science-Fiction"), SPORTS("Sportfilm"), THRILLER("Thriller"), WESTERN("Western");

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
