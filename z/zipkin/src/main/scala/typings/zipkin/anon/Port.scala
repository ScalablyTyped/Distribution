package typings.zipkin.anon

import typings.zipkin.mod.InetAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Port extends js.Object {
  var host: InetAddress
  var port: Double
}

object Port {
  @scala.inline
  def apply(host: InetAddress, port: Double): Port = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Port]
  }
}

