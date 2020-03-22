package typings.zipkin

import org.scalablytyped.runtime.StringDictionary
import typings.zipkin.mod.Tracer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonServerTags extends js.Object {
  var host: js.UndefOr[String] = js.undefined
  var port: Double
  var serverTags: js.UndefOr[StringDictionary[String]] = js.undefined
  var serviceName: js.UndefOr[String] = js.undefined
  var tracer: Tracer
}

object AnonServerTags {
  @scala.inline
  def apply(
    port: Double,
    tracer: Tracer,
    host: String = null,
    serverTags: StringDictionary[String] = null,
    serviceName: String = null
  ): AnonServerTags = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], tracer = tracer.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (serverTags != null) __obj.updateDynamic("serverTags")(serverTags.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonServerTags]
  }
}

