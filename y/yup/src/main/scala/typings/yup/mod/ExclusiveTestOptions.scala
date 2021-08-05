package typings.yup.mod

import typings.std.Record
import typings.yup.yupBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExclusiveTestOptions[P /* <: Record[String, js.Any] */, C]
  extends StObject
     with BaseTestOptions[P, C]
     with TestOptions[P, C] {
  
  @JSName("exclusive")
  var exclusive_ExclusiveTestOptions: `true`
  
  @JSName("name")
  var name_ExclusiveTestOptions: String
}
object ExclusiveTestOptions {
  
  inline def apply[P /* <: Record[String, js.Any] */, C](name: String, test: TestFunction[js.Any, C]): ExclusiveTestOptions[P, C] = {
    val __obj = js.Dynamic.literal(exclusive = true, name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExclusiveTestOptions[P, C]]
  }
  
  extension [Self <: ExclusiveTestOptions[?, ?], P /* <: Record[String, js.Any] */, C](x: Self & (ExclusiveTestOptions[P, C])) {
    
    inline def setExclusive(value: `true`): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
