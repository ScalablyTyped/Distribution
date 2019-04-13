package typings
package zipkinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Host extends js.Object {
  var host: zipkinLib.zipkinMod.InetAddress
  var port: scala.Double
}

object Anon_Host {
  @scala.inline
  def apply(host: zipkinLib.zipkinMod.InetAddress, port: scala.Double): Anon_Host = {
    val __obj = js.Dynamic.literal(host = host, port = port)
  
    __obj.asInstanceOf[Anon_Host]
  }
}

