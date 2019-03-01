package typings
package youtubeDashPlayerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AcceptableStates extends js.Object {
  var acceptableStates: js.Tuple2[
    youtubeDashPlayerLib.distConstantsPlayerStatesMod.PlayerStates, 
    youtubeDashPlayerLib.distConstantsPlayerStatesMod.PlayerStates
  ]
  var stateChangeRequired: youtubeDashPlayerLib.youtubeDashPlayerLibNumbers.`false`
}

object Anon_AcceptableStates {
  @scala.inline
  def apply(
    acceptableStates: js.Tuple2[
      youtubeDashPlayerLib.distConstantsPlayerStatesMod.PlayerStates, 
      youtubeDashPlayerLib.distConstantsPlayerStatesMod.PlayerStates
    ],
    stateChangeRequired: youtubeDashPlayerLib.youtubeDashPlayerLibNumbers.`false`
  ): Anon_AcceptableStates = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acceptableStates")(acceptableStates)
    __obj.updateDynamic("stateChangeRequired")(stateChangeRequired)
    __obj.asInstanceOf[Anon_AcceptableStates]
  }
}

