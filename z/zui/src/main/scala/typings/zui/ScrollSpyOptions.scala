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
  def apply(offset: Int | Double = null, target: String = null): ScrollSpyOptions = {
    val __obj = js.Dynamic.literal()
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[ScrollSpyOptions]
  }
}

