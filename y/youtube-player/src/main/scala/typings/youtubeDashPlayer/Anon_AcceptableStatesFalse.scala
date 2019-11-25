package typings.youtubeDashPlayer

import typings.youtubeDashPlayer.distConstantsPlayerStatesMod.PlayerStates.ENDED
import typings.youtubeDashPlayer.distConstantsPlayerStatesMod.PlayerStates.PLAYING
import typings.youtubeDashPlayer.youtubeDashPlayerNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AcceptableStatesFalse extends js.Object {
  var acceptableStates: js.Tuple2[ENDED, PLAYING]
  var stateChangeRequired: `false`
}

object Anon_AcceptableStatesFalse {
  @scala.inline
  def apply(acceptableStates: js.Tuple2[ENDED, PLAYING], stateChangeRequired: `false`): Anon_AcceptableStatesFalse = {
    val __obj = js.Dynamic.literal(acceptableStates = acceptableStates.asInstanceOf[js.Any], stateChangeRequired = stateChangeRequired.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AcceptableStatesFalse]
  }
}

