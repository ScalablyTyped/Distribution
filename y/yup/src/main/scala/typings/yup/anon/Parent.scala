package typings.yup.anon

import typings.yup.mod.ISchema
import typings.yup.mod.Reference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parent extends StObject {
  
  var parent: Any
  
  var parentPath: String
  
  var schema: (ISchema[Any, Any, Any, Any]) | Reference[Any]
}
object Parent {
  
  inline def apply(parent: Any, parentPath: String, schema: (ISchema[Any, Any, Any, Any]) | Reference[Any]): Parent = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], parentPath = parentPath.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parent] (val x: Self) extends AnyVal {
    
    inline def setParent(value: Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentPath(value: String): Self = StObject.set(x, "parentPath", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: (ISchema[Any, Any, Any, Any]) | Reference[Any]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
