package typings.yup.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseTestOptions[P /* <: Record[String, _] */] extends js.Object {
  /**
    * Mark the test as exclusive, meaning only one of the same can be active at once
    */
  var exclusive: js.UndefOr[Boolean] = js.native
  /**
    * The validation error message
    */
  var message: js.UndefOr[TestOptionsMessage[P, _]] = js.native
  /**
    * Unique name identifying the test. Required for exclusive tests.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Values passed to message for interpolation
    */
  var params: js.UndefOr[P] = js.native
  /**
    * Test function, determines schema validity
    */
  @JSName("test")
  var test_Original: TestFunction = js.native
  /**
    * Test function, determines schema validity
    */
  def test(value: js.Any): Boolean | ValidationError | (js.Promise[Boolean | ValidationError]) = js.native
}

