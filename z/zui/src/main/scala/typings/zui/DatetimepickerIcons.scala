package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatetimepickerIcons extends js.Object {
  var date: js.UndefOr[String] = js.undefined
  var down: js.UndefOr[String] = js.undefined
  var time: js.UndefOr[String] = js.undefined
  var up: js.UndefOr[String] = js.undefined
}

object DatetimepickerIcons {
  @scala.inline
  def apply(date: String = null, down: String = null, time: String = null, up: String = null): DatetimepickerIcons = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (down != null) __obj.updateDynamic("down")(down.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (up != null) __obj.updateDynamic("up")(up.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatetimepickerIcons]
  }
}

