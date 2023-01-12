package typings.yui

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object YUITest {
  
  @js.native
  trait EventTarget extends StObject {
    
    def attach(`type`: String, listener: js.Function): Unit = js.native
    
    def detach(`type`: String, listener: js.Function): Unit = js.native
    
    def fire(event: String): Unit = js.native
    def fire(event: js.Object): Unit = js.native
    
    def subscribe(`type`: String, listener: js.Function): Unit = js.native
    
    def unsubscribe(`type`: String, listener: js.Function): Unit = js.native
  }
  
  @js.native
  trait IAssert extends StObject {
    
    def areEqual(expected: js.Object, actual: js.Object): Unit = js.native
    def areEqual(expected: js.Object, actual: js.Object, message: String): Unit = js.native
    
    def areNotEqual(unexpected: js.Object, actual: js.Object): Unit = js.native
    def areNotEqual(unexpected: js.Object, actual: js.Object, message: String): Unit = js.native
    
    def areNotSame(unexpected: js.Object, actual: js.Object): Unit = js.native
    def areNotSame(unexpected: js.Object, actual: js.Object, message: String): Unit = js.native
    
    def areSame(expected: js.Object, actual: js.Object): Unit = js.native
    def areSame(expected: js.Object, actual: js.Object, message: String): Unit = js.native
    
    def fail(): Unit = js.native
    def fail(message: String): Unit = js.native
    
    def isArray(actual: js.Object): Unit = js.native
    def isArray(actual: js.Object, message: String): Unit = js.native
    
    def isBoolean(actual: js.Object): Unit = js.native
    def isBoolean(actual: js.Object, message: String): Unit = js.native
    
    def isFalse(actual: js.Object): Unit = js.native
    def isFalse(actual: js.Object, message: String): Unit = js.native
    
    def isFunction(actual: js.Object): Unit = js.native
    def isFunction(actual: js.Object, message: String): Unit = js.native
    
    def isInstanceOf(expected: js.Function, actual: js.Object): Unit = js.native
    def isInstanceOf(expected: js.Function, actual: js.Object, message: String): Unit = js.native
    
    def isNaN(actual: js.Object): Unit = js.native
    def isNaN(actual: js.Object, message: String): Unit = js.native
    
    def isNotNaN(actual: js.Object): Unit = js.native
    def isNotNaN(actual: js.Object, message: String): Unit = js.native
    
    def isNotNull(actual: js.Object): Unit = js.native
    def isNotNull(actual: js.Object, message: String): Unit = js.native
    
    def isNotUndefined(actual: js.Object): Unit = js.native
    def isNotUndefined(actual: js.Object, message: String): Unit = js.native
    
    def isNull(actual: js.Object): Unit = js.native
    def isNull(actual: js.Object, message: String): Unit = js.native
    
    def isNumber(actual: js.Object): Unit = js.native
    def isNumber(actual: js.Object, message: String): Unit = js.native
    
    def isObject(actual: js.Object): Unit = js.native
    def isObject(actual: js.Object, message: String): Unit = js.native
    
    def isString(actual: js.Object): Unit = js.native
    def isString(actual: js.Object, message: String): Unit = js.native
    
    def isTrue(actual: js.Object): Unit = js.native
    def isTrue(actual: js.Object, message: String): Unit = js.native
    
    def isTypeOf(expectedType: String, actualValue: js.Object): Unit = js.native
    def isTypeOf(expectedType: String, actualValue: js.Object, message: String): Unit = js.native
    
    def isUndefined(actual: js.Object): Unit = js.native
    def isUndefined(actual: js.Object, message: String): Unit = js.native
    
    def pass(): Unit = js.native
    def pass(message: String): Unit = js.native
    
    def throwsError(expectedError: String, method: js.Object): Unit = js.native
    def throwsError(expectedError: String, method: js.Object, message: String): Unit = js.native
    def throwsError(expectedError: js.Function, method: js.Object): Unit = js.native
    def throwsError(expectedError: js.Function, method: js.Object, message: String): Unit = js.native
    def throwsError(expectedError: js.Object, method: js.Object): Unit = js.native
    def throwsError(expectedError: js.Object, method: js.Object, message: String): Unit = js.native
  }
  
  @js.native
  trait TestCase
    extends StObject
       with Instantiable1[/* template */ js.Object, TestCase] {
    
    var DEFAULT_WAIT: Double = js.native
    
    def assert(condition: Boolean, message: String): Unit = js.native
    
    def callback(args: Any*): js.Function = js.native
    
    def destroy(): Unit = js.native
    
    def fail(): Unit = js.native
    def fail(message: String): Unit = js.native
    
    def init(): Unit = js.native
    
    def resume(): Unit = js.native
    def resume(segment: js.Function): Unit = js.native
    
    def setUp(): Unit = js.native
    
    def tearDown(): Unit = js.native
    
    def wait(segment: js.Function): Unit = js.native
    def wait(segment: js.Function, delay: Double): Unit = js.native
    def wait(segment: Unit, delay: Double): Unit = js.native
    
    def waitFor(condition: js.Function, segment: js.Function): Unit = js.native
    def waitFor(condition: js.Function, segment: js.Function, timeout: Double): Unit = js.native
    def waitFor(condition: js.Function, segment: js.Function, timeout: Double, increment: Double): Unit = js.native
    def waitFor(condition: js.Function, segment: js.Function, timeout: Unit, increment: Double): Unit = js.native
  }
  
  @js.native
  trait TestRunner
    extends StObject
       with EventTarget {
    
    var BEGIN_EVENT: String = js.native
    
    var COMPLETE_EVENT: String = js.native
    
    var ERROR_EVENT: String = js.native
    
    var TEST_CASE_BEGIN_EVENT: String = js.native
    
    var TEST_CASE_COMPLETE_EVENT: String = js.native
    
    var TEST_FAIL_EVENT: String = js.native
    
    var TEST_IGNORE_EVENT: String = js.native
    
    var TEST_PASS_EVENT: String = js.native
    
    var TEST_SUITE_BEGIN_EVENT: String = js.native
    
    var TEST_SUITE_COMPLETE_EVENT: String = js.native
    
    def add(testObject: TestCase): Unit = js.native
    def add(testObject: TestSuite): Unit = js.native
    
    //Object|String
    def callback(args: Any*): js.Function = js.native
    
    def clear(): Unit = js.native
    
    //Object|String
    def getCoverage(): Any = js.native
    def getCoverage(format: js.Function): Any = js.native
    
    def getName(): String = js.native
    
    def getResults(): Any = js.native
    def getResults(format: js.Function): Any = js.native
    
    def isRunning(): Boolean = js.native
    
    def isWaiting(): Boolean = js.native
    
    def resume(): Unit = js.native
    def resume(segment: js.Function): Unit = js.native
    
    def run(): Unit = js.native
    def run(options: js.Object): Unit = js.native
    def run(options: Boolean): Unit = js.native
    
    def setName(name: String): Unit = js.native
  }
  
  @js.native
  trait TestSuite extends StObject {
    
    def add(testObject: TestCase): Unit = js.native
    //        items: any[] //Array of test suites and test cases. @private
    def add(testObject: TestSuite): Unit = js.native
    
    var name: String = js.native
    
    def setUp(): Unit = js.native
    
    def tearDown(): Unit = js.native
  }
  
  trait YUITestStatic extends StObject {
    
    var Assert: IAssert
    
    var Case: TestCase
    
    var Runner: TestRunner
  }
  object YUITestStatic {
    
    inline def apply(Assert: IAssert, Case: TestCase, Runner: TestRunner): YUITestStatic = {
      val __obj = js.Dynamic.literal(Assert = Assert.asInstanceOf[js.Any], Case = Case.asInstanceOf[js.Any], Runner = Runner.asInstanceOf[js.Any])
      __obj.asInstanceOf[YUITestStatic]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: YUITestStatic] (val x: Self) extends AnyVal {
      
      inline def setAssert(value: IAssert): Self = StObject.set(x, "Assert", value.asInstanceOf[js.Any])
      
      inline def setCase(value: TestCase): Self = StObject.set(x, "Case", value.asInstanceOf[js.Any])
      
      inline def setRunner(value: TestRunner): Self = StObject.set(x, "Runner", value.asInstanceOf[js.Any])
    }
  }
}
