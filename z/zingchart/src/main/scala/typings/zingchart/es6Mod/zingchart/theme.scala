package typings.zingchart.es6Mod.zingchart

import typings.zingchart.anon.Area
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait theme extends StObject {
  
  var graph: js.UndefOr[graphset] = js.undefined
  
  var palette: js.UndefOr[Area] = js.undefined
}
object theme {
  
  inline def apply(): theme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[theme]
  }
  
  extension [Self <: theme](x: Self) {
    
    inline def setGraph(value: graphset): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
    
    inline def setGraphUndefined: Self = StObject.set(x, "graph", js.undefined)
    
    inline def setPalette(value: Area): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
  }
}
