package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollapseOptions extends StObject {
  
  var parent: js.UndefOr[Any] = js.undefined
  
  var toggle: js.UndefOr[Boolean] = js.undefined
}
object CollapseOptions {
  
  inline def apply(): CollapseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapseOptions]
  }
  
  extension [Self <: CollapseOptions](x: Self) {
    
    inline def setParent(value: Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setToggle(value: Boolean): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
    
    inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
  }
}
