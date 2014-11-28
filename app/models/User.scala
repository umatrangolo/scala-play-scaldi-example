package models

case class User(id: Long, name: String, surname: String, age: Int) {
  require(name.size > 0)
  require(surname.size > 0)
  require(age > 0)
}
