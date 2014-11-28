import stores._
import managers._
import controllers._

import play.api._
import play.api.mvc.Results._
import play.api.mvc._
import scala.concurrent.Future


import scaldi.play.ScaldiSupport

object Global extends ScaldiSupport {

  override def applicationModule = new WebModule :: new ManagersModule :: new StoresModule

  override def onStart(app: Application) {
    super.onStart(app)
    Logger.info("Application has started")
  }

  override def onStop(app: Application) {
    super.onStop(app)
    Logger.info("Application shutdown...")
  }

}
