package typings.zipkinInstrumentationFetch.mod

import typings.zipkin.mod.Tracer
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
    val __obj = js.Dynamic.literal(remoteServiceName = remoteServiceName.asInstanceOf[js.Any], tracer = tracer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

