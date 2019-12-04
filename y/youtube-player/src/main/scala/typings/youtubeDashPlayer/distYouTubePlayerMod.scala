package typings.youtubeDashPlayer

import org.scalablytyped.runtime.StringDictionary
import typings.youtubeDashPlayer.distTypesMod.EmitterType
import typings.youtubeDashPlayer.distTypesMod.YouTubePlayer
import typings.youtubeDashPlayer.distYouTubePlayerMod.EventHandlerMapType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("youtube-player/dist/YouTubePlayer", JSImport.Namespace)
@js.native
object distYouTubePlayerMod extends js.Object {
  @js.native
  object default extends js.Object {
    def promisifyPlayer(playerAPIReady: js.Promise[YouTubePlayer]): YouTubePlayer = js.native
    def promisifyPlayer(playerAPIReady: js.Promise[YouTubePlayer], strictState: Boolean): YouTubePlayer = js.native
    def proxyEvents(emitter: EmitterType): EventHandlerMapType = js.native
  }
  
  type EventHandlerMapType = StringDictionary[js.Function1[/* event */ js.Object, Unit]]
}

