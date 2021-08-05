package typings.yup.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExclusiveAssertingTestOptions[U, P /* <: Record[String, js.Any] */, C]
  extends StObject
     with ExclusiveTestOptions[P, C]
     with AssertingTestOptions[U, P, C] {
  
  @JSName("test")
  var test_Original_ExclusiveAssertingTestOptions: AssertingTestFunction[U, C]
}
object ExclusiveAssertingTestOptions {
  
  inline def apply[U, P /* <: Record[String, js.Any] */, C](name: String, test: AssertingTestFunction[U, C]): ExclusiveAssertingTestOptions[U, P, C] = {
    val __obj = js.Dynamic.literal(exclusive = true, name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExclusiveAssertingTestOptions[U, P, C]]
  }
  
  extension [Self <: ExclusiveAssertingTestOptions[?, ?, ?], U, P /* <: Record[String, js.Any] */, C](x: Self & (ExclusiveAssertingTestOptions[U, P, C])) {
    
    inline def setTest(value: AssertingTestFunction[U, C]): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
  }
}
