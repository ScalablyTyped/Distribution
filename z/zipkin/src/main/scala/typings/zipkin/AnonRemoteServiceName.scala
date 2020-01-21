package typings.zipkin

import typings.zipkin.mod.Tracer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRemoteServiceName extends js.Object {
  var remoteServiceName: js.UndefOr[String] = js.undefined
  var serviceName: js.UndefOr[String] = js.undefined
  var tracer: Tracer
}

object AnonRemoteServiceName {
  @scala.inline
  def apply(tracer: Tracer, remoteServiceName: String = null, serviceName: String = null): AnonRemoteServiceName = {
    val __obj = js.Dynamic.literal(tracer = tracer.asInstanceOf[js.Any])
    if (remoteServiceName != null) __obj.updateDynamic("remoteServiceName")(remoteServiceName.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRemoteServiceName]
  }
}

