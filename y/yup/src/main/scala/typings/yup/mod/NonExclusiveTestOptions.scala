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
  
  @scala.inline
  def apply[P /* <: Record[String, js.Any] */, C](test: TestFunction[js.Any, C]): NonExclusiveTestOptions[P, C] = {
    val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonExclusiveTestOptions[P, C]]
  }
  
  @scala.inline
  implicit class NonExclusiveTestOptionsMutableBuilder[Self <: NonExclusiveTestOptions[?, ?], P /* <: Record[String, js.Any] */, C] (val x: Self & (NonExclusiveTestOptions[P, C])) extends AnyVal {
    
    @scala.inline
    def setExclusive(value: `false`): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
  }
}
