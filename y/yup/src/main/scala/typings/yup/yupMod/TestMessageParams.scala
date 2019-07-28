package typings.yup.yupMod

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
    val __obj = js.Dynamic.literal(label = label, originalValue = originalValue, path = path, value = value)
  
    __obj.asInstanceOf[TestMessageParams]
  }
}

