package typings.zipkin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnnotation extends js.Object {
  val annotationType: String
}

object IAnnotation {
  @scala.inline
  def apply(annotationType: String): IAnnotation = {
    val __obj = js.Dynamic.literal(annotationType = annotationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnnotation]
  }
}

