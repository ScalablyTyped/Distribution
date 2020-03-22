package typings.youtubePlayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("youtube-player/dist/FunctionStateMap", JSImport.Namespace)
@js.native
object functionStateMapMod extends js.Object {
  @js.native
  object default extends js.Object {
    var pauseVideo: AnonAcceptableStates = js.native
    var playVideo: AnonStateChangeRequired = js.native
    var seekTo: AnonTimeout = js.native
  }
  
}

