package typings
package zipkinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HostPortInetAddress extends js.Object {
  var host: js.UndefOr[zipkinLib.zipkinMod.InetAddress] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
}

object Anon_HostPortInetAddress {
  @scala.inline
  def apply(host: zipkinLib.zipkinMod.InetAddress = null, port: scala.Int | scala.Double = null): Anon_HostPortInetAddress = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HostPortInetAddress]
  }
}

