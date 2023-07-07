package appointmentsystem

class Receptionist {
    static belongsTo = Surgery

    String recepName
    String recepEmail
    String recepUsername
    String recepPassword
    String recepPhone

    static constraints = {
        recepName nullable: false
        recepEmail nullable: false
        recepUsername nullable: false
        recepPassword nullable: false
        recepPhone nullable: false
    }
}