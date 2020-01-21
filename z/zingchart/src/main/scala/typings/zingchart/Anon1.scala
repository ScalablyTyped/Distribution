package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends js.Object {
  var `1`: js.UndefOr[js.Any] = js.undefined
  var `10`: js.UndefOr[js.Any] = js.undefined
  var `11`: js.UndefOr[js.Any] = js.undefined
  var `12`: js.UndefOr[js.Any] = js.undefined
  var `13`: js.UndefOr[js.Any] = js.undefined
  var `2`: js.UndefOr[js.Any] = js.undefined
  var `3`: js.UndefOr[js.Any] = js.undefined
  var `4`: js.UndefOr[js.Any] = js.undefined
  var `5`: js.UndefOr[js.Any] = js.undefined
  var `6`: js.UndefOr[js.Any] = js.undefined
  var `7`: js.UndefOr[js.Any] = js.undefined
  var `8`: js.UndefOr[js.Any] = js.undefined
  var `9`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the delay in milliseconds between each step of the animation. 5 | 10 | ...
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * Sets the animation effect. Numeric Code String Name 1 `ANIMGATION_FADE_IN` 2 `ANIMATION_EXPAND_VERTICAL` 3 `ANIMATION_EXPAND_TOP`
    * 4 `ANIMATION_EXPAND_BOTTOM` 5 `ANIMGATION_FADE_IN` 6 `ANIMATION_EXPAND_RIGHT` 7 `ANIMATION_EXPAND_HORIZONTAL` 8 `ANIMATION_SLIDE_L
    * EFT` 9 `ANIMATION_SLIDE_RIGHT` 10 `ANIMATION_SLIDE_TOP` 11 `ANIMATION_SLIDE_BOTTOM` 12 `ANIMATION_UNFOLD_HORIZONTAL` 13 `ANIMATION
    * _UNFOLD_VERTICAL`
    */
  var effect: js.UndefOr[Double] = js.undefined
  /**
    * Determines whether or not animation occurs when a change is made to the chart via an API event (e.g., adding node, adding plot, re
    * moving node). true (default) | false | 1 | 0
    */
  var `on-change`: js.UndefOr[Boolean] = js.undefined
  var `on-legend-toggle`: js.UndefOr[js.Any] = js.undefined
}

object Anon1 {
  @scala.inline
  def apply(
    `1`: js.Any = null,
    `10`: js.Any = null,
    `11`: js.Any = null,
    `12`: js.Any = null,
    `13`: js.Any = null,
    `2`: js.Any = null,
    `3`: js.Any = null,
    `4`: js.Any = null,
    `5`: js.Any = null,
    `6`: js.Any = null,
    `7`: js.Any = null,
    `8`: js.Any = null,
    `9`: js.Any = null,
    delay: Int | Double = null,
    effect: Int | Double = null,
    `on-change`: js.UndefOr[Boolean] = js.undefined,
    `on-legend-toggle`: js.Any = null
  ): Anon1 = {
    val __obj = js.Dynamic.literal()
    if (`1` != null) __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    if (`10` != null) __obj.updateDynamic("10")(`10`.asInstanceOf[js.Any])
    if (`11` != null) __obj.updateDynamic("11")(`11`.asInstanceOf[js.Any])
    if (`12` != null) __obj.updateDynamic("12")(`12`.asInstanceOf[js.Any])
    if (`13` != null) __obj.updateDynamic("13")(`13`.asInstanceOf[js.Any])
    if (`2` != null) __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    if (`3` != null) __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    if (`4` != null) __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
    if (`5` != null) __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
    if (`6` != null) __obj.updateDynamic("6")(`6`.asInstanceOf[js.Any])
    if (`7` != null) __obj.updateDynamic("7")(`7`.asInstanceOf[js.Any])
    if (`8` != null) __obj.updateDynamic("8")(`8`.asInstanceOf[js.Any])
    if (`9` != null) __obj.updateDynamic("9")(`9`.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (!js.isUndefined(`on-change`)) __obj.updateDynamic("on-change")(`on-change`.asInstanceOf[js.Any])
    if (`on-legend-toggle` != null) __obj.updateDynamic("on-legend-toggle")(`on-legend-toggle`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon1]
  }
}

