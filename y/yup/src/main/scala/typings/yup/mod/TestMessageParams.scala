package typings.yup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestMessageParams extends js.Object {
  var label: String
  var originalValue: js.Any
  var path: String
  var value: js.Any
}

object TestMessageParams {
  @scala.inline
  def apply(label: String, originalValue: js.Any, path: String, value: js.Any): TestMessageParams = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestMessageParams]
  }
}

