package typings
package zapierDashPlatformDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomStoreKey extends js.Object {
  var customStoreKey: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CustomStoreKey {
  @scala.inline
  def apply(customStoreKey: java.lang.String = null): Anon_CustomStoreKey = {
    val __obj = js.Dynamic.literal()
    if (customStoreKey != null) __obj.updateDynamic("customStoreKey")(customStoreKey)
    __obj.asInstanceOf[Anon_CustomStoreKey]
  }
}

