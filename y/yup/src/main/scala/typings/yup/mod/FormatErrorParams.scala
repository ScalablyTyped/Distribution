package typings.yup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatErrorParams extends StObject {
  
  var originalValue: js.UndefOr[js.Any] = js.undefined
  
  var path: String
  
  var `type`: String
  
  var value: js.UndefOr[js.Any] = js.undefined
}
object FormatErrorParams {
  
  @scala.inline
  def apply(path: String, `type`: String): FormatErrorParams = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatErrorParams]
  }
  
  @scala.inline
  implicit class FormatErrorParamsMutableBuilder[Self <: FormatErrorParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginalValue(value: js.Any): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalValueUndefined: Self = StObject.set(x, "originalValue", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
