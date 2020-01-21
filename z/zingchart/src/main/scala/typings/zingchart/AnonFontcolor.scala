package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFontcolor extends js.Object {
  /**
    * To specify the font color of the context menu items. 'gray' | '##666699'
    */
  var `font-color`: js.UndefOr[js.Any] = js.undefined
  /**
    * To display or remove the Save Image context menu item. true | false
    */
  var image: js.UndefOr[Boolean] = js.undefined
  /**
    * To display or remove the Lock/Unlock Scrolling context menu item. true | false
    */
  var lock: js.UndefOr[Boolean] = js.undefined
  /**
    * Use the object to display or remove individual Share Image context menu items: email, facebook, twitter, and linkedin. {...}
    */
  var share: js.UndefOr[js.Any] = js.undefined
}

object AnonFontcolor {
  @scala.inline
  def apply(
    `font-color`: js.Any = null,
    image: js.UndefOr[Boolean] = js.undefined,
    lock: js.UndefOr[Boolean] = js.undefined,
    share: js.Any = null
  ): AnonFontcolor = {
    val __obj = js.Dynamic.literal()
    if (`font-color` != null) __obj.updateDynamic("font-color")(`font-color`.asInstanceOf[js.Any])
    if (!js.isUndefined(image)) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(lock)) __obj.updateDynamic("lock")(lock.asInstanceOf[js.Any])
    if (share != null) __obj.updateDynamic("share")(share.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFontcolor]
  }
}

