package typings.zipkinInstrumentationExpress

import typings.zipkin.mod.Tracer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPort extends js.Object {
  var port: js.UndefOr[Double] = js.undefined
  var tracer: Tracer
}

object AnonPort {
  @scala.inline
  def apply(tracer: Tracer, port: Int | Double = null): AnonPort = {
    val __obj = js.Dynamic.literal(tracer = tracer.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPort]
  }
}

