package typings.zipkin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin", "InetAddress")
@js.native
class InetAddress protected () extends js.Object {
  def this(addr: String) = this()
  def ipv4(): String = js.native
  def toInt(): Double = js.native
}

/* static members */
@JSImport("zipkin", "InetAddress")
@js.native
object InetAddress extends js.Object {
  def getLocalAddress(): InetAddress = js.native
}

