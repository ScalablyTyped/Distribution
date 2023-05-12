package typings.yup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestConfig[TValue, TContext] extends StObject {
  
  var exclusive: js.UndefOr[Boolean] = js.undefined
  
  var message: js.UndefOr[Message[Any]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var params: js.UndefOr[ExtraParams] = js.undefined
  
  var skipAbsent: js.UndefOr[Boolean] = js.undefined
  
  def test(value: TValue, context: TestContext[TContext]): Unit | Boolean | ValidationError | (js.Promise[Boolean | ValidationError])
  @JSName("test")
  var test_Original: TestFunction[TValue, TContext]
}
object TestConfig {
  
  inline def apply[TValue, TContext](test: TestFunction[TValue, TContext]): TestConfig[TValue, TContext] = {
    val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestConfig[TValue, TContext]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestConfig[?, ?], TValue, TContext] (val x: Self & (TestConfig[TValue, TContext])) extends AnyVal {
    
    inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
    
    inline def setMessage(value: Message[Any]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageFunction1(value: /* params */ Any & MessageParams => Any): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParams(value: ExtraParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setSkipAbsent(value: Boolean): Self = StObject.set(x, "skipAbsent", value.asInstanceOf[js.Any])
    
    inline def setSkipAbsentUndefined: Self = StObject.set(x, "skipAbsent", js.undefined)
    
    inline def setTest(value: TestFunction[TValue, TContext]): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
  }
}
