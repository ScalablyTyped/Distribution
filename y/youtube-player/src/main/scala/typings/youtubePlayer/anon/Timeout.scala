package typings.youtubePlayer.anon

import typings.youtubePlayer.playerStatesMod.PlayerStates.ENDED
import typings.youtubePlayer.playerStatesMod.PlayerStates.PAUSED
import typings.youtubePlayer.playerStatesMod.PlayerStates.PLAYING
import typings.youtubePlayer.youtubePlayerBooleans.`true`
import typings.youtubePlayer.youtubePlayerNumbers.`3000`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Timeout extends js.Object {
  
  var acceptableStates: js.Tuple3[ENDED, PLAYING, PAUSED] = js.native
  
  var stateChangeRequired: `true` = js.native
  
  // TRICKY: `seekTo` may not cause a state change if no buffering is required.
  var timeout: `3000` = js.native
}
object Timeout {
  
  @scala.inline
  def apply(acceptableStates: js.Tuple3[ENDED, PLAYING, PAUSED], stateChangeRequired: `true`, timeout: `3000`): Timeout = {
    val __obj = js.Dynamic.literal(acceptableStates = acceptableStates.asInstanceOf[js.Any], stateChangeRequired = stateChangeRequired.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timeout]
  }
  
  @scala.inline
  implicit class TimeoutOps[Self <: Timeout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAcceptableStates(value: js.Tuple3[ENDED, PLAYING, PAUSED]): Self = this.set("acceptableStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateChangeRequired(value: `true`): Self = this.set("stateChangeRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: `3000`): Self = this.set("timeout", value.asInstanceOf[js.Any])
  }
}
