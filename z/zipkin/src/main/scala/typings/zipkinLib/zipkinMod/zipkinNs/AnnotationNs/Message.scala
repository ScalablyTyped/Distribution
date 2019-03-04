package typings
package zipkinLib.zipkinMod.zipkinNs.AnnotationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message
  extends zipkinLib.zipkinMod.zipkinNs.IAnnotation {
  var message: java.lang.String
}

object Message {
  @scala.inline
  def apply(annotationType: java.lang.String, message: java.lang.String): Message = {
    val __obj = js.Dynamic.literal(annotationType = annotationType, message = message)
  
    __obj.asInstanceOf[Message]
  }
}

