// Create a static data class for Students
data class Student (
    val id: Int,
    val name: String,
    val course: String,
    val avgMarks: Double
)

class UniversitySystem(private val Students: MutableList<Student> = mutableListOf())
{
    fun addStudent(Student: Student)
    {

    }

    fun removeStudentById(StudentId: Int)
    {

    }

    fun queryByName(StudentName: String)
    {

    }

    fun queryById(StudentId: Int)
    {

    }

    fun queryByCourse(CourseName: String)
    {

    }

    fun queryByAvgMarks(AvgMarks: Double)
    {

    }
}

fun main() {
    println("CI505 - Functional Programming")
}