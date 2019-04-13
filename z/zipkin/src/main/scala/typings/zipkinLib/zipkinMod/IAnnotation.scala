package typings
package zipkinLib.zipkinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnnotation extends js.Object {
  val annotationType: java.lang.String
}

object IAnnotation {
  @scala.inline
  def apply(annotationType: java.lang.String): IAnnotation = {
    val __obj = js.Dynamic.literal(annotationType = annotationType)
  
    __obj.asInstanceOf[IAnnotation]
  }
}

