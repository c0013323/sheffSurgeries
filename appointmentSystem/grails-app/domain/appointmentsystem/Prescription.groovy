package appointmentsystem

class Prescription {
    static belongsTo = Doctor
    static hasOne = [patient: Patient]

    String prescriptionNumber
    String medicine
    Integer daysSupply
    BigDecimal totalCost
    Date dateIssued
    Boolean patientPaying

    static constraints = {
        prescriptionNumber nullable: false
        medicine nullable: false
        daysSupply nullable: false
        totalCost nullable: false
        dateIssued nullable: false
        patientPaying nullable: false
    }
}