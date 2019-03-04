package typings
package zipkinLib.zipkinMod.zipkinNs.AnnotationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerAddr
  extends zipkinLib.zipkinMod.zipkinNs.IAnnotation {
  var host: zipkinLib.zipkinMod.zipkinNs.InetAddress
  var port: scala.Double
  var serviceName: java.lang.String
}

object ServerAddr {
  @scala.inline
  def apply(
    annotationType: java.lang.String,
    host: zipkinLib.zipkinMod.zipkinNs.InetAddress,
    port: scala.Double,
    serviceName: java.lang.String
  ): ServerAddr = {
    val __obj = js.Dynamic.literal(annotationType = annotationType, host = host, port = port, serviceName = serviceName)
  
    __obj.asInstanceOf[ServerAddr]
  }
}

