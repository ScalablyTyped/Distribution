package typings
package youtubeDashPlayerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PauseVideo extends js.Object {
  var pauseVideo: Anon_AcceptableStates
  var playVideo: Anon_AcceptableStates
  var seekTo: Anon_3000
}

object Anon_PauseVideo {
  @scala.inline
  def apply(pauseVideo: Anon_AcceptableStates, playVideo: Anon_AcceptableStates, seekTo: Anon_3000): Anon_PauseVideo = {
    val __obj = js.Dynamic.literal(pauseVideo = pauseVideo, playVideo = playVideo, seekTo = seekTo)
  
    __obj.asInstanceOf[Anon_PauseVideo]
  }
}

