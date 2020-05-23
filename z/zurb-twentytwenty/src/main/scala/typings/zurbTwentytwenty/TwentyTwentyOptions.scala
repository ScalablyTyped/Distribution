package typings.zurbTwentytwenty

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwentyTwentyOptions extends js.Object {
  var after_label: js.UndefOr[String] = js.undefined
  var before_label: js.UndefOr[String] = js.undefined
  var click_to_move: js.UndefOr[Boolean] = js.undefined
  var default_offset_pct: js.UndefOr[Double] = js.undefined
  var move_slider_on_hover: js.UndefOr[Boolean] = js.undefined
  var move_with_handle_only: js.UndefOr[Boolean] = js.undefined
  var no_overlay: js.UndefOr[Boolean] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
}

object TwentyTwentyOptions {
  @scala.inline
  def apply(
    after_label: String = null,
    before_label: String = null,
    click_to_move: js.UndefOr[Boolean] = js.undefined,
    default_offset_pct: js.UndefOr[Double] = js.undefined,
    move_slider_on_hover: js.UndefOr[Boolean] = js.undefined,
    move_with_handle_only: js.UndefOr[Boolean] = js.undefined,
    no_overlay: js.UndefOr[Boolean] = js.undefined,
    orientation: String = null
  ): TwentyTwentyOptions = {
    val __obj = js.Dynamic.literal()
    if (after_label != null) __obj.updateDynamic("after_label")(after_label.asInstanceOf[js.Any])
    if (before_label != null) __obj.updateDynamic("before_label")(before_label.asInstanceOf[js.Any])
    if (!js.isUndefined(click_to_move)) __obj.updateDynamic("click_to_move")(click_to_move.get.asInstanceOf[js.Any])
    if (!js.isUndefined(default_offset_pct)) __obj.updateDynamic("default_offset_pct")(default_offset_pct.get.asInstanceOf[js.Any])
    if (!js.isUndefined(move_slider_on_hover)) __obj.updateDynamic("move_slider_on_hover")(move_slider_on_hover.get.asInstanceOf[js.Any])
    if (!js.isUndefined(move_with_handle_only)) __obj.updateDynamic("move_with_handle_only")(move_with_handle_only.get.asInstanceOf[js.Any])
    if (!js.isUndefined(no_overlay)) __obj.updateDynamic("no_overlay")(no_overlay.get.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwentyTwentyOptions]
  }
}

