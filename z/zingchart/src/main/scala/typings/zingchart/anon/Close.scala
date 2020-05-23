package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Close extends js.Object {
  /**
    * To style the closing context menu button. Use the lineColor attribute to specify the button color. {...}
    */
  var close: js.UndefOr[js.Any] = js.undefined
  /**
    * To style the opening context menu button. Use the lineColor attribute to specify the button color. {...}
    */
  var open: js.UndefOr[js.Any] = js.undefined
}

object Close {
  @scala.inline
  def apply(close: js.Any = null, open: js.Any = null): Close = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    __obj.asInstanceOf[Close]
  }
}

