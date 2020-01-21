package typings.zipkin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIpv4 extends js.Object {
  var ipv4: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var serviceName: js.UndefOr[String] = js.undefined
}

object AnonIpv4 {
  @scala.inline
  def apply(ipv4: String = null, port: Int | Double = null, serviceName: String = null): AnonIpv4 = {
    val __obj = js.Dynamic.literal()
    if (ipv4 != null) __obj.updateDynamic("ipv4")(ipv4.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIpv4]
  }
}

