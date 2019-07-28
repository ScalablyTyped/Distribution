package typings.zipkin

import org.scalablytyped.runtime.StringDictionary
import typings.zipkin.zipkinMod.Tracer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HostKey extends js.Object {
  var host: js.UndefOr[String] = js.undefined
  var port: Double
  var serverTags: js.UndefOr[StringDictionary[String]] = js.undefined
  var serviceName: js.UndefOr[String] = js.undefined
  var tracer: Tracer
}

object Anon_HostKey {
  @scala.inline
  def apply(
    port: Double,
    tracer: Tracer,
    host: String = null,
    serverTags: StringDictionary[String] = null,
    serviceName: String = null
  ): Anon_HostKey = {
    val __obj = js.Dynamic.literal(port = port, tracer = tracer)
    if (host != null) __obj.updateDynamic("host")(host)
    if (serverTags != null) __obj.updateDynamic("serverTags")(serverTags)
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName)
    __obj.asInstanceOf[Anon_HostKey]
  }
}

