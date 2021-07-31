package typings.zipkin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAnnotation extends StObject {
  
  val annotationType: String
}
object IAnnotation {
  
  @scala.inline
  def apply(annotationType: String): IAnnotation = {
    val __obj = js.Dynamic.literal(annotationType = annotationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnnotation]
  }
  
  @scala.inline
  implicit class IAnnotationMutableBuilder[Self <: IAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationType(value: String): Self = StObject.set(x, "annotationType", value.asInstanceOf[js.Any])
  }
}
