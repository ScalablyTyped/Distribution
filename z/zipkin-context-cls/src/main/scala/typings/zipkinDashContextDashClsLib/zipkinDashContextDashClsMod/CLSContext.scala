package typings
package zipkinDashContextDashClsLib.zipkinDashContextDashClsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CLSContext
  extends zipkinLib.zipkinMod.zipkinNs.Context[js.Any] {
  def letContext[V](ctx: zipkinLib.zipkinMod.TraceId, callback: js.Function0[V]): V
  def setContext(ctx: zipkinLib.zipkinMod.TraceId): scala.Unit
}

