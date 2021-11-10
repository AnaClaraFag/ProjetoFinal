package service

import model.Course
import model.Module
import org.junit.Test
import org.junit.Assert.assertEquals


internal class CourseServiceTest {
    val listCourse = CourseService()
    val curso = Course("INTRO-CS-2", "Introduction to Algorithms", 9,
        Module("INTRO-CS-2", "Introduction to Algorithms", "Introdução a algoritmos"))

    @Test
    fun getCourse() {
        listCourse.registerCourse(curso)
        assertEquals(true, listCourse.isInList("INTRO-CS-2"))
    }
}
