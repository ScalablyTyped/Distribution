package typings.yui.YUITest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestSuite extends js.Object {
  
  def add(testObject: TestCase): Unit = js.native
  //        items: any[] //Array of test suites and test cases. @private
  def add(testObject: TestSuite): Unit = js.native
  
  var name: String = js.native
  
  def setUp(): Unit = js.native
  
  def tearDown(): Unit = js.native
}
