package appointmentsystem

class Surgery {
    static hasMany = [doctors: Doctor, nurses: Nurse, receptionists: Receptionist, patients: Patient, appointments: Appointment]

    String name
    String address
    String postcode
    String telephone
    Integer numberOfPatients
    String description
    String openingTime
    Boolean registeringNewPatients

    static constraints = {
        name nullable: false
        address nullable: false
        postcode nullable: false
        telephone nullable: false
        numberOfPatients nullable: false
        description nullable: true
        openingTime nullable: false
        registeringNewPatients nullable: false
    }
}
