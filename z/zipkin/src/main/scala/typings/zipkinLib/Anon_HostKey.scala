package typings
package zipkinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HostKey extends js.Object {
  var host: js.UndefOr[java.lang.String] = js.undefined
  var port: scala.Double
  var serverTags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var serviceName: js.UndefOr[java.lang.String] = js.undefined
  var tracer: zipkinLib.zipkinMod.zipkinNs.Tracer
}

object Anon_HostKey {
  @scala.inline
  def apply(
    port: scala.Double,
    tracer: zipkinLib.zipkinMod.zipkinNs.Tracer,
    host: java.lang.String = null,
    serverTags: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    serviceName: java.lang.String = null
  ): Anon_HostKey = {
    val __obj = js.Dynamic.literal(port = port, tracer = tracer)
    if (host != null) __obj.updateDynamic("host")(host)
    if (serverTags != null) __obj.updateDynamic("serverTags")(serverTags)
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName)
    __obj.asInstanceOf[Anon_HostKey]
  }
}

