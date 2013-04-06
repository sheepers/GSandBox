package gsandbox

class Author {

    static hasMany = [books : Book]
    String fullName

    static constraints = {
        fullName nullable: false
    }
}
