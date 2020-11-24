package typings.yui.YUITest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestRunner extends EventTarget {
  
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
  def callback(args: js.Any*): js.Function = js.native
  
  def clear(): Unit = js.native
  
  //Object|String
  def getCoverage(): js.Any = js.native
  def getCoverage(format: js.Function): js.Any = js.native
  
  def getName(): String = js.native
  
  def getResults(): js.Any = js.native
  def getResults(format: js.Function): js.Any = js.native
  
  def isRunning(): Boolean = js.native
  
  def isWaiting(): Boolean = js.native
  
  def resume(): Unit = js.native
  def resume(segment: js.Function): Unit = js.native
  
  def run(): Unit = js.native
  def run(options: js.Object): Unit = js.native
  def run(options: Boolean): Unit = js.native
  
  def setName(name: String): Unit = js.native
}
