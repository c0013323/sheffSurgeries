package appointmentsystem

class Appointment {
    static belongsTo = Surgery
    static hasOne = [doctor: Doctor]
    static hasMany = [nurses: Nurse, patient: Patient]

    Date appDateTime
    Integer appDuration
    String roomNumber

    static constraints = {
        appDateTime nullable: false
        appDuration nullable: false
        roomNumber nullable: false
    }
}