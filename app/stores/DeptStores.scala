package stores

import models._
import scala.collection.LinearSeq
import play.api.Logger

trait DeptsStore {
  def loadAll(): LinearSeq[String]
}

trait LifeCycle {
  def start()
  def stop()
}

private[stores] class DeptsStoreMapImpl extends DeptsStore {
  override def loadAll(): LinearSeq[String] = ???
}

private[stores] class DeptsStorePostGresImpl extends DeptsStore with LifeCycle {
  val log = Logger(this.getClass)

  override def start() { println("DeptsStorePostGresImpl started") }
  override def stop() { println("DeptsStorePostGresImpl stopped") }

  override def loadAll(): LinearSeq[String] = ???
}
