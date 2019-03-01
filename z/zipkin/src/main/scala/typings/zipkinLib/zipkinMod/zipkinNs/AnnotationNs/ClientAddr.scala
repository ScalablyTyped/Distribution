package typings
package zipkinLib.zipkinMod.zipkinNs.AnnotationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientAddr
  extends zipkinLib.zipkinMod.zipkinNs.IAnnotation

object ClientAddr {
  @scala.inline
  def apply(annotationType: java.lang.String): ClientAddr = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("annotationType")(annotationType)
    __obj.asInstanceOf[ClientAddr]
  }
}

