package typings
package zipkinDashInstrumentationDashExpressLib.zipkinDashInstrumentationDashExpressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var tracer: zipkinLib.zipkinMod.Tracer
}

object Options {
  @scala.inline
  def apply(tracer: zipkinLib.zipkinMod.Tracer): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tracer")(tracer)
    __obj.asInstanceOf[Options]
  }
}

