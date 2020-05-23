package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Decimals extends js.Object {
  /**
    * To set the number of decimals that will be displayed. 0 | 1 |2 | ...
    */
  var decimals: js.UndefOr[Double] = js.undefined
  /**
    * To set the font color. 'gray' | '#666699' | ...
    */
  var `font-color`: js.UndefOr[js.Any] = js.undefined
  /**
    * To set the font family. 'Arial' | 'Georgia' | ...
    */
  var `font-family`: js.UndefOr[String] = js.undefined
  /**
    * To set the font size. 30 | 24 | 16 | ...
    */
  var `font-size`: js.UndefOr[Double] = js.undefined
  /**
    * To set the font style. 'normal' | 'italic'
    */
  var `font-style`: js.UndefOr[String] = js.undefined
  /**
    * To set the font weight. 'normal' | 'bold'
    */
  var `font-weight`: js.UndefOr[String] = js.undefined
  /**
    * To set the visibility of the object. true | false
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object Decimals {
  @scala.inline
  def apply(
    decimals: js.UndefOr[Double] = js.undefined,
    `font-color`: js.Any = null,
    `font-family`: String = null,
    `font-size`: js.UndefOr[Double] = js.undefined,
    `font-style`: String = null,
    `font-weight`: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): Decimals = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decimals)) __obj.updateDynamic("decimals")(decimals.get.asInstanceOf[js.Any])
    if (`font-color` != null) __obj.updateDynamic("font-color")(`font-color`.asInstanceOf[js.Any])
    if (`font-family` != null) __obj.updateDynamic("font-family")(`font-family`.asInstanceOf[js.Any])
    if (!js.isUndefined(`font-size`)) __obj.updateDynamic("font-size")(`font-size`.get.asInstanceOf[js.Any])
    if (`font-style` != null) __obj.updateDynamic("font-style")(`font-style`.asInstanceOf[js.Any])
    if (`font-weight` != null) __obj.updateDynamic("font-weight")(`font-weight`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decimals]
  }
}

