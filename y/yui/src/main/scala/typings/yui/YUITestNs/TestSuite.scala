package typings.yui.YUITestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestSuite extends js.Object {
  var name: String = js.native
  def add(testObject: TestCase): Unit = js.native
  //        items: any[] //Array of test suites and test cases. @private
  def add(testObject: TestSuite): Unit = js.native
  def setUp(): Unit = js.native
  def tearDown(): Unit = js.native
}

