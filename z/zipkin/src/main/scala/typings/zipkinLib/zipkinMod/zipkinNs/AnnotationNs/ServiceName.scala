package typings
package zipkinLib.zipkinMod.zipkinNs.AnnotationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceName
  extends zipkinLib.zipkinMod.zipkinNs.IAnnotation {
  var serviceName: java.lang.String
}

object ServiceName {
  @scala.inline
  def apply(annotationType: java.lang.String, serviceName: java.lang.String): ServiceName = {
    val __obj = js.Dynamic.literal(annotationType = annotationType, serviceName = serviceName)
  
    __obj.asInstanceOf[ServiceName]
  }
}

