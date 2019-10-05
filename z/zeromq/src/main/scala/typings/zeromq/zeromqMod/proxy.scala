package typings.zeromq.zeromqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zeromq", "proxy")
@js.native
object proxy extends js.Object {
  def apply(frontend: Socket, backend: Socket): Unit = js.native
  def apply(frontend: Socket, backend: Socket, capture: Socket): Unit = js.native
}

