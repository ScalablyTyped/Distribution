package typings.yup.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonExclusiveAssertingTestOptions[U, P /* <: Record[String, js.Any] */, C]
  extends StObject
     with NonExclusiveTestOptions[P, C]
     with AssertingTestOptions[U, P, C] {
  
  @JSName("test")
  var test_Original_NonExclusiveAssertingTestOptions: AssertingTestFunction[U, C]
}
object NonExclusiveAssertingTestOptions {
  
  @scala.inline
  def apply[U, P /* <: Record[String, js.Any] */, C](test: AssertingTestFunction[U, C]): NonExclusiveAssertingTestOptions[U, P, C] = {
    val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonExclusiveAssertingTestOptions[U, P, C]]
  }
  
  @scala.inline
  implicit class NonExclusiveAssertingTestOptionsMutableBuilder[Self <: NonExclusiveAssertingTestOptions[?, ?, ?], U, P /* <: Record[String, js.Any] */, C] (val x: Self & (NonExclusiveAssertingTestOptions[U, P, C])) extends AnyVal {
    
    @scala.inline
    def setTest(value: AssertingTestFunction[U, C]): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
  }
}
