package typings.ytDashPlayer.ytDashPlayerMod

import typings.ytDashPlayer.ytDashPlayerNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YouTubePlayerOptions extends js.Object {
  var annotations: js.UndefOr[Boolean] = js.undefined
  var autoplay: js.UndefOr[Boolean] = js.undefined
  var captions: js.UndefOr[`false` | String] = js.undefined
  var controls: js.UndefOr[Boolean] = js.undefined
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var info: js.UndefOr[Boolean] = js.undefined
  var keyboard: js.UndefOr[Boolean] = js.undefined
  var modestBranding: js.UndefOr[Boolean] = js.undefined
  var playsInline: js.UndefOr[Boolean] = js.undefined
  var related: js.UndefOr[Boolean] = js.undefined
  var timeupdateFrequency: js.UndefOr[Double] = js.undefined
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
    info: js.UndefOr[Boolean] = js.undefined,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    modestBranding: js.UndefOr[Boolean] = js.undefined,
    playsInline: js.UndefOr[Boolean] = js.undefined,
    related: js.UndefOr[Boolean] = js.undefined,
    timeupdateFrequency: Int | Double = null,
    width: Int | Double = null
  ): YouTubePlayerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(annotations)) __obj.updateDynamic("annotations")(annotations)
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (captions != null) __obj.updateDynamic("captions")(captions.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls)
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(info)) __obj.updateDynamic("info")(info)
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (!js.isUndefined(modestBranding)) __obj.updateDynamic("modestBranding")(modestBranding)
    if (!js.isUndefined(playsInline)) __obj.updateDynamic("playsInline")(playsInline)
    if (!js.isUndefined(related)) __obj.updateDynamic("related")(related)
    if (timeupdateFrequency != null) __obj.updateDynamic("timeupdateFrequency")(timeupdateFrequency.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[YouTubePlayerOptions]
  }
}

