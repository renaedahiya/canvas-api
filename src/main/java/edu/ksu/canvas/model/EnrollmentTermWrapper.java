package edu.ksu.canvas.model;


import java.util.List;

/**
 * Wrapper class made necessary because canvas returns an object that
 * contains a list of EnrollmentTerm Objects, with only one item in the list.
 */
public class EnrollmentTermWrapper {

    private List<EnrollmentTerm> enrollmentTerms;

    public List<EnrollmentTerm> getEnrollmentTerms() {
        return enrollmentTerms;
    }

    public void setEnrollmentTerms(List<EnrollmentTerm> enrollmentTerms) {
        this.enrollmentTerms = enrollmentTerms;
    }


}
