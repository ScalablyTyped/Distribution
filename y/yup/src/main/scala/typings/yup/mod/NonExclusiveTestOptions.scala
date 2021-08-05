package typings.yup.mod

import typings.std.Record
import typings.yup.yupBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonExclusiveTestOptions[P /* <: Record[String, js.Any] */, C]
  extends StObject
     with BaseTestOptions[P, C]
     with TestOptions[P, C] {
  
  @JSName("exclusive")
  var exclusive_NonExclusiveTestOptions: js.UndefOr[`false`] = js.undefined
}
object NonExclusiveTestOptions {
  
  inline def apply[P /* <: Record[String, js.Any] */, C](test: TestFunction[js.Any, C]): NonExclusiveTestOptions[P, C] = {
    val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonExclusiveTestOptions[P, C]]
  }
  
  extension [Self <: NonExclusiveTestOptions[?, ?], P /* <: Record[String, js.Any] */, C](x: Self & (NonExclusiveTestOptions[P, C])) {
    
    inline def setExclusive(value: `false`): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
  }
}
