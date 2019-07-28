package typings.yup.yupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOptions extends js.Object {
  /**
    * Mark the test as exclusive, meaning only one of the same can be active at once
    */
  var exclusive: js.UndefOr[Boolean] = js.undefined
  /**
    * The validation error message
    */
  var message: js.UndefOr[TestOptionsMessage] = js.undefined
  /**
    * Unique name identifying the test
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Values passed to message for interpolation
    */
  var params: js.UndefOr[js.Object] = js.undefined
  /**
    * Test function, determines schema validity
    */
  def test(`this`: TestContext, value: js.Any): Boolean | ValidationError | (js.Promise[Boolean | ValidationError])
}

object TestOptions {
  @scala.inline
  def apply(
    test: (TestContext, js.Any) => Boolean | ValidationError | (js.Promise[Boolean | ValidationError]),
    exclusive: js.UndefOr[Boolean] = js.undefined,
    message: TestOptionsMessage = null,
    name: String = null,
    params: js.Object = null
  ): TestOptions = {
    val __obj = js.Dynamic.literal(test = js.Any.fromFunction2(test))
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[TestOptions]
  }
}

