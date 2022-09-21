package typings.zingchart.es6Mod.zingchart

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait data extends StObject {
  
  var globals: js.UndefOr[typings.zingchart.es6Mod.zingchart.globals] = js.undefined
  
  var graphset: js.UndefOr[js.Array[typings.zingchart.es6Mod.zingchart.graphset]] = js.undefined
  
  var gui: js.UndefOr[typings.zingchart.es6Mod.zingchart.gui] = js.undefined
  
  var history: js.UndefOr[typings.zingchart.es6Mod.zingchart.history] = js.undefined
  
  var refresh: js.UndefOr[typings.zingchart.es6Mod.zingchart.refresh] = js.undefined
}
object data {
  
  inline def apply(): data = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[data]
  }
  
  extension [Self <: data](x: Self) {
    
    inline def setGlobals(value: globals): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
    
    inline def setGraphset(value: js.Array[graphset]): Self = StObject.set(x, "graphset", value.asInstanceOf[js.Any])
    
    inline def setGraphsetUndefined: Self = StObject.set(x, "graphset", js.undefined)
    
    inline def setGraphsetVarargs(value: graphset*): Self = StObject.set(x, "graphset", js.Array(value*))
    
    inline def setGui(value: gui): Self = StObject.set(x, "gui", value.asInstanceOf[js.Any])
    
    inline def setGuiUndefined: Self = StObject.set(x, "gui", js.undefined)
    
    inline def setHistory(value: history): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setRefresh(value: refresh): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
  }
}
