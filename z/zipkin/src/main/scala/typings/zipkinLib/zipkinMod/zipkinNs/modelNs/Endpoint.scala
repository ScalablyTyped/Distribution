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
    isEmpty: js.Function0[scala.Boolean],
    setIpv4: js.Function1[java.lang.String, scala.Unit],
    setPort: js.Function1[scala.Double, scala.Unit],
    setServiceName: js.Function1[java.lang.String, scala.Unit]
  ): Endpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isEmpty")(isEmpty)
    __obj.updateDynamic("setIpv4")(setIpv4)
    __obj.updateDynamic("setPort")(setPort)
    __obj.updateDynamic("setServiceName")(setServiceName)
    __obj.asInstanceOf[Endpoint]
  }
}

