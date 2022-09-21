package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Area extends StObject {
  
  var area: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  
  var gauge: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  
  var line: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  
  var pie: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  
  var vbar: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
}
object Area {
  
  inline def apply(): Area = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Area]
  }
  
  extension [Self <: Area](x: Self) {
    
    inline def setArea(value: js.Array[js.Array[String]]): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
    
    inline def setAreaVarargs(value: js.Array[String]*): Self = StObject.set(x, "area", js.Array(value*))
    
    inline def setGauge(value: js.Array[js.Array[String]]): Self = StObject.set(x, "gauge", value.asInstanceOf[js.Any])
    
    inline def setGaugeUndefined: Self = StObject.set(x, "gauge", js.undefined)
    
    inline def setGaugeVarargs(value: js.Array[String]*): Self = StObject.set(x, "gauge", js.Array(value*))
    
    inline def setLine(value: js.Array[js.Array[String]]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setLineVarargs(value: js.Array[String]*): Self = StObject.set(x, "line", js.Array(value*))
    
    inline def setPie(value: js.Array[js.Array[String]]): Self = StObject.set(x, "pie", value.asInstanceOf[js.Any])
    
    inline def setPieUndefined: Self = StObject.set(x, "pie", js.undefined)
    
    inline def setPieVarargs(value: js.Array[String]*): Self = StObject.set(x, "pie", js.Array(value*))
    
    inline def setVbar(value: js.Array[js.Array[String]]): Self = StObject.set(x, "vbar", value.asInstanceOf[js.Any])
    
    inline def setVbarUndefined: Self = StObject.set(x, "vbar", js.undefined)
    
    inline def setVbarVarargs(value: js.Array[String]*): Self = StObject.set(x, "vbar", js.Array(value*))
  }
}
