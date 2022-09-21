package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AffixOptions extends StObject {
  
  var offset: js.UndefOr[Double | CallBack | js.Object] = js.undefined
  
  var target: js.UndefOr[Any] = js.undefined
}
object AffixOptions {
  
  inline def apply(): AffixOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AffixOptions]
  }
  
  extension [Self <: AffixOptions](x: Self) {
    
    inline def setOffset(value: Double | CallBack | js.Object): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetFunction0(value: () => Unit): Self = StObject.set(x, "offset", js.Any.fromFunction0(value))
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
