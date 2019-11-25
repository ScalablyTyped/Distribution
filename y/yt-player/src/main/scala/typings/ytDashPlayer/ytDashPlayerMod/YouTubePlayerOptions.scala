package typings.ytDashPlayer.ytDashPlayerMod

import typings.ytDashPlayer.ytDashPlayerNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YouTubePlayerOptions extends js.Object {
  /**
    * This parameter indicates whether the player will show video annotations.
    * The default value is true.
    */
  var annotations: js.UndefOr[Boolean] = js.undefined
  /**
    * This parameter indicates whether the initial video will automatically
    * start to play when the player loads. The default value is false.
    */
  var autoplay: js.UndefOr[Boolean] = js.undefined
  /**
    * This parameter indicates whether closed captions should be shown, even if
    * the user has turned captions off. The default behavior is based on user
    * preference.
    */
  var captions: js.UndefOr[`false` | String] = js.undefined
  /**
    * This parameter indicates whether the video player controls are displayed.
    * The default value is true.
    */
  var controls: js.UndefOr[Boolean] = js.undefined
  /**
    * This parameter indicates whether the player will show a fullscreen
    * button. The default value is true.
    */
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  /** This parameter indicates the height of the player. */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * This parameter indicates whether the player will respond to keyboard
    * shortcuts. The default value is true.
    */
  var keyboard: js.UndefOr[Boolean] = js.undefined
  /**
    * This parameter lets you use a YouTube player that does not show a
    * YouTube logo. Even when this option is enabled, a small YouTube text
    * label will still display in the upper-right corner of a paused video
    * when the user's mouse pointer hovers over the player.
    */
  var modestBranding: js.UndefOr[Boolean] = js.undefined
  /**
    * This parameter controls whether videos play inline or fullscreen in an
    * HTML5 player on iOS. The default value is true.
    */
  var playsInline: js.UndefOr[Boolean] = js.undefined
  /**
    * This parameter indicates whether the player should show related videos
    * from other channels
    */
  var related: js.UndefOr[Boolean] = js.undefined
  /**
    * The time between onTimeupdate callbacks, in milliseconds. Default is
    * 1000.
    */
  var timeupdateFrequency: js.UndefOr[Double] = js.undefined
  /**  This parameter indicates the width of the player. */
  var width: js.UndefOr[Double] = js.undefined
}

object YouTubePlayerOptions {
  @scala.inline
  def apply(
    annotations: js.UndefOr[Boolean] = js.undefined,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    captions: `false` | String = null,
    controls: js.UndefOr[Boolean] = js.undefined,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    modestBranding: js.UndefOr[Boolean] = js.undefined,
    playsInline: js.UndefOr[Boolean] = js.undefined,
    related: js.UndefOr[Boolean] = js.undefined,
    timeupdateFrequency: Int | Double = null,
    width: Int | Double = null
  ): YouTubePlayerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(annotations)) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (captions != null) __obj.updateDynamic("captions")(captions.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (!js.isUndefined(modestBranding)) __obj.updateDynamic("modestBranding")(modestBranding.asInstanceOf[js.Any])
    if (!js.isUndefined(playsInline)) __obj.updateDynamic("playsInline")(playsInline.asInstanceOf[js.Any])
    if (!js.isUndefined(related)) __obj.updateDynamic("related")(related.asInstanceOf[js.Any])
    if (timeupdateFrequency != null) __obj.updateDynamic("timeupdateFrequency")(timeupdateFrequency.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[YouTubePlayerOptions]
  }
}

