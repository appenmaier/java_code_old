package demos.movie;

/**
 * Genre
 * 
 * @author Daniel Appenmaier
 *
 */
public enum Genre02 {

  DRAMA("Drama"), ANIMATION("Animation"), CRIME("Crime"), FILM_NOIR("Film Noir"), FAMILY(
      "Family"), ADVENTURE("Adventure"), MYSTERY("Mystery"), DOCUMENTARY("Documentary"), FANTASY(
          "Fantasy"), HISTORY("History"), NEWS("News"), MUSIC("Music"), BIOGRAPHY(
              "Biography"), COMEDY("Comedy"), SCIENCE_FICTION("Science Fiction"), SPORT(
                  "Sport"), ROMANCE("Romance"), ACTION("Action"), THRILLER("Thriller"), HORROR(
                      "Horror"), WESTERN("Western"), WAR("War"), MUSICAL("Musical");

  private String name;

  Genre02(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

}
