package typings.yup.yupMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOptions[P /* <: Record[String, _] */, R] extends js.Object {
  /**
    * Mark the test as exclusive, meaning only one of the same can be active at once
    */
  var exclusive: js.UndefOr[Boolean] = js.undefined
  /**
    * The validation error message
    */
  var message: js.UndefOr[TestOptionsMessage[P, R]] = js.undefined
  /**
    * Unique name identifying the test
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Values passed to message for interpolation
    */
  var params: js.UndefOr[P] = js.undefined
  /**
    * Test function, determines schema validity
    */
  def test(`this`: TestContext, value: js.Any): Boolean | ValidationError | (js.Promise[Boolean | ValidationError])
}

object TestOptions {
  @scala.inline
  def apply[P /* <: Record[String, _] */, R](
    test: (TestContext, js.Any) => Boolean | ValidationError | (js.Promise[Boolean | ValidationError]),
    exclusive: js.UndefOr[Boolean] = js.undefined,
    message: TestOptionsMessage[P, R] = null,
    name: String = null,
    params: P = null
  ): TestOptions[P, R] = {
    val __obj = js.Dynamic.literal(test = js.Any.fromFunction2(test))
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestOptions[P, R]]
  }
}

