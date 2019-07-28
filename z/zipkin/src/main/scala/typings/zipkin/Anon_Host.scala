package typings.zipkin

import typings.zipkin.zipkinMod.InetAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Host extends js.Object {
  var host: InetAddress
  var port: Double
}

object Anon_Host {
  @scala.inline
  def apply(host: InetAddress, port: Double): Anon_Host = {
    val __obj = js.Dynamic.literal(host = host, port = port)
  
    __obj.asInstanceOf[Anon_Host]
  }
}

