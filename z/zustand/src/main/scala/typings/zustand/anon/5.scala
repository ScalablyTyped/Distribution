package typings.zustand.anon

import typings.zustand.zustandVanillaMod.StoreMutatorIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5`[Mos /* <: js.Array[js.Tuple2[StoreMutatorIdentifier, Any]] */] extends StObject {
  
  @JSName("$$storeMutators")
  var DollarDollarstoreMutators: js.UndefOr[Mos] = js.undefined
}
object `5` {
  
  inline def apply[Mos /* <: js.Array[js.Tuple2[StoreMutatorIdentifier, Any]] */](): `5`[Mos] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`5`[Mos]]
  }
  
  extension [Self <: `5`[?], Mos /* <: js.Array[js.Tuple2[StoreMutatorIdentifier, Any]] */](x: Self & `5`[Mos]) {
    
    inline def setDollarDollarstoreMutators(value: Mos): Self = StObject.set(x, "$$storeMutators", value.asInstanceOf[js.Any])
    
    inline def setDollarDollarstoreMutatorsUndefined: Self = StObject.set(x, "$$storeMutators", js.undefined)
  }
}
