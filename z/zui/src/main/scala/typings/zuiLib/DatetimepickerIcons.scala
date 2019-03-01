package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatetimepickerIcons extends js.Object {
  var date: js.UndefOr[java.lang.String] = js.undefined
  var down: js.UndefOr[java.lang.String] = js.undefined
  var time: js.UndefOr[java.lang.String] = js.undefined
  var up: js.UndefOr[java.lang.String] = js.undefined
}

object DatetimepickerIcons {
  @scala.inline
  def apply(
    date: java.lang.String = null,
    down: java.lang.String = null,
    time: java.lang.String = null,
    up: java.lang.String = null
  ): DatetimepickerIcons = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date)
    if (down != null) __obj.updateDynamic("down")(down)
    if (time != null) __obj.updateDynamic("time")(time)
    if (up != null) __obj.updateDynamic("up")(up)
    __obj.asInstanceOf[DatetimepickerIcons]
  }
}

