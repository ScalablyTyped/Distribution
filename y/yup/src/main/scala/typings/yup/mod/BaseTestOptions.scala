package typings.yup.mod

import typings.std.Record
import typings.yup.anon.PartialTestMessageParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseTestOptions[P /* <: Record[String, js.Any] */, C] extends StObject {
  
  /**
    * Mark the test as exclusive, meaning only one of the same can be active at once
    */
  var exclusive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The validation error message
    */
  var message: js.UndefOr[TestOptionsMessage[P, js.Any]] = js.undefined
  
  /**
    * Unique name identifying the test. Required for exclusive tests.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Values passed to message for interpolation
    */
  var params: js.UndefOr[P] = js.undefined
  
  /**
    * Test function, determines schema validity
    */
  def test(value: js.Any): Boolean | ValidationError | (js.Promise[Boolean | ValidationError])
  /**
    * Test function, determines schema validity
    */
  @JSName("test")
  var test_Original: TestFunction[js.Any, C]
}
object BaseTestOptions {
  
  inline def apply[P /* <: Record[String, js.Any] */, C](test: TestFunction[js.Any, C]): BaseTestOptions[P, C] = {
    val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseTestOptions[P, C]]
  }
  
  extension [Self <: BaseTestOptions[?, ?], P /* <: Record[String, js.Any] */, C](x: Self & (BaseTestOptions[P, C])) {
    
    inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
    
    inline def setMessage(value: TestOptionsMessage[P, js.Any]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageFunction1(value: /* params */ P & PartialTestMessageParams => js.Any): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParams(value: P): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setTest(value: TestFunction[js.Any, C]): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
  }
}
