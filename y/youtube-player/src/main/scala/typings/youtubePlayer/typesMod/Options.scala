package typings.youtubePlayer.typesMod

import typings.youtubePlayer.AnonAutoplay
import typings.youtubePlayer.eventTypeinEventTypeevent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var events: js.UndefOr[eventTypeinEventTypeevent] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var playerVars: js.UndefOr[AnonAutoplay] = js.undefined
  var videoId: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    events: eventTypeinEventTypeevent = null,
    height: Int | Double = null,
    playerVars: AnonAutoplay = null,
    videoId: String = null,
    width: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (playerVars != null) __obj.updateDynamic("playerVars")(playerVars.asInstanceOf[js.Any])
    if (videoId != null) __obj.updateDynamic("videoId")(videoId.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

