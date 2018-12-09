package typings
package yupLib.yupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TestOptions extends js.Object {
  /**
       * Mark the test as exclusive, meaning only one of the same can be active at once
       */
  var exclusive: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The validation error message
       */
  var message: js.UndefOr[TestOptionsMessage] = js.undefined
  /**
       * Unique name identifying the test
       */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Values passed to message for interpolation
       */
  var params: js.UndefOr[js.Object] = js.undefined
  /**
       * Test function, determines schema validity
       */
  def test(`this`: TestContext, value: js.Any): scala.Boolean | ValidationError | (js.Promise[scala.Boolean | ValidationError])
}

