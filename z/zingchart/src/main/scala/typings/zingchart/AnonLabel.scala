package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabel extends js.Object {
  /**
    * Sets the transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely transparent and 1.0 being co
    * mpletely opaque. Note that the leading zero is required before the decimal. 0.3 | 0.4 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * Sets the background color of the object. Colors can be entered by name (e.g., 'purple', 'blue'), hexadecimal notation (e.g., '#666
    * 699', '#33ccff'), or RGB notation (e.g., 'rgb(255,0,0)', 'rgb(0,0,255)'). 'none' | 'transparent' | 'purple' | '#33ccff' | 'rgb(100
    * , 15, 15)' | ...
    */
  var `background-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the border color of the object. Colors can be entered by name (e.g., 'purple', 'blue'), hexadecimal notation (e.g., '#666699'
    * , '#33ccff'), or RGB notation (e.g., 'rgb(255,0,0)', 'rgb(0,0,255)'). 'none' | 'transparent' | 'purple' | '#33ccff' | 'rgb(100, 15
    * , 15)' | ...
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
  var label: js.UndefOr[AnonTextalign] = js.undefined
  /**
    * Sets the line color of the object. Colors can be entered by name (e.g., 'purple', 'blue'), hexadecimal notation (e.g., '#666699',
    * '#33ccff'), or RGB notation (e.g., 'rgb(255,0,0)', 'rgb(0,0,255)'). 'none' | 'transparent' | 'purple' | '#33ccff' | 'rgb(100, 15,
    * 15)' | ...
    */
  var `line-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the line style of the object. 'solid' | 'dotted' | 'dashed' | 'dashdot'
    */
  var `line-style`: js.UndefOr[String] = js.undefined
  /**
    * Sets the line width of the object. 1 | 3 | '6px' | ...
    */
  var `line-width`: js.UndefOr[Double] = js.undefined
  /**
    * Sets an ending offset for the scale marker. 0.1 | ...
    */
  var `offset-end`: js.UndefOr[Double] = js.undefined
  /**
    * Sets a starting offset for the scale marker. 0.5 | ...
    */
  var `offset-start`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the range of the scale marker. Provide one value for line scale markers and two values (starting and ending) for area scale m
    * arkers. [60] | [20,40] | ...
    */
  var range: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the scale marker type: area or line. 'area' | 'line'
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object AnonLabel {
  @scala.inline
  def apply(
    alpha: Int | Double = null,
    `background-color`: String = null,
    `border-color`: String = null,
    `border-radius`: Int | Double = null,
    `border-width`: Int | Double = null,
    label: AnonTextalign = null,
    `line-color`: String = null,
    `line-style`: String = null,
    `line-width`: Int | Double = null,
    `offset-end`: Int | Double = null,
    `offset-start`: Int | Double = null,
    range: js.Any = null,
    `type`: String = null
  ): AnonLabel = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (`background-color` != null) __obj.updateDynamic("background-color")(`background-color`.asInstanceOf[js.Any])
    if (`border-color` != null) __obj.updateDynamic("border-color")(`border-color`.asInstanceOf[js.Any])
    if (`border-radius` != null) __obj.updateDynamic("border-radius")(`border-radius`.asInstanceOf[js.Any])
    if (`border-width` != null) __obj.updateDynamic("border-width")(`border-width`.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (`line-color` != null) __obj.updateDynamic("line-color")(`line-color`.asInstanceOf[js.Any])
    if (`line-style` != null) __obj.updateDynamic("line-style")(`line-style`.asInstanceOf[js.Any])
    if (`line-width` != null) __obj.updateDynamic("line-width")(`line-width`.asInstanceOf[js.Any])
    if (`offset-end` != null) __obj.updateDynamic("offset-end")(`offset-end`.asInstanceOf[js.Any])
    if (`offset-start` != null) __obj.updateDynamic("offset-start")(`offset-start`.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabel]
  }
}

