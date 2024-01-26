package ntu.model;

/**
 * Datum
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Date {

  private int day;
  private int month;
  private int year;

  public Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public int getDay() {
    return day;
  }

  public int getMonth() {
    return month;
  }

  public int getYear() {
    return year;
  }

  public void setDate(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public void setDay(int day) {
    this.day = day;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public void setYear(int year) {
    this.year = year;
  }

  @Override
  public String toString() {
    return (day < 10 ? "0" + day : day) + "/" + (month < 10 ? "0" + month : month) + "/" + year;
  }

}
