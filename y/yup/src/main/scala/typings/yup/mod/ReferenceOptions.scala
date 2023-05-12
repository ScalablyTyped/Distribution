package typings.yup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceOptions[TValue] extends StObject {
  
  var map: js.UndefOr[js.Function1[/* value */ Any, TValue]] = js.undefined
}
object ReferenceOptions {
  
  inline def apply[TValue](): ReferenceOptions[TValue] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferenceOptions[TValue]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReferenceOptions[?], TValue] (val x: Self & ReferenceOptions[TValue]) extends AnyVal {
    
    inline def setMap(value: /* value */ Any => TValue): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
  }
}
