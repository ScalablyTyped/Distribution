package typings.zchatBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Schedule extends StObject {
  
  var `0`: js.Array[Period]
  
  var `1`: js.Array[Period]
  
  var `2`: js.Array[Period]
  
  var `3`: js.Array[Period]
  
  var `4`: js.Array[Period]
  
  var `5`: js.Array[Period]
  
  var `6`: js.Array[Period]
}
object Schedule {
  
  inline def apply(
    `0`: js.Array[Period],
    `1`: js.Array[Period],
    `2`: js.Array[Period],
    `3`: js.Array[Period],
    `4`: js.Array[Period],
    `5`: js.Array[Period],
    `6`: js.Array[Period]
  ): Schedule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
    __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
    __obj.updateDynamic("6")(`6`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schedule]
  }
  
  extension [Self <: Schedule](x: Self) {
    
    inline def set0(value: js.Array[Period]): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set0Varargs(value: Period*): Self = StObject.set(x, "0", js.Array(value*))
    
    inline def set1(value: js.Array[Period]): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    inline def set1Varargs(value: Period*): Self = StObject.set(x, "1", js.Array(value*))
    
    inline def set2(value: js.Array[Period]): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
    
    inline def set2Varargs(value: Period*): Self = StObject.set(x, "2", js.Array(value*))
    
    inline def set3(value: js.Array[Period]): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
    
    inline def set3Varargs(value: Period*): Self = StObject.set(x, "3", js.Array(value*))
    
    inline def set4(value: js.Array[Period]): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
    
    inline def set4Varargs(value: Period*): Self = StObject.set(x, "4", js.Array(value*))
    
    inline def set5(value: js.Array[Period]): Self = StObject.set(x, "5", value.asInstanceOf[js.Any])
    
    inline def set5Varargs(value: Period*): Self = StObject.set(x, "5", js.Array(value*))
    
    inline def set6(value: js.Array[Period]): Self = StObject.set(x, "6", value.asInstanceOf[js.Any])
    
    inline def set6Varargs(value: Period*): Self = StObject.set(x, "6", js.Array(value*))
  }
}
