package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mask extends StObject {
  
  var mask: js.UndefOr[Bordercolor] = js.undefined
}
object Mask {
  
  inline def apply(): Mask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mask]
  }
  
  extension [Self <: Mask](x: Self) {
    
    inline def setMask(value: Bordercolor): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
  }
}
