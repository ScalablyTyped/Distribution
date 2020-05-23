package typings.youtubePlayer

import typings.youtubePlayer.anon.AcceptableStates
import typings.youtubePlayer.anon.StateChangeRequired
import typings.youtubePlayer.anon.Timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("youtube-player/dist/FunctionStateMap", JSImport.Namespace)
@js.native
object functionStateMapMod extends js.Object {
  @js.native
  object default extends js.Object {
    var pauseVideo: AcceptableStates = js.native
    var playVideo: StateChangeRequired = js.native
    var seekTo: Timeout = js.native
  }
  
}

