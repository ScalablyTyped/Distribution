package typings.zipkin

import typings.zipkin.mod.InetAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPort extends js.Object {
  var host: InetAddress
  var port: Double
}

object AnonPort {
  @scala.inline
  def apply(host: InetAddress, port: Double): AnonPort = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPort]
  }
}

