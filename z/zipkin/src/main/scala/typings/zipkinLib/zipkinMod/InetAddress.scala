package typings
package zipkinLib.zipkinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin", "InetAddress")
@js.native
class InetAddress protected () extends js.Object {
  def this(addr: java.lang.String) = this()
  def ipv4(): java.lang.String = js.native
  def toInt(): scala.Double = js.native
}

/* static members */
@JSImport("zipkin", "InetAddress")
@js.native
object InetAddress extends js.Object {
  def getLocalAddress(): zipkinLib.zipkinMod.InetAddress = js.native
}

