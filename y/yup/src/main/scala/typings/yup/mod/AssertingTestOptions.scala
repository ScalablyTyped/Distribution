package typings.yup.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.yup.mod.NonExclusiveAssertingTestOptions[U, P, C]
  - typings.yup.mod.ExclusiveAssertingTestOptions[U, P, C]
*/
trait AssertingTestOptions[U, P /* <: Record[String, js.Any] */, C] extends StObject
object AssertingTestOptions {
  
  inline def ExclusiveAssertingTestOptions[U, P /* <: Record[String, js.Any] */, C](name: String, test: AssertingTestFunction[U, C]): typings.yup.mod.ExclusiveAssertingTestOptions[U, P, C] = {
    val __obj = js.Dynamic.literal(exclusive = true, name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.yup.mod.ExclusiveAssertingTestOptions[U, P, C]]
  }
  
  inline def NonExclusiveAssertingTestOptions[U, P /* <: Record[String, js.Any] */, C](test: AssertingTestFunction[U, C]): typings.yup.mod.NonExclusiveAssertingTestOptions[U, P, C] = {
    val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.yup.mod.NonExclusiveAssertingTestOptions[U, P, C]]
  }
}
