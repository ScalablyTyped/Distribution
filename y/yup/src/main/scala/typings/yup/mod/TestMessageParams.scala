package typings.yup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestMessageParams extends StObject {
  
  var label: String
  
  var originalValue: js.Any
  
  var path: String
  
  var value: js.Any
}
object TestMessageParams {
  
  @scala.inline
  def apply(label: String, originalValue: js.Any, path: String, value: js.Any): TestMessageParams = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestMessageParams]
  }
  
  @scala.inline
  implicit class TestMessageParamsMutableBuilder[Self <: TestMessageParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalValue(value: js.Any): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
