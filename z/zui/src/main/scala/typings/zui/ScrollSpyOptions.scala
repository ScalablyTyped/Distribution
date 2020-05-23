package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollSpyOptions extends js.Object {
  var offset: js.UndefOr[Double] = js.undefined
  var target: js.UndefOr[String] = js.undefined
}

object ScrollSpyOptions {
  @scala.inline
  def apply(offset: js.UndefOr[Double] = js.undefined, target: String = null): ScrollSpyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollSpyOptions]
  }
}

