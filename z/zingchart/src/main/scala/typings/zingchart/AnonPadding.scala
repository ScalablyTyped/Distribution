package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPadding extends js.Object {
  /**
    * Sets the transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely transparent and 1.0 being co
    * mpletely opaque. Note that values require the leading zero before the decimal point. 0.3 | 0.4 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * Sets the background color of the object. Colors can be entered by name (e.g., 'purple', 'blue'), hexadecimal notation (e.g., '#666
    * 699', '#33ccff'), or RGB notation (e.g., 'rgb(255,0,0)', 'rgb(0,0,255)'). 'none' | 'transparent' | 'purple' | '#33ccff' | 'rgb(100
    * , 15, 15)' | ...
    */
  var `background-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the border color of the object. 'none' | 'transparent' | 'purple' | '#33ccff' | 'rgb(100, 15, 15)' | ...
    */
  var `border-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the border radius of the object. 2 | 3 | '5px' | ...
    */
  var `border-radius`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the border width of the object. 1 | 3 | '6px' | ...
    */
  var `border-width`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the font color of the object. 'none' | 'transparent' | 'purple' | '#33ccff' | 'rgb(100, 15, 15)' | ...
    */
  var `font-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the font size of the object. 10 | 12 | '20px' | ...
    */
  var `font-size`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the padding of the object. 3 | '5px' | '10px' | ...
    */
  var padding: js.UndefOr[Double] = js.undefined
  /**
    * Sets the shared venn diagram text to display. 'Shared' | '%shared-value' | ...
    */
  var text: js.UndefOr[String] = js.undefined
}

object AnonPadding {
  @scala.inline
  def apply(
    alpha: Int | Double = null,
    `background-color`: String = null,
    `border-color`: String = null,
    `border-radius`: Int | Double = null,
    `border-width`: Int | Double = null,
    `font-color`: String = null,
    `font-size`: Int | Double = null,
    padding: Int | Double = null,
    text: String = null
  ): AnonPadding = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (`background-color` != null) __obj.updateDynamic("background-color")(`background-color`.asInstanceOf[js.Any])
    if (`border-color` != null) __obj.updateDynamic("border-color")(`border-color`.asInstanceOf[js.Any])
    if (`border-radius` != null) __obj.updateDynamic("border-radius")(`border-radius`.asInstanceOf[js.Any])
    if (`border-width` != null) __obj.updateDynamic("border-width")(`border-width`.asInstanceOf[js.Any])
    if (`font-color` != null) __obj.updateDynamic("font-color")(`font-color`.asInstanceOf[js.Any])
    if (`font-size` != null) __obj.updateDynamic("font-size")(`font-size`.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPadding]
  }
}

