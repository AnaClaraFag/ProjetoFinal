package service

import junit.framework.Assert.assertEquals
import model.Student
import org.junit.Test


internal class StudentServiceTest {

    val studentServ = StudentService()
    val student = Student("123", "Ana", "ana@gmail.com", null)

    @Test
    fun subscribeStudent() {
        studentServ.subscribeStudent(student)
        assertEquals(true, studentServ.isSubscribed("123"))
    }
}