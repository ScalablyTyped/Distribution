package typings.yup

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictkey
  extends /* key */ StringDictionary[js.Any] {
  var `type`: js.UndefOr[String] = js.undefined
}

object AnonDictkey {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, `type`: String = null): AnonDictkey = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictkey]
  }
}

