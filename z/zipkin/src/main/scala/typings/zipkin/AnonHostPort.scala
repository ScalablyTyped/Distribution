package typings.zipkin

import typings.zipkin.mod.InetAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHostPort extends js.Object {
  var host: js.UndefOr[InetAddress] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
}

object AnonHostPort {
  @scala.inline
  def apply(host: InetAddress = null, port: Int | Double = null): AnonHostPort = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHostPort]
  }
}

