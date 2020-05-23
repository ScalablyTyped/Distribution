package typings.zipkin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ipv4 extends js.Object {
  var ipv4: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var serviceName: js.UndefOr[String] = js.undefined
}

object Ipv4 {
  @scala.inline
  def apply(ipv4: String = null, port: js.UndefOr[Double] = js.undefined, serviceName: String = null): Ipv4 = {
    val __obj = js.Dynamic.literal()
    if (ipv4 != null) __obj.updateDynamic("ipv4")(ipv4.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ipv4]
  }
}

