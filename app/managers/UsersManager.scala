package managers

import models._
import stores._
import scala.collection.LinearSeq

import scaldi._

trait UsersManager {
  def loadAllUsers(): LinearSeq[User]
  def laodAllDepts(): LinearSeq[String]
  def find(id: Long): Option[User]
  def store(user: User)
}

private[managers] class UsersManagerImpl(implicit inj: Injector) extends UsersManager with Injectable {
  private val usersStore: UsersStore = inject [UsersStore]
  private val deptsStore: DeptsStore = inject [DeptsStore]

  def init() { println("Init UsersManagerImpl...") }

  override def loadAllUsers(): LinearSeq[User] = usersStore.all()
  override def laodAllDepts(): LinearSeq[String] = deptsStore.loadAll()

  override def find(id: Long): Option[User] = ???
  override def store(user: User) = ???
}
