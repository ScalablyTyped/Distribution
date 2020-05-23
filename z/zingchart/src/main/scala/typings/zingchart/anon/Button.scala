package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Button extends js.Object {
  var button: js.UndefOr[Close] = js.undefined
  var items: js.UndefOr[js.Array[Fontcolor]] = js.undefined
  /**
    * To set the visibility of the object. true | false
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object Button {
  @scala.inline
  def apply(
    button: Close = null,
    items: js.Array[Fontcolor] = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): Button = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
}

