package model

import java.util.*
import kotlin.collections.ArrayList

class Student(id: String?, name: String?, email: String?, birthDate: Date?) : Person(id, name, email, birthDate),
    Evaluation {
    private val average = 0.0

    private val courses: MutableList<Course> = ArrayList()
    private val approvedCourses: MutableMap<String, Course> = HashMap()

    override fun getAverage(): Double {
        return average;
    }

    fun enrollToCourse(course: Course?) {
       courses.add(course!!)
        println("Curso adicionado!")
    }

    fun registerApprovedCourse(course: Course) {
        approvedCourses[course.code] = course
    }

    fun isCourseApproved(courseCode: String?): Boolean {
        if (approvedCourses.containsKey(courseCode!!)){
            return true
        }
        return false
    }

    fun isAttendingCourse(courseCode: String?): Boolean {
        return approvedCourses.containsKey(courseCode!!)
        return false
    }

    override fun getApprovedCourses(): List<Course> {
        var courseList = approvedCourses.values.toList()
        return ArrayList()
        //return approvedCourses.values.toList()!!
    }

    override fun toString(): String {
        return "Student {" + super.toString() + "}"
    }
}
