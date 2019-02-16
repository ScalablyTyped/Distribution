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

