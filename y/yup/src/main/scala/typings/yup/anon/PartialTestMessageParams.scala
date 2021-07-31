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
  
  @scala.inline
  def apply(): PartialTestMessageParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTestMessageParams]
  }
  
  @scala.inline
  implicit class PartialTestMessageParamsMutableBuilder[Self <: PartialTestMessageParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setOriginalValue(value: js.Any): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalValueUndefined: Self = StObject.set(x, "originalValue", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
