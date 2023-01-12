package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorSet extends StObject {
  
  def get(name: String): Color
}
object ColorSet {
  
  inline def apply(get: String => Color): ColorSet = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[ColorSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorSet] (val x: Self) extends AnyVal {
    
    inline def setGet(value: String => Color): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
