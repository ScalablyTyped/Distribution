package typings.youtubePlayer.anon

import typings.youtubePlayer.playerStatesMod.PlayerStates.ENDED
import typings.youtubePlayer.playerStatesMod.PlayerStates.PLAYING
import typings.youtubePlayer.youtubePlayerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateChangeRequired extends js.Object {
  var acceptableStates: js.Tuple2[ENDED, PLAYING]
  var stateChangeRequired: `false`
}

object StateChangeRequired {
  @scala.inline
  def apply(acceptableStates: js.Tuple2[ENDED, PLAYING], stateChangeRequired: `false`): StateChangeRequired = {
    val __obj = js.Dynamic.literal(acceptableStates = acceptableStates.asInstanceOf[js.Any], stateChangeRequired = stateChangeRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateChangeRequired]
  }
}

