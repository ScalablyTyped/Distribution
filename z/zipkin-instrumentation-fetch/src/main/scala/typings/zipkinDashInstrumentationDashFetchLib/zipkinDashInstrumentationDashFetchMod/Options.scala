package typings
package zipkinDashInstrumentationDashFetchLib.zipkinDashInstrumentationDashFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var remoteServiceName: java.lang.String
  var tracer: zipkinLib.zipkinMod.Tracer
}

object Options {
  @scala.inline
  def apply(remoteServiceName: java.lang.String, tracer: zipkinLib.zipkinMod.Tracer): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("remoteServiceName")(remoteServiceName)
    __obj.updateDynamic("tracer")(tracer)
    __obj.asInstanceOf[Options]
  }
}

