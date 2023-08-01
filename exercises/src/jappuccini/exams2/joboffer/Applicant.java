package jappuccini.exams2.joboffer;

import java.util.ArrayList;

/**
 * Bewerber
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public final class Applicant extends Person {

  private final int applicantId;
  private final ArrayList<ApplicationDocument> applicationDocuments;

  public Applicant(String name, long birthDateTimeStamp, int applicantId) {
    super(name, birthDateTimeStamp);
    this.applicantId = applicantId;
    applicationDocuments = new ArrayList<>();
  }

  public void addApplicationDocument(ApplicationDocument applicationDocument) {
    applicationDocuments.add(applicationDocument);
  }

  public int applicantId() {
    return applicantId;
  }

  public ArrayList<ApplicationDocument> applicationDocuments() {
    return applicationDocuments;
  }

}
