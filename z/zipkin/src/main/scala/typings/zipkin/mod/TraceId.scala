package typings.zipkin.mod

import typings.zipkin.anon.Debug
import typings.zipkin.mod.option.IOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zipkin", "TraceId")
@js.native
class TraceId () extends js.Object {
  def this(args: Debug) = this()
  
  def isDebug(): Boolean = js.native
  
  def isShared(): Boolean = js.native
  
  val parentSpanId: IOption[String] = js.native
  
  val sampled: IOption[Boolean] = js.native
  
  val spanId: String = js.native
  
  val traceId: String = js.native
}
