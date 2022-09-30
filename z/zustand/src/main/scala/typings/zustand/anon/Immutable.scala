package typings.zustand.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Immutable extends StObject {
  
  var immutable: js.UndefOr[Any] = js.undefined
  
  var options: js.UndefOr[Boolean | Date] = js.undefined
  
  var refs: js.UndefOr[Any] = js.undefined
  
  var replacer: js.UndefOr[js.Function2[/* key */ String, /* value */ Any, Any]] = js.undefined
  
  var reviver: js.UndefOr[js.Function2[/* key */ String, /* value */ Any, Any]] = js.undefined
}
object Immutable {
  
  inline def apply(): Immutable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Immutable]
  }
  
  extension [Self <: Immutable](x: Self) {
    
    inline def setImmutable(value: Any): Self = StObject.set(x, "immutable", value.asInstanceOf[js.Any])
    
    inline def setImmutableUndefined: Self = StObject.set(x, "immutable", js.undefined)
    
    inline def setOptions(value: Boolean | Date): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setRefs(value: Any): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
    
    inline def setRefsUndefined: Self = StObject.set(x, "refs", js.undefined)
    
    inline def setReplacer(value: (/* key */ String, /* value */ Any) => Any): Self = StObject.set(x, "replacer", js.Any.fromFunction2(value))
    
    inline def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
    
    inline def setReviver(value: (/* key */ String, /* value */ Any) => Any): Self = StObject.set(x, "reviver", js.Any.fromFunction2(value))
    
    inline def setReviverUndefined: Self = StObject.set(x, "reviver", js.undefined)
  }
}
