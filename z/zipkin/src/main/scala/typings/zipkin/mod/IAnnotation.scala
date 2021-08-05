package typings.zipkin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAnnotation extends StObject {
  
  val annotationType: String
}
object IAnnotation {
  
  inline def apply(annotationType: String): IAnnotation = {
    val __obj = js.Dynamic.literal(annotationType = annotationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnnotation]
  }
  
  extension [Self <: IAnnotation](x: Self) {
    
    inline def setAnnotationType(value: String): Self = StObject.set(x, "annotationType", value.asInstanceOf[js.Any])
  }
}
