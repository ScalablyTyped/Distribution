package typings.zipkin

import typings.zipkin.mod.InetAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHostPort extends js.Object {
  var host: InetAddress
  var port: Double
}

object AnonHostPort {
  @scala.inline
  def apply(host: InetAddress, port: Double): AnonHostPort = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHostPort]
  }
}

