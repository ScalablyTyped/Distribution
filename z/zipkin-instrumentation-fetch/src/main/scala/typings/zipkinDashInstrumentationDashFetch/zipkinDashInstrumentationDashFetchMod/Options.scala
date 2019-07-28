package typings.zipkinDashInstrumentationDashFetch.zipkinDashInstrumentationDashFetchMod

import typings.zipkin.zipkinMod.Tracer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var remoteServiceName: String
  var tracer: Tracer
}

object Options {
  @scala.inline
  def apply(remoteServiceName: String, tracer: Tracer): Options = {
    val __obj = js.Dynamic.literal(remoteServiceName = remoteServiceName, tracer = tracer)
  
    __obj.asInstanceOf[Options]
  }
}

