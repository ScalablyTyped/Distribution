package typings
package yuiLib.YUITestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestRunner extends EventTarget {
  var BEGIN_EVENT: java.lang.String = js.native
  var COMPLETE_EVENT: java.lang.String = js.native
  var ERROR_EVENT: java.lang.String = js.native
  var TEST_CASE_BEGIN_EVENT: java.lang.String = js.native
  var TEST_CASE_COMPLETE_EVENT: java.lang.String = js.native
  var TEST_FAIL_EVENT: java.lang.String = js.native
  var TEST_IGNORE_EVENT: java.lang.String = js.native
  var TEST_PASS_EVENT: java.lang.String = js.native
  var TEST_SUITE_BEGIN_EVENT: java.lang.String = js.native
  var TEST_SUITE_COMPLETE_EVENT: java.lang.String = js.native
  def add(testObject: TestCase): scala.Unit = js.native
  def add(testObject: TestSuite): scala.Unit = js.native
  //Object|String
  def callback(args: js.Any*): js.Function = js.native
  def clear(): scala.Unit = js.native
  //Object|String
  def getCoverage(): js.Any = js.native
  def getCoverage(format: js.Function): js.Any = js.native
  def getName(): java.lang.String = js.native
  def getResults(): js.Any = js.native
  def getResults(format: js.Function): js.Any = js.native
  def isRunning(): scala.Boolean = js.native
  def isWaiting(): scala.Boolean = js.native
  def resume(): scala.Unit = js.native
  def resume(segment: js.Function): scala.Unit = js.native
  def run(): scala.Unit = js.native
  def run(options: js.Object): scala.Unit = js.native
  def run(options: scala.Boolean): scala.Unit = js.native
  def setName(name: java.lang.String): scala.Unit = js.native
}

