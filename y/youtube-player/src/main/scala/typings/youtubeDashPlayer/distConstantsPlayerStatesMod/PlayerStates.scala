package typings.youtubeDashPlayer.distConstantsPlayerStatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlayerStates extends js.Object

@JSImport("youtube-player/dist/constants/PlayerStates", "PlayerStates")
@js.native
object PlayerStates extends js.Object {
  @js.native
  sealed trait BUFFERING extends PlayerStates
  
  @js.native
  sealed trait ENDED extends PlayerStates
  
  @js.native
  sealed trait PAUSED extends PlayerStates
  
  @js.native
  sealed trait PLAYING extends PlayerStates
  
  @js.native
  sealed trait UNSTARTED extends PlayerStates
  
  @js.native
  sealed trait VIDEO_CUED extends PlayerStates
  
}

