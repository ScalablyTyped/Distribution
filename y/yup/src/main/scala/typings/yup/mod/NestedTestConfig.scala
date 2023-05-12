package typings.yup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NestedTestConfig extends StObject {
  
  var index: js.UndefOr[Double] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var options: InternalOptions[Any]
  
  var originalParent: Any
  
  var parent: Any
  
  var parentPath: js.UndefOr[String] = js.undefined
}
object NestedTestConfig {
  
  inline def apply(options: InternalOptions[Any], originalParent: Any, parent: Any): NestedTestConfig = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], originalParent = originalParent.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestedTestConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NestedTestConfig] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOptions(value: InternalOptions[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOriginalParent(value: Any): Self = StObject.set(x, "originalParent", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentPath(value: String): Self = StObject.set(x, "parentPath", value.asInstanceOf[js.Any])
    
    inline def setParentPathUndefined: Self = StObject.set(x, "parentPath", js.undefined)
  }
}
