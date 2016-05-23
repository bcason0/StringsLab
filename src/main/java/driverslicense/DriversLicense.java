package driverslicense;


import java.util.ArrayList;
import java.util.Date;

import static java.lang.Boolean.parseBoolean;

public class DriversLicense {

    private String name, address, licenseNumber, endorsements, issuingState, eyeColor;

    private int height;
    private double weight;
    private char licenseClassification, sex;
    private boolean organDonor, federallyCompliant;
    private Date dateOfBirth, issueDate, expirationDate;
    ArrayList<DriversLicense> deserializedList;

    //private Restriction[] restrictions;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public char getLicenseClassification() {
        return licenseClassification;
    }

    public void setLicenseClassification(char licenseClassification) {
        this.licenseClassification = licenseClassification;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public boolean isOrganDonor() {
        return organDonor;
    }

    public void setOrganDonor(boolean organDonor) {
        this.organDonor = organDonor;
    }

    public boolean isFederallyCompliant() {
        return federallyCompliant;
    }

    public void setFederallyCompliant(boolean federallyCompliant) {
        this.federallyCompliant = federallyCompliant;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

//    public Restriction[] getRestrictions() {
//        return restrictions;
//    }
//
//    public void setRestrictions(Restriction[] restrictions) {
//        this.restrictions = restrictions;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getEndorsements() {
        return endorsements;
    }

    public void setEndorsements(String endorsements) {
        this.endorsements = endorsements;
    }

    public String getIssuingState() {
        return issuingState;
    }

    public void setIssuingState(String issuingState) {
        this.issuingState = issuingState;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    /**
     * (include description of field order here)
     * @return
     */
    public String serializeToCSV(){

        StringBuilder csvBuilder = new StringBuilder();

        csvBuilder.append(name).append(',')
                .append(address).append(',')
                .append(eyeColor).append(',')
                .append(dateOfBirth).append(',')
                .append(issueDate).append(',')
                .append(expirationDate).append(',')
                .append(licenseNumber).append(',')
                .append(issuingState).append(',')
                .append(endorsements).append(',')
                .append(sex).append(',')
                .append(federallyCompliant).append(',')
                .append(licenseClassification);

        return csvBuilder.toString();
    }

    public static String getCSVHeader(){
        return "NAME,ADDRESS,EYE COLOR,DATE OF BIRTH,ISSUE DATE,EXPIRATION DATE," +
                "LICENSE NUMBER,STATE,ENDORSEMENTS,SEX,FEDERAL COMPLIANCE,CLASSIFICATION";
    }

    public static ArrayList<DriversLicense> deserializeToCSV(String csvFile){
        DriversLicense name = new DriversLicense();
        ArrayList<DriversLicense> driversLicenses = new ArrayList<>();
        String[] dCSVFile = csvFile.split(",");
        name.setName(dCSVFile[0]);
        name.setAddress((dCSVFile[1]));
        name.setEyeColor(dCSVFile[2]);
        name.setDateOfBirth(new Date (dCSVFile[3]));
        name.setIssueDate(new Date (dCSVFile[4]));
        name.setExpirationDate((new Date (dCSVFile[5])));
        name.setLicenseNumber(dCSVFile[6]);
        name.setIssuingState(dCSVFile[7]);
        name.setEndorsements(dCSVFile[8]);
        name.setSex(dCSVFile[9].charAt(0));
        name.setFederallyCompliant(parseBoolean(dCSVFile[10]));
        name.setLicenseClassification(dCSVFile[11].charAt(0));
        driversLicenses.add(name);
        return driversLicenses;
    }


}
