package typings.yup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<yup.yup.TestMessageParams> */
trait PartialTestMessageParams extends StObject {
  
  var label: js.UndefOr[String] = js.undefined
  
  var originalValue: js.UndefOr[js.Any] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[js.Any] = js.undefined
}
object PartialTestMessageParams {
  
  inline def apply(): PartialTestMessageParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTestMessageParams]
  }
  
  extension [Self <: PartialTestMessageParams](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOriginalValue(value: js.Any): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
    
    inline def setOriginalValueUndefined: Self = StObject.set(x, "originalValue", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
