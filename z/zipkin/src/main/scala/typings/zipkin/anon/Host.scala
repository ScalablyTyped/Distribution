package typings.zipkin.anon

import typings.zipkin.mod.InetAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Host extends js.Object {
  var host: js.UndefOr[InetAddress] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var serviceName: String
}

object Host {
  @scala.inline
  def apply(serviceName: String, host: InetAddress = null, port: js.UndefOr[Double] = js.undefined): Host = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Host]
  }
}

