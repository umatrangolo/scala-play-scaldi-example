package managers

import models._
import stores._

import org.junit.runner._

import org.specs2.mock._
import org.specs2.mutable._
import org.specs2.runner._

import scaldi._

@RunWith(classOf[JUnitRunner])
class UsersManagerImplSpec extends Specification with Mockito {
  isolated

  // collaborators
  private val mockUsersStore = mock[UsersStore]
  private val mockDeptsStore = mock[DeptsStore]

  // sut
  private val usersManager = new UsersManagerImpl()(inj = new Module {
    bind [UsersStore] to mockUsersStore
    bind [DeptsStore] to mockDeptsStore
  })

  "The UsersManager" should {
    "load all the users known so far" in {
      pending
      // TODO
    }
  }
}
