package typings.yup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestMessageParams extends js.Object {
  var label: String = js.native
  var originalValue: js.Any = js.native
  var path: String = js.native
  var value: js.Any = js.native
}

object TestMessageParams {
  @scala.inline
  def apply(label: String, originalValue: js.Any, path: String, value: js.Any): TestMessageParams = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestMessageParams]
  }
  @scala.inline
  implicit class TestMessageParamsOps[Self <: TestMessageParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalValue(value: js.Any): Self = this.set("originalValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

