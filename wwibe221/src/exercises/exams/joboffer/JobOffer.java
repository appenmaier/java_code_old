package exercises.exams.joboffer;

import java.util.ArrayList;

public class JobOffer {

  private final int id;
  private final String title;
  private Recruiter recruiter;
  private final ArrayList<Applicant> applicants;

  public JobOffer(int id, String title, Recruiter recruiter) {
    this.id = id;
    this.title = title;
    this.recruiter = recruiter;
    applicants = new ArrayList<>();
  }

  public void addApplicant(Applicant applicant) {
    applicants.add(applicant);
  }

  public ArrayList<Applicant> applicants() {
    return applicants;
  }

  public int id() {
    return id;
  }

  public Recruiter recruiter() {
    return recruiter;
  }

  public String title() {
    return title;
  }

}
