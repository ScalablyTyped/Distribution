package typings.zapierPlatformCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomStoreKey extends js.Object {
  var customStoreKey: js.UndefOr[String] = js.undefined
}

object CustomStoreKey {
  @scala.inline
  def apply(customStoreKey: String = null): CustomStoreKey = {
    val __obj = js.Dynamic.literal()
    if (customStoreKey != null) __obj.updateDynamic("customStoreKey")(customStoreKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomStoreKey]
  }
}

