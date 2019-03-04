package typings
package zipkinLib.zipkinMod.zipkinNs.AnnotationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rpc
  extends zipkinLib.zipkinMod.zipkinNs.IAnnotation {
  var name: java.lang.String
}

object Rpc {
  @scala.inline
  def apply(annotationType: java.lang.String, name: java.lang.String): Rpc = {
    val __obj = js.Dynamic.literal(annotationType = annotationType, name = name)
  
    __obj.asInstanceOf[Rpc]
  }
}

