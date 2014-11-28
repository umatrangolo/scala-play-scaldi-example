package controllers

import managers._

import play.api._
import play.api.mvc._

import scaldi.{ Injectable, Injector }

class Users(implicit inj: Injector) extends Controller with Injectable {
  private val manager = inject [UsersManager]

  def index = Action {
    val allUsers = manager.loadAllUsers()
    Ok(allUsers.mkString("\n"))
  }

}
