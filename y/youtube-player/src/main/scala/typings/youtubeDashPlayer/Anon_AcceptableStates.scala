package typings.youtubeDashPlayer

import typings.youtubeDashPlayer.distConstantsPlayerStatesMod.PlayerStates.ENDED
import typings.youtubeDashPlayer.distConstantsPlayerStatesMod.PlayerStates.PAUSED
import typings.youtubeDashPlayer.youtubeDashPlayerNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AcceptableStates extends js.Object {
  var acceptableStates: js.Tuple2[ENDED, PAUSED]
  var stateChangeRequired: `false`
}

object Anon_AcceptableStates {
  @scala.inline
  def apply(acceptableStates: js.Tuple2[ENDED, PAUSED], stateChangeRequired: `false`): Anon_AcceptableStates = {
    val __obj = js.Dynamic.literal(acceptableStates = acceptableStates.asInstanceOf[js.Any], stateChangeRequired = stateChangeRequired.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AcceptableStates]
  }
}

