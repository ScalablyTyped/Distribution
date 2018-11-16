package typings
package yuiLib.YUITestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestSuite extends js.Object {
  var name: java.lang.String = js.native
  def add(testObject: TestCase): scala.Unit = js.native
  //        items: any[] //Array of test suites and test cases. @private
  def add(testObject: TestSuite): scala.Unit = js.native
  def setUp(): scala.Unit = js.native
  def tearDown(): scala.Unit = js.native
}

