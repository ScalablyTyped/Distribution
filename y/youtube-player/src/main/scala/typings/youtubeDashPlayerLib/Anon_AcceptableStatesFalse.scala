package typings
package youtubeDashPlayerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AcceptableStatesFalse extends js.Object {
  var acceptableStates: js.Tuple2[
    youtubeDashPlayerLib.distConstantsPlayerStatesMod.PlayerStates.ENDED, 
    youtubeDashPlayerLib.distConstantsPlayerStatesMod.PlayerStates.PLAYING
  ]
  var stateChangeRequired: youtubeDashPlayerLib.youtubeDashPlayerLibNumbers.`false`
}

object Anon_AcceptableStatesFalse {
  @scala.inline
  def apply(
    acceptableStates: js.Tuple2[
      youtubeDashPlayerLib.distConstantsPlayerStatesMod.PlayerStates.ENDED, 
      youtubeDashPlayerLib.distConstantsPlayerStatesMod.PlayerStates.PLAYING
    ],
    stateChangeRequired: youtubeDashPlayerLib.youtubeDashPlayerLibNumbers.`false`
  ): Anon_AcceptableStatesFalse = {
    val __obj = js.Dynamic.literal(acceptableStates = acceptableStates, stateChangeRequired = stateChangeRequired)
  
    __obj.asInstanceOf[Anon_AcceptableStatesFalse]
  }
}

