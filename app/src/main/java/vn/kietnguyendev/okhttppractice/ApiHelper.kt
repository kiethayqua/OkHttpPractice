package vn.kietnguyendev.okhttppractice

interface ApiHelper {
    suspend fun getUsers(): List<User>
}