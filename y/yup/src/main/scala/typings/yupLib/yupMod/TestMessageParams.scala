package typings
package yupLib.yupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestMessageParams extends js.Object {
  var label: java.lang.String
  var originalValue: js.Any
  var path: java.lang.String
  var value: js.Any
}

object TestMessageParams {
  @scala.inline
  def apply(label: java.lang.String, originalValue: js.Any, path: java.lang.String, value: js.Any): TestMessageParams = {
    val __obj = js.Dynamic.literal(label = label, originalValue = originalValue, path = path, value = value)
  
    __obj.asInstanceOf[TestMessageParams]
  }
}

