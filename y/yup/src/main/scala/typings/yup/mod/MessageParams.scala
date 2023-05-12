package typings.yup.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageParams extends StObject {
  
  var label: String
  
  var originalValue: Any
  
  var path: String
  
  var spec: SchemaSpec[Any] & (Record[String, Any])
  
  var `type`: String
  
  var value: Any
}
object MessageParams {
  
  inline def apply(
    label: String,
    originalValue: Any,
    path: String,
    spec: SchemaSpec[Any] & (Record[String, Any]),
    `type`: String,
    value: Any
  ): MessageParams = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageParams] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOriginalValue(value: Any): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSpec(value: SchemaSpec[Any] & (Record[String, Any])): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
