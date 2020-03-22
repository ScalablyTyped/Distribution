package typings.youtubePlayer

import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ eventType in youtube-player.youtube-player/dist/eventNames.EventType ]:? (event : std.CustomEvent<any>): void} */
trait eventTypeinEventTypeevent extends js.Object {
  var apiChange: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.undefined
  var playbackQualityChange: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.undefined
  var playbackRateChange: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.undefined
  var ready: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.undefined
  var stateChange: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.undefined
  var volumeChange: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.undefined
}

object eventTypeinEventTypeevent {
  @scala.inline
  def apply(
    apiChange: /* event */ CustomEvent[_] => Unit = null,
    error: /* event */ CustomEvent[_] => Unit = null,
    playbackQualityChange: /* event */ CustomEvent[_] => Unit = null,
    playbackRateChange: /* event */ CustomEvent[_] => Unit = null,
    ready: /* event */ CustomEvent[_] => Unit = null,
    stateChange: /* event */ CustomEvent[_] => Unit = null,
    volumeChange: /* event */ CustomEvent[_] => Unit = null
  ): eventTypeinEventTypeevent = {
    val __obj = js.Dynamic.literal()
    if (apiChange != null) __obj.updateDynamic("apiChange")(js.Any.fromFunction1(apiChange))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (playbackQualityChange != null) __obj.updateDynamic("playbackQualityChange")(js.Any.fromFunction1(playbackQualityChange))
    if (playbackRateChange != null) __obj.updateDynamic("playbackRateChange")(js.Any.fromFunction1(playbackRateChange))
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1(ready))
    if (stateChange != null) __obj.updateDynamic("stateChange")(js.Any.fromFunction1(stateChange))
    if (volumeChange != null) __obj.updateDynamic("volumeChange")(js.Any.fromFunction1(volumeChange))
    __obj.asInstanceOf[eventTypeinEventTypeevent]
  }
}

