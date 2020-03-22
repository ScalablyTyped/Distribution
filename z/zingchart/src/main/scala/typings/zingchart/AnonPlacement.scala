package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPlacement extends js.Object {
  /**
    * Sets the transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely transparent and 1.0 being co
    * mpletely opaque. Note that values require the leading zero before the decimal. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * Sets the line color of the object. 'none' | 'transparent' | 'purple' | '#33ccff' | 'rgb(100, 15, 15)' | ...
    */
  var `line-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the line style of the object. 'solid' | 'dotted' | 'dashed' | 'dashdot'
    */
  var `line-style`: js.UndefOr[String] = js.undefined
  /**
    * Sets the line width of the object. 4 | '6px' | ...
    */
  var `line-width`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the placement of the object. 'outer' | 'inner' | 'cross'
    */
  var placement: js.UndefOr[String] = js.undefined
  /**
    * Sets the size of the object. 4 | '6px' | ...
    */
  var size: js.UndefOr[Double] = js.undefined
  /**
    * Sets the visibility of the object. true | false
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AnonPlacement {
  @scala.inline
  def apply(
    alpha: Int | Double = null,
    `line-color`: String = null,
    `line-style`: String = null,
    `line-width`: Int | Double = null,
    placement: String = null,
    size: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AnonPlacement = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (`line-color` != null) __obj.updateDynamic("line-color")(`line-color`.asInstanceOf[js.Any])
    if (`line-style` != null) __obj.updateDynamic("line-style")(`line-style`.asInstanceOf[js.Any])
    if (`line-width` != null) __obj.updateDynamic("line-width")(`line-width`.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPlacement]
  }
}

