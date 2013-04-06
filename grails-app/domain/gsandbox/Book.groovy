package gsandbox

class Book {

    static belongsTo = [Author]

    String name


    static constraints = {
        name nullable: false
    }
}
