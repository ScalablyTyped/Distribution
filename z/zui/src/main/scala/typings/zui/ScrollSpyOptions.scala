package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollSpyOptions extends StObject {
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
}
object ScrollSpyOptions {
  
  inline def apply(): ScrollSpyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollSpyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollSpyOptions] (val x: Self) extends AnyVal {
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
