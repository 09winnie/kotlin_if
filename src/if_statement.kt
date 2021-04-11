fun main() {
    var employee=Employee()
    println(employee.getInfo(45000.toFloat(),12))
    println(employee.addSal())
    println(employee.addWork())
}
class Employee() {
    fun getInfo(salary: Float, hours: Int) {
        println("All em employees in Minet house earn a salary of $salary and they work for $hours hours each.")
    }

    fun addSal() {
        var salary = 60000
        if (salary < 50000) {
            println(salary + 10000)
        }
        else {
            println("The salary is enough for the month.")
        }
    }

    fun addWork() {
        var hours = 16
        var salary=60000
        if (hours > 6){
            println(salary+15000)
        }
        else{
            println("You are not serious with your job")
        }

    }
}
