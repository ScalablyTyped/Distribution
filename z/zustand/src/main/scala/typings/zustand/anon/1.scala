package typings.zustand.anon

import typings.zustand.vanillaMod.StoreMutatorIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`[Mos /* <: js.Array[js.Tuple2[StoreMutatorIdentifier, Any]] */] extends StObject {
  
  @JSName("$$storeMutators")
  var DollarDollarstoreMutators: js.UndefOr[Mos] = js.undefined
}
object `1` {
  
  inline def apply[Mos /* <: js.Array[js.Tuple2[StoreMutatorIdentifier, Any]] */](): `1`[Mos] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`[Mos]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`[?], Mos /* <: js.Array[js.Tuple2[StoreMutatorIdentifier, Any]] */] (val x: Self & `1`[Mos]) extends AnyVal {
    
    inline def setDollarDollarstoreMutators(value: Mos): Self = StObject.set(x, "$$storeMutators", value.asInstanceOf[js.Any])
    
    inline def setDollarDollarstoreMutatorsUndefined: Self = StObject.set(x, "$$storeMutators", js.undefined)
  }
}
