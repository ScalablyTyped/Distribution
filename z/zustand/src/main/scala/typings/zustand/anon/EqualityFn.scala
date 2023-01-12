package typings.zustand.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EqualityFn[U] extends StObject {
  
  var equalityFn: js.UndefOr[js.Function2[/* a */ U, /* b */ U, Boolean]] = js.undefined
  
  var fireImmediately: js.UndefOr[Boolean] = js.undefined
}
object EqualityFn {
  
  inline def apply[U](): EqualityFn[U] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EqualityFn[U]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EqualityFn[?], U] (val x: Self & EqualityFn[U]) extends AnyVal {
    
    inline def setEqualityFn(value: (/* a */ U, /* b */ U) => Boolean): Self = StObject.set(x, "equalityFn", js.Any.fromFunction2(value))
    
    inline def setEqualityFnUndefined: Self = StObject.set(x, "equalityFn", js.undefined)
    
    inline def setFireImmediately(value: Boolean): Self = StObject.set(x, "fireImmediately", value.asInstanceOf[js.Any])
    
    inline def setFireImmediatelyUndefined: Self = StObject.set(x, "fireImmediately", js.undefined)
  }
}
