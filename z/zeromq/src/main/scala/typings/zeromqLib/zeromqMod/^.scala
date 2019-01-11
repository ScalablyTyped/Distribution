package typings
package zeromqLib.zeromqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zeromq", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var options: zeromqLib.zeromqMod.SocketOptions = js.native
  var types: zeromqLib.zeromqMod.SocketTypes = js.native
  var version: java.lang.String = js.native
  def createSocket(`type`: java.lang.String): zeromqLib.zeromqMod.Socket = js.native
  def createSocket(`type`: java.lang.String, options: js.Any): zeromqLib.zeromqMod.Socket = js.native
  def curveKeypair(): zeromqLib.zeromqMod.CurveKeyPair = js.native
  def proxy(frontend: zeromqLib.zeromqMod.Socket, backend: zeromqLib.zeromqMod.Socket): scala.Unit = js.native
  def proxy(
    frontend: zeromqLib.zeromqMod.Socket,
    backend: zeromqLib.zeromqMod.Socket,
    capture: zeromqLib.zeromqMod.Socket
  ): scala.Unit = js.native
  def socket(`type`: java.lang.String): zeromqLib.zeromqMod.Socket = js.native
  def socket(`type`: java.lang.String, options: js.Any): zeromqLib.zeromqMod.Socket = js.native
  def socket(`type`: scala.Double): zeromqLib.zeromqMod.Socket = js.native
  def socket(`type`: scala.Double, options: js.Any): zeromqLib.zeromqMod.Socket = js.native
}

