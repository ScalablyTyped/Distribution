package typings
package zipkinLib.zipkinMod.zipkinNs.AnnotationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientRecv
  extends zipkinLib.zipkinMod.zipkinNs.IAnnotation

object ClientRecv {
  @scala.inline
  def apply(annotationType: java.lang.String): ClientRecv = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("annotationType")(annotationType)
    __obj.asInstanceOf[ClientRecv]
  }
}

