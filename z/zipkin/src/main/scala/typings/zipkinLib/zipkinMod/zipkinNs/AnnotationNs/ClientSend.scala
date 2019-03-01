package typings
package zipkinLib.zipkinMod.zipkinNs.AnnotationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientSend
  extends zipkinLib.zipkinMod.zipkinNs.IAnnotation

object ClientSend {
  @scala.inline
  def apply(annotationType: java.lang.String): ClientSend = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("annotationType")(annotationType)
    __obj.asInstanceOf[ClientSend]
  }
}

