package typings.zeromq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zeromq", "proxy")
@js.native
object proxy extends js.Object {
  
  def apply(frontend: Socket_, backend: Socket_): Unit = js.native
  def apply(frontend: Socket_, backend: Socket_, capture: Socket_): Unit = js.native
}
