package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Handle extends js.Object {
  var bar: js.UndefOr[Width] = js.undefined
  var handle: js.UndefOr[Bordertop] = js.undefined
  /**
    * Sets an x offset that will be applied to the scroll-x object. 4 | '6px' | ...
    */
  var `offset-x`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets a y offset that will be applied to the scroll-x object. 4 | '6px' | ...
    */
  var `offset-y`: js.UndefOr[js.Any] = js.undefined
}

object Handle {
  @scala.inline
  def apply(bar: Width = null, handle: Bordertop = null, `offset-x`: js.Any = null, `offset-y`: js.Any = null): Handle = {
    val __obj = js.Dynamic.literal()
    if (bar != null) __obj.updateDynamic("bar")(bar.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (`offset-x` != null) __obj.updateDynamic("offset-x")(`offset-x`.asInstanceOf[js.Any])
    if (`offset-y` != null) __obj.updateDynamic("offset-y")(`offset-y`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handle]
  }
}

