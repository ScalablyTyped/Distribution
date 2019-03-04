package typings
package zipkinLib.zipkinMod.zipkinNs.AnnotationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryAnnotation
  extends zipkinLib.zipkinMod.zipkinNs.IAnnotation {
  var key: java.lang.String
  var value: java.lang.String
}

object BinaryAnnotation {
  @scala.inline
  def apply(annotationType: java.lang.String, key: java.lang.String, value: java.lang.String): BinaryAnnotation = {
    val __obj = js.Dynamic.literal(annotationType = annotationType, key = key, value = value)
  
    __obj.asInstanceOf[BinaryAnnotation]
  }
}

