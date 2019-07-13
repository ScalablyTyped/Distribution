package typings
package zipkinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RemoteServiceName extends js.Object {
  var remoteServiceName: js.UndefOr[java.lang.String] = js.undefined
  var serviceName: js.UndefOr[java.lang.String] = js.undefined
  var tracer: zipkinLib.zipkinMod.Tracer
}

object Anon_RemoteServiceName {
  @scala.inline
  def apply(
    tracer: zipkinLib.zipkinMod.Tracer,
    remoteServiceName: java.lang.String = null,
    serviceName: java.lang.String = null
  ): Anon_RemoteServiceName = {
    val __obj = js.Dynamic.literal(tracer = tracer)
    if (remoteServiceName != null) __obj.updateDynamic("remoteServiceName")(remoteServiceName)
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName)
    __obj.asInstanceOf[Anon_RemoteServiceName]
  }
}

