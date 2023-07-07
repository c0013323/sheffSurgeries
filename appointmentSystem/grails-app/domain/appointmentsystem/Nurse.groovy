package appointmentsystem

class Nurse {
    static belongsTo = Surgery
    static hasMany = [appointments: Appointment]

    String nurseName
    String qualifications
    String nurseEmail
    String nurseOffice
    String nursePhone

    static constraints = {
        nurseName nullable: false
        qualifications nullable: false
        nurseEmail nullable: false
        nurseOffice nullable: true
        nursePhone nullable: false
    }
}