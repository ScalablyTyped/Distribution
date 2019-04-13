package typings
package zipkinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RemoteServiceName extends js.Object {
  var remoteServiceName: js.UndefOr[java.lang.String] = js.undefined
  var serviceName: java.lang.String
  var tracer: zipkinLib.zipkinMod.Tracer
}

object Anon_RemoteServiceName {
  @scala.inline
  def apply(
    serviceName: java.lang.String,
    tracer: zipkinLib.zipkinMod.Tracer,
    remoteServiceName: java.lang.String = null
  ): Anon_RemoteServiceName = {
    val __obj = js.Dynamic.literal(serviceName = serviceName, tracer = tracer)
    if (remoteServiceName != null) __obj.updateDynamic("remoteServiceName")(remoteServiceName)
    __obj.asInstanceOf[Anon_RemoteServiceName]
  }
}

