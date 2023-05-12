package typings.yup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestRunOptions extends StObject {
  
  var options: InternalOptions[Any]
  
  var originalValue: Any
  
  var path: js.UndefOr[String] = js.undefined
  
  var tests: js.Array[RunTest]
  
  var value: Any
}
object TestRunOptions {
  
  inline def apply(options: InternalOptions[Any], originalValue: Any, tests: js.Array[RunTest], value: Any): TestRunOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRunOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestRunOptions] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: InternalOptions[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOriginalValue(value: Any): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setTests(value: js.Array[RunTest]): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
    
    inline def setTestsVarargs(value: RunTest*): Self = StObject.set(x, "tests", js.Array(value*))
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
