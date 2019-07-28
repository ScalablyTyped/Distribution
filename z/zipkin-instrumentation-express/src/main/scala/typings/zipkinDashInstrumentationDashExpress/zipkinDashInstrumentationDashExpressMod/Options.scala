package typings.zipkinDashInstrumentationDashExpress.zipkinDashInstrumentationDashExpressMod

import typings.zipkin.zipkinMod.Tracer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var tracer: Tracer
}

object Options {
  @scala.inline
  def apply(tracer: Tracer): Options = {
    val __obj = js.Dynamic.literal(tracer = tracer)
  
    __obj.asInstanceOf[Options]
  }
}

