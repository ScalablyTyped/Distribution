package typings.zapierPlatformCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCustomStoreKey extends js.Object {
  var customStoreKey: js.UndefOr[String] = js.undefined
}

object AnonCustomStoreKey {
  @scala.inline
  def apply(customStoreKey: String = null): AnonCustomStoreKey = {
    val __obj = js.Dynamic.literal()
    if (customStoreKey != null) __obj.updateDynamic("customStoreKey")(customStoreKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustomStoreKey]
  }
}

