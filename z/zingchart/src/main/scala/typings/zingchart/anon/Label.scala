package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
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
  var label: js.UndefOr[Textalign] = js.undefined
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

object Label {
  @scala.inline
  def apply(
    alpha: js.UndefOr[Double] = js.undefined,
    `background-color`: String = null,
    `border-color`: String = null,
    `border-radius`: js.UndefOr[Double] = js.undefined,
    `border-width`: js.UndefOr[Double] = js.undefined,
    label: Textalign = null,
    `line-color`: String = null,
    `line-style`: String = null,
    `line-width`: js.UndefOr[Double] = js.undefined,
    `offset-end`: js.UndefOr[Double] = js.undefined,
    `offset-start`: js.UndefOr[Double] = js.undefined,
    range: js.Any = null,
    `type`: String = null
  ): Label = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (`background-color` != null) __obj.updateDynamic("background-color")(`background-color`.asInstanceOf[js.Any])
    if (`border-color` != null) __obj.updateDynamic("border-color")(`border-color`.asInstanceOf[js.Any])
    if (!js.isUndefined(`border-radius`)) __obj.updateDynamic("border-radius")(`border-radius`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`border-width`)) __obj.updateDynamic("border-width")(`border-width`.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (`line-color` != null) __obj.updateDynamic("line-color")(`line-color`.asInstanceOf[js.Any])
    if (`line-style` != null) __obj.updateDynamic("line-style")(`line-style`.asInstanceOf[js.Any])
    if (!js.isUndefined(`line-width`)) __obj.updateDynamic("line-width")(`line-width`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`offset-end`)) __obj.updateDynamic("offset-end")(`offset-end`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`offset-start`)) __obj.updateDynamic("offset-start")(`offset-start`.get.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

