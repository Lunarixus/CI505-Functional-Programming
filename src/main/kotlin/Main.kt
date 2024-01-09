// Create a static data class for Students
data class Student (
    val id: Int,
    val name: String,
    val course: String,
    val avgMarks: Double
)

class UniversitySystem(val Students: List<Student> = mutableListOf())
{
    fun addStudent(student: Student): UniversitySystem
    {
        return UniversitySystem(Students + student) // Add a Student
    }

    fun removeStudentById(StudentId: Int): UniversitySystem
    {
        return UniversitySystem(Students.filterNot { it.id == StudentId })
    }

    fun queryByName(StudentName: String): UniversitySystem
    {
        return UniversitySystem(Students.filter { it.name == StudentName })
    }

    fun queryById(StudentId: Int): UniversitySystem
    {
        return UniversitySystem(Students.filter { it.id == StudentId })
    }

    fun queryByCourse(CourseName: String): UniversitySystem
    {
        return UniversitySystem(Students.filter { it.course == CourseName })
    }

    fun queryByAvgMarks(AvgMarks: Double): UniversitySystem
    {
        return UniversitySystem(Students.filter { it.avgMarks >= AvgMarks })
    }
}

fun main() {
    println("CI505 - Functional Programming")

    // Create an instance of the UniversitySystem class
    val universityregister = UniversitySystem()

    // Create an example student
    val example_student = Student(0, "Mark", "Computer Science", 65.7)

    // Add the student to the register
    var updatedRegister = universityregister.addStudent(example_student)

    // Print every student in the register
    updatedRegister.Students.forEach { println(it) }

    // Remove the student from the register
    updatedRegister = updatedRegister.removeStudentById(0)

    // Print every student in the register again
    updatedRegister.Students.forEach { println(it) }
}