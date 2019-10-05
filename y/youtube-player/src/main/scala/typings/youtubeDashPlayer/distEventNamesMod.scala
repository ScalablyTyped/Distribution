package typings.youtubeDashPlayer

import typings.youtubeDashPlayer.youtubeDashPlayerStrings.apiChange
import typings.youtubeDashPlayer.youtubeDashPlayerStrings.error
import typings.youtubeDashPlayer.youtubeDashPlayerStrings.playbackQualityChange
import typings.youtubeDashPlayer.youtubeDashPlayerStrings.playbackRateChange
import typings.youtubeDashPlayer.youtubeDashPlayerStrings.ready
import typings.youtubeDashPlayer.youtubeDashPlayerStrings.stateChange
import typings.youtubeDashPlayer.youtubeDashPlayerStrings.volumeChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("youtube-player/dist/eventNames", JSImport.Namespace)
@js.native
object distEventNamesMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.youtubeDashPlayer.youtubeDashPlayerStrings.ready
    - typings.youtubeDashPlayer.youtubeDashPlayerStrings.stateChange
    - typings.youtubeDashPlayer.youtubeDashPlayerStrings.playbackQualityChange
    - typings.youtubeDashPlayer.youtubeDashPlayerStrings.playbackRateChange
    - typings.youtubeDashPlayer.youtubeDashPlayerStrings.error
    - typings.youtubeDashPlayer.youtubeDashPlayerStrings.apiChange
    - typings.youtubeDashPlayer.youtubeDashPlayerStrings.volumeChange
  */
  trait EventType extends js.Object
  
  val default: js.Tuple7[
    ready, 
    stateChange, 
    playbackQualityChange, 
    playbackRateChange, 
    error, 
    apiChange, 
    volumeChange
  ] = js.native
}

