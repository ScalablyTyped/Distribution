package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapseOptions extends js.Object {
  var parent: js.UndefOr[js.Any] = js.undefined
  var toggle: js.UndefOr[Boolean] = js.undefined
}

object CollapseOptions {
  @scala.inline
  def apply(parent: js.Any = null, toggle: js.UndefOr[Boolean] = js.undefined): CollapseOptions = {
    val __obj = js.Dynamic.literal()
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (!js.isUndefined(toggle)) __obj.updateDynamic("toggle")(toggle)
    __obj.asInstanceOf[CollapseOptions]
  }
}

