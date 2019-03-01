package typings
package zipkinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ipv4 extends js.Object {
  var ipv4: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var serviceName: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Ipv4 {
  @scala.inline
  def apply(
    ipv4: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    serviceName: java.lang.String = null
  ): Anon_Ipv4 = {
    val __obj = js.Dynamic.literal()
    if (ipv4 != null) __obj.updateDynamic("ipv4")(ipv4)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName)
    __obj.asInstanceOf[Anon_Ipv4]
  }
}

