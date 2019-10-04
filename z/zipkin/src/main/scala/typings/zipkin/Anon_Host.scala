package typings.zipkin

import typings.zipkin.zipkinMod.InetAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Host extends js.Object {
  var host: js.UndefOr[InetAddress] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var serviceName: String
}

object Anon_Host {
  @scala.inline
  def apply(serviceName: String, host: InetAddress = null, port: Int | Double = null): Anon_Host = {
    val __obj = js.Dynamic.literal(serviceName = serviceName)
    if (host != null) __obj.updateDynamic("host")(host)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Host]
  }
}

