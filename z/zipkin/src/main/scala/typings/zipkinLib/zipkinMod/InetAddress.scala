package typings
package zipkinLib.zipkinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin", "InetAddress")
@js.native
class InetAddress protected ()
  extends zipkinLib.zipkinMod.zipkinNs.InetAddress {
  def this(addr: java.lang.String) = this()
  /* CompleteClass */
  override def ipv4(): java.lang.String = js.native
  /* CompleteClass */
  override def toInt(): scala.Double = js.native
}

/* static members */
@JSImport("zipkin", "InetAddress")
@js.native
object InetAddress extends js.Object {
  def getLocalAddress(): zipkinLib.zipkinMod.zipkinNs.InetAddress = js.native
}

