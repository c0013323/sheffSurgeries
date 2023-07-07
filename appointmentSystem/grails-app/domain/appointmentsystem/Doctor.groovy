package appointmentsystem

class Doctor {
    static belongsTo = Surgery
    static hasMany = [prescriptions: Prescription, appointments: Appointment]

    String doctorName
    String qualification
    String position
    String doctorEmail
    String password
    String doctorOffice
    String doctorPhone
    String bio

    static constraints = {
        doctorName nullable: false
        qualification nullable: false
        position nullable: false
        doctorEmail nullable: false
        password nullable: false
        doctorOffice nullable: true
        doctorPhone nullable: false
        bio nullable: true
    }
}
