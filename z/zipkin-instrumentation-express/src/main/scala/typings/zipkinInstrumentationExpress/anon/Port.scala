package typings.zipkinInstrumentationExpress.anon

import typings.zipkin.mod.Tracer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Port extends js.Object {
  var port: js.UndefOr[Double] = js.undefined
  var tracer: Tracer
}

object Port {
  @scala.inline
  def apply(tracer: Tracer, port: js.UndefOr[Double] = js.undefined): Port = {
    val __obj = js.Dynamic.literal(tracer = tracer.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Port]
  }
}

