package typings
package youtubeDashPlayerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_3000 extends js.Object {
  var acceptableStates: js.Tuple3[
    youtubeDashPlayerLib.distConstantsPlayerStatesMod.PlayerStates, 
    youtubeDashPlayerLib.distConstantsPlayerStatesMod.PlayerStates, 
    youtubeDashPlayerLib.distConstantsPlayerStatesMod.PlayerStates
  ]
  var stateChangeRequired: youtubeDashPlayerLib.youtubeDashPlayerLibNumbers.`true`
  // TRICKY: `seekTo` may not cause a state change if no buffering is required.
  var timeout: youtubeDashPlayerLib.youtubeDashPlayerLibNumbers.`3000`
}

object Anon_3000 {
  @scala.inline
  def apply(
    acceptableStates: js.Tuple3[
      youtubeDashPlayerLib.distConstantsPlayerStatesMod.PlayerStates, 
      youtubeDashPlayerLib.distConstantsPlayerStatesMod.PlayerStates, 
      youtubeDashPlayerLib.distConstantsPlayerStatesMod.PlayerStates
    ],
    stateChangeRequired: youtubeDashPlayerLib.youtubeDashPlayerLibNumbers.`true`,
    timeout: youtubeDashPlayerLib.youtubeDashPlayerLibNumbers.`3000`
  ): Anon_3000 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acceptableStates")(acceptableStates)
    __obj.updateDynamic("stateChangeRequired")(stateChangeRequired)
    __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[Anon_3000]
  }
}

