package typings.zipkin

import typings.zipkin.zipkinMod.InetAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HostPortInetAddress extends js.Object {
  var host: js.UndefOr[InetAddress] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
}

object Anon_HostPortInetAddress {
  @scala.inline
  def apply(host: InetAddress = null, port: Int | Double = null): Anon_HostPortInetAddress = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HostPortInetAddress]
  }
}

