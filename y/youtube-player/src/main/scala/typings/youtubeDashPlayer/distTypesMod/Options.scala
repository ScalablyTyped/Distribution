package typings.youtubeDashPlayer.distTypesMod

import typings.youtubeDashPlayer.Anon_0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var events: js.UndefOr[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ eventType in youtube-player.youtube-player/dist/eventNames.EventType ]: (event : std.CustomEvent<any>): void}
    */ typings.youtubeDashPlayer.youtubeDashPlayerStrings.Options with js.Any
  ] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var playerVars: js.UndefOr[Anon_0] = js.undefined
  var videoId: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    events: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ eventType in youtube-player.youtube-player/dist/eventNames.EventType ]: (event : std.CustomEvent<any>): void}
    */ typings.youtubeDashPlayer.youtubeDashPlayerStrings.Options with js.Any = null,
    height: Int | Double = null,
    playerVars: Anon_0 = null,
    videoId: String = null,
    width: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (playerVars != null) __obj.updateDynamic("playerVars")(playerVars)
    if (videoId != null) __obj.updateDynamic("videoId")(videoId)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

