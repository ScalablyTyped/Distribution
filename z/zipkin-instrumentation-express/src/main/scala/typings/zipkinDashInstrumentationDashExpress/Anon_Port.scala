package typings.zipkinDashInstrumentationDashExpress

import typings.zipkin.zipkinMod.Tracer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Port extends js.Object {
  var port: js.UndefOr[Double] = js.undefined
  var tracer: Tracer
}

object Anon_Port {
  @scala.inline
  def apply(tracer: Tracer, port: Int | Double = null): Anon_Port = {
    val __obj = js.Dynamic.literal(tracer = tracer)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Port]
  }
}

