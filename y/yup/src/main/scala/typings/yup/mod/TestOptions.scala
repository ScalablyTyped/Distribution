package typings.yup.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.yup.mod.NonExclusiveTestOptions[P, C]
  - typings.yup.mod.ExclusiveTestOptions[P, C]
*/
trait TestOptions[P /* <: Record[String, js.Any] */, C] extends StObject
object TestOptions {
  
  inline def ExclusiveTestOptions[P /* <: Record[String, js.Any] */, C](name: String, test: TestFunction[js.Any, C]): typings.yup.mod.ExclusiveTestOptions[P, C] = {
    val __obj = js.Dynamic.literal(exclusive = true, name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.yup.mod.ExclusiveTestOptions[P, C]]
  }
  
  inline def NonExclusiveTestOptions[P /* <: Record[String, js.Any] */, C](test: TestFunction[js.Any, C]): typings.yup.mod.NonExclusiveTestOptions[P, C] = {
    val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.yup.mod.NonExclusiveTestOptions[P, C]]
  }
}
