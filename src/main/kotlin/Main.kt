fun main() {
    println("CI505 - Functional Programming")

    // Create an instance of the UniversitySystem class
    val universityRegister = UniversitySystem()

    // Create an example student
    val exampleStudent = Student(0, "Mark", "Computer Science", 65.7)

    // Add the student to the register
    var updatedRegister = universityRegister.addStudent(exampleStudent)

    // Print every student in the register
    updatedRegister.printAllStudents()

    // Remove the student from the register
    updatedRegister = updatedRegister.removeStudentById(0)

    // Print every student in the register again
    updatedRegister.printAllStudents()
}