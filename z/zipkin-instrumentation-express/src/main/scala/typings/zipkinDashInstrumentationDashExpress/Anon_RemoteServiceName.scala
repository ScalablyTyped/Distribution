package typings.zipkinDashInstrumentationDashExpress

import typings.zipkin.zipkinMod.Tracer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RemoteServiceName extends js.Object {
  var remoteServiceName: js.UndefOr[String] = js.undefined
  var tracer: Tracer
}

object Anon_RemoteServiceName {
  @scala.inline
  def apply(tracer: Tracer, remoteServiceName: String = null): Anon_RemoteServiceName = {
    val __obj = js.Dynamic.literal(tracer = tracer)
    if (remoteServiceName != null) __obj.updateDynamic("remoteServiceName")(remoteServiceName)
    __obj.asInstanceOf[Anon_RemoteServiceName]
  }
}

