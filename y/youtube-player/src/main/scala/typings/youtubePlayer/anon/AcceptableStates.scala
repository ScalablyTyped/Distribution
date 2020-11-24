package typings.youtubePlayer.anon

import typings.youtubePlayer.playerStatesMod.PlayerStates.ENDED
import typings.youtubePlayer.playerStatesMod.PlayerStates.PAUSED
import typings.youtubePlayer.youtubePlayerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceptableStates extends js.Object {
  
  var acceptableStates: js.Tuple2[ENDED, PAUSED] = js.native
  
  var stateChangeRequired: `false` = js.native
}
object AcceptableStates {
  
  @scala.inline
  def apply(acceptableStates: js.Tuple2[ENDED, PAUSED], stateChangeRequired: `false`): AcceptableStates = {
    val __obj = js.Dynamic.literal(acceptableStates = acceptableStates.asInstanceOf[js.Any], stateChangeRequired = stateChangeRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptableStates]
  }
  
  @scala.inline
  implicit class AcceptableStatesOps[Self <: AcceptableStates] (val x: Self) extends AnyVal {
    
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
    def setAcceptableStates(value: js.Tuple2[ENDED, PAUSED]): Self = this.set("acceptableStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateChangeRequired(value: `false`): Self = this.set("stateChangeRequired", value.asInstanceOf[js.Any])
  }
}
