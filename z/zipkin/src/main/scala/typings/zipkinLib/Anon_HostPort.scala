package typings
package zipkinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HostPort extends js.Object {
  var host: js.UndefOr[zipkinLib.zipkinMod.InetAddress] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var serviceName: java.lang.String
}

object Anon_HostPort {
  @scala.inline
  def apply(
    serviceName: java.lang.String,
    host: zipkinLib.zipkinMod.InetAddress = null,
    port: scala.Int | scala.Double = null
  ): Anon_HostPort = {
    val __obj = js.Dynamic.literal(serviceName = serviceName)
    if (host != null) __obj.updateDynamic("host")(host)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HostPort]
  }
}

