package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDelay extends js.Object {
  /**
    * Sets the delay in milliseconds between each step of the animation. 5 | 10 | ...
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * Sets the type of animation effect. ANIMATION_FADE_IN | ANIMATION_EXPAND_VERTICAL | 1 | 2 | ...
    */
  var effect: js.UndefOr[Double] = js.undefined
  /**
    * Sets the method used for each animation effect. ANIMATION_LINEAR | ANIMATION_BACK_EASE_OUT | 0 | 1 | ...
    */
  var method: js.UndefOr[Double] = js.undefined
  /**
    * Determines whether or not animation occurs when a change is made to the chart via an API event (e.g., adding node, adding plot, re
    * moving node). true (default) | false | 1 | 0
    */
  var `on-change`: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines whether or not animation occurs when users toggle legend items on and off. Note that in the "legend" object, the "toggl
    * e-action" attribute must be set to "remove". true (default) | false | 1 | 0
    */
  var `on-legend-toggle`: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines animation groups. ANIMATION_NO_SEQUENCE | ANIMATION_BY_PLOT | 0 | 1 | ...
    */
  var sequence: js.UndefOr[Double] = js.undefined
  /**
    * Sets the length of the animation in milliseconds. ANIMATION_SLOW | ANIMATION_FAST | 1000 | 4000 | ...
    */
  var speed: js.UndefOr[Double] = js.undefined
}

object AnonDelay {
  @scala.inline
  def apply(
    delay: Int | Double = null,
    effect: Int | Double = null,
    method: Int | Double = null,
    `on-change`: js.UndefOr[Boolean] = js.undefined,
    `on-legend-toggle`: js.UndefOr[Boolean] = js.undefined,
    sequence: Int | Double = null,
    speed: Int | Double = null
  ): AnonDelay = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(`on-change`)) __obj.updateDynamic("on-change")(`on-change`.asInstanceOf[js.Any])
    if (!js.isUndefined(`on-legend-toggle`)) __obj.updateDynamic("on-legend-toggle")(`on-legend-toggle`.asInstanceOf[js.Any])
    if (sequence != null) __obj.updateDynamic("sequence")(sequence.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDelay]
  }
}

