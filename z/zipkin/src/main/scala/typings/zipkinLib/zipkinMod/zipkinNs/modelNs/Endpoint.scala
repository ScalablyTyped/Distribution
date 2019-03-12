package typings
package zipkinLib.zipkinMod.zipkinNs.modelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Endpoint extends js.Object {
  def isEmpty(): scala.Boolean
  def setIpv4(ipv4: java.lang.String): scala.Unit
  def setPort(port: scala.Double): scala.Unit
  def setServiceName(serviceName: java.lang.String): scala.Unit
}

object Endpoint {
  @scala.inline
  def apply(
    isEmpty: () => scala.Boolean,
    setIpv4: java.lang.String => scala.Unit,
    setPort: scala.Double => scala.Unit,
    setServiceName: java.lang.String => scala.Unit
  ): Endpoint = {
    val __obj = js.Dynamic.literal(isEmpty = js.Any.fromFunction0(isEmpty), setIpv4 = js.Any.fromFunction1(setIpv4), setPort = js.Any.fromFunction1(setPort), setServiceName = js.Any.fromFunction1(setServiceName))
  
    __obj.asInstanceOf[Endpoint]
  }
}

