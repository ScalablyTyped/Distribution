package typings
package zeromqLib.zeromqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zeromq", JSImport.Namespace)
@js.native
object zeromqModMembers extends js.Object {
  var options: SocketOptions = js.native
  var types: SocketTypes = js.native
  var version: java.lang.String = js.native
  def createSocket(`type`: java.lang.String): Socket = js.native
  def createSocket(`type`: java.lang.String, options: js.Any): Socket = js.native
  def curveKeypair(): CurveKeyPair = js.native
  def proxy(frontend: Socket, backend: Socket): scala.Unit = js.native
  def proxy(frontend: Socket, backend: Socket, capture: Socket): scala.Unit = js.native
  def socket(`type`: java.lang.String): Socket = js.native
  def socket(`type`: java.lang.String, options: js.Any): Socket = js.native
  def socket(`type`: scala.Double): Socket = js.native
  def socket(`type`: scala.Double, options: js.Any): Socket = js.native
}

