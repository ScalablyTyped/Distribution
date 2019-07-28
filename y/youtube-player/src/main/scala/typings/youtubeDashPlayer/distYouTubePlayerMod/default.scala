package typings.youtubeDashPlayer.distYouTubePlayerMod

import typings.youtubeDashPlayer.distTypesMod.EmitterType
import typings.youtubeDashPlayer.distTypesMod.YouTubePlayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("youtube-player/dist/YouTubePlayer", JSImport.Default)
@js.native
object default extends js.Object {
  def promisifyPlayer(playerAPIReady: js.Promise[YouTubePlayer]): YouTubePlayer = js.native
  def promisifyPlayer(playerAPIReady: js.Promise[YouTubePlayer], strictState: Boolean): YouTubePlayer = js.native
  def proxyEvents(emitter: EmitterType): EventHandlerMapType = js.native
}

