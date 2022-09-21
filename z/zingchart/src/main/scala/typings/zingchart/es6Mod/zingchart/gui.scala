package typings.zingchart.es6Mod.zingchart

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait gui extends StObject {
  
  /**
    * To create custom context menu items
    */
  var behaviors: js.UndefOr[js.Array[behavior]] = js.undefined
  
  var `context-menu`: js.UndefOr[contextMenuGui] = js.undefined
  
  var contextMenu: js.UndefOr[contextMenuGui] = js.undefined
}
object gui {
  
  inline def apply(): gui = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[gui]
  }
  
  extension [Self <: gui](x: Self) {
    
    inline def setBehaviors(value: js.Array[behavior]): Self = StObject.set(x, "behaviors", value.asInstanceOf[js.Any])
    
    inline def setBehaviorsUndefined: Self = StObject.set(x, "behaviors", js.undefined)
    
    inline def setBehaviorsVarargs(value: behavior*): Self = StObject.set(x, "behaviors", js.Array(value*))
    
    inline def `setContext-menu`(value: contextMenuGui): Self = StObject.set(x, "context-menu", value.asInstanceOf[js.Any])
    
    inline def `setContext-menuUndefined`: Self = StObject.set(x, "context-menu", js.undefined)
    
    inline def setContextMenu(value: contextMenuGui): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
  }
}
