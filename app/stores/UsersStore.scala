package stores

import models._
import scala.collection.LinearSeq

trait UsersStore {
  def find(id: Long): Option[User]
  def all(): LinearSeq[User]
  def save(user: User)
}

private[stores] class UsersStoreMapImpl extends UsersStore {
  private val users = scala.collection.mutable.Map(
    0l -> User(0l, "Foo", "Bar", 12),
    1l -> User(1l, "Bar", "Foo", 23),
    2l -> User(2l, "Baz", "Boo", 31)
  )

  override def find(id: Long): Option[User] = users.get(id)
  override def all(): LinearSeq[User] = users.values.toList
  override def save(user: User) = {
    val nextId = users.size + 1
    users.put(nextId, user)
  }
}

private[stores] class UsersStoreMongoDbImpl extends UsersStore {
  override def find(id: Long): Option[User] = ???
  override def all: LinearSeq[User] = ???
  override def save(user: User) = ???
}
