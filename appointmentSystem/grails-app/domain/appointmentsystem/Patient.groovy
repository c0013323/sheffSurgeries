package appointmentsystem

class Patient {
    static belongsTo = Surgery
    static hasMany = [appointments: Appointment, prescriptions: Prescription]

    String patientName
    String patientAddress
    String patientResidence
    Date patientDob
    String patientID
    Date dateRegistered
    String patientPhone

    static constraints = {
        patientName nullable: false
        patientAddress nullable: false
        patientResidence nullable: false
        patientDob nullable: false
        patientID nullable: false
        dateRegistered nullable: false
        patientPhone nullable: false
    }
}
