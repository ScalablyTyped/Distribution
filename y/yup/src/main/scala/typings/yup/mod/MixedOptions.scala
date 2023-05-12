package typings.yup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MixedOptions[TType] extends StObject {
  
  var check: js.UndefOr[TypeGuard[TType]] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object MixedOptions {
  
  inline def apply[TType](): MixedOptions[TType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MixedOptions[TType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MixedOptions[?], TType] (val x: Self & MixedOptions[TType]) extends AnyVal {
    
    inline def setCheck(value: /* value */ Any => /* is std.NonNullable<TType> */ Boolean): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
    
    inline def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
