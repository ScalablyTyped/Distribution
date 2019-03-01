package typings
package zipkinLib.zipkinMod.zipkinNs.AnnotationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalAddr
  extends zipkinLib.zipkinMod.zipkinNs.IAnnotation {
  var host: zipkinLib.zipkinMod.zipkinNs.InetAddress
  var port: scala.Double
}

object LocalAddr {
  @scala.inline
  def apply(
    annotationType: java.lang.String,
    host: zipkinLib.zipkinMod.zipkinNs.InetAddress,
    port: scala.Double
  ): LocalAddr = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("annotationType")(annotationType)
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("port")(port)
    __obj.asInstanceOf[LocalAddr]
  }
}

