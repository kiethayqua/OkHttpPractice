package vn.kietnguyendev.okhttppractice

class ApiHelperImpl(private val userApi: UserApi): ApiHelper {
    override suspend fun getUsers() = userApi.getUsers()
}