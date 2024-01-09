class UniversitySystem(val students: List<Student> = mutableListOf()) {
    fun addStudent(student: Student): UniversitySystem { // Add a Student
        return UniversitySystem(students + student)
    }

    fun removeStudentById(studentId: Int): UniversitySystem { // Remove a student by ID
        return UniversitySystem(students.filterNot { it.id == studentId })
    }

    fun queryByName(studentName: String): UniversitySystem { // Query a Student by name
        return UniversitySystem(students.filter { it.name == studentName })
    }

    fun queryById(studentId: Int): UniversitySystem { // Query a Student by their ID
        return UniversitySystem(students.filter { it.id == studentId })
    }

    fun queryByCourse(courseName: String): UniversitySystem { // Query Students by course
        return UniversitySystem(students.filter { it.course == courseName })
    }

    fun queryByAvgMarks(avgMarks: Double): UniversitySystem { // Query Students by average marks (bigger than entered value)
        return UniversitySystem(students.filter { it.avgMarks >= avgMarks }) // Bigger than or equal to
    }
}