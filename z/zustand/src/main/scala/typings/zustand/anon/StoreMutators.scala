package typings.zustand.anon

import typings.zustand.esmVanillaMod.StoreMutatorIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoreMutators[Mos /* <: js.Array[js.Tuple2[StoreMutatorIdentifier, Any]] */] extends StObject {
  
  @JSName("$$storeMutators")
  var DollarDollarstoreMutators: js.UndefOr[Mos] = js.undefined
}
object StoreMutators {
  
  inline def apply[Mos /* <: js.Array[js.Tuple2[StoreMutatorIdentifier, Any]] */](): StoreMutators[Mos] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreMutators[Mos]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StoreMutators[?], Mos /* <: js.Array[js.Tuple2[StoreMutatorIdentifier, Any]] */] (val x: Self & StoreMutators[Mos]) extends AnyVal {
    
    inline def setDollarDollarstoreMutators(value: Mos): Self = StObject.set(x, "$$storeMutators", value.asInstanceOf[js.Any])
    
    inline def setDollarDollarstoreMutatorsUndefined: Self = StObject.set(x, "$$storeMutators", js.undefined)
  }
}
