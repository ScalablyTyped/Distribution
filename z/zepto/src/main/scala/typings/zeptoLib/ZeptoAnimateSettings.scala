package typings
package zeptoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZeptoAnimateSettings extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[java.lang.String] = js.undefined
}

object ZeptoAnimateSettings {
  @scala.inline
  def apply(
    complete: () => scala.Unit = null,
    duration: scala.Int | scala.Double = null,
    easing: java.lang.String = null
  ): ZeptoAnimateSettings = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    __obj.asInstanceOf[ZeptoAnimateSettings]
  }
}

