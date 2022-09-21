package typings.zinggrid.ZSoft.ZingGridAttributes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZGMenu extends StObject {
  
  /**
    * @description Presence of attribute replaces the default context menu with a custom menu.
    * If "replace" is not set, the custom menu will be appended to the end of the default menu.
    */
  var replace: js.UndefOr[Boolean] = js.undefined
}
object ZGMenu {
  
  inline def apply(): ZGMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZGMenu]
  }
  
  extension [Self <: ZGMenu](x: Self) {
    
    inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
  }
}
