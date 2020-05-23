package typings.zipkin.anon

import typings.zipkin.mod.InetAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostPort extends js.Object {
  var host: js.UndefOr[InetAddress] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
}

object HostPort {
  @scala.inline
  def apply(host: InetAddress = null, port: js.UndefOr[Double] = js.undefined): HostPort = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostPort]
  }
}

