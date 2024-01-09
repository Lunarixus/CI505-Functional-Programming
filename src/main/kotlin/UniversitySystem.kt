class UniversitySystem(val students: List<Student> = mutableListOf()) {
    fun addStudent(student: Student): UniversitySystem {
        return UniversitySystem(students + student)
    }

    fun removeStudentById(studentId: Int): UniversitySystem {
        return UniversitySystem(students.filterNot { it.id == studentId })
    }

    fun queryByName(studentName: String): UniversitySystem {
        return UniversitySystem(students.filter { it.name == studentName })
    }

    fun queryById(studentId: Int): UniversitySystem {
        return UniversitySystem(students.filter { it.id == studentId })
    }

    fun queryByCourse(courseName: String): UniversitySystem {
        return UniversitySystem(students.filter { it.course == courseName })
    }

    fun queryByAvgMarks(avgMarks: Double): UniversitySystem {
        return UniversitySystem(students.filter { it.avgMarks >= avgMarks })
    }
}